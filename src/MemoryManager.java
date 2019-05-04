import java.util.LinkedList;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * File manager for use with HashTable takes given handles and returns sequences
 * from file
 * 
 * @author Brady Siegel (bmsiegel@vt.edu)
 * @version 2019-05-04
 */
public class MemoryManager {
    /**
     * Container for list of freeblocks
     */
    private LinkedList<FreeBlock> freeBlocks;
    /**
     * File to manage
     */
    private RandomAccessFile raf;


    /**
     * @param fileName
     *            name of file to manage
     */
    public MemoryManager(String fileName) {
        freeBlocks = new LinkedList<FreeBlock>();
        try {
            raf = new RandomAccessFile(new File(fileName), "rw");
            raf.setLength(0);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * @return String list of freeblocks
     */
    public String printFreeBlocks() {
        String result = "Free Block List:\n";
        if (freeBlocks.isEmpty()) {
            return "Free Block List: none";
        }
        for (int c = 0; c < freeBlocks.size() - 1; c++) {
            result += "[Block " + (c + 1) + "] Starting Byte Location: "
                + freeBlocks.get(c).getOffset() + ", Size " + freeBlocks.get(c)
                    .getByteLength() + " bytes\n";
        }
        result += "[Block " + freeBlocks.size() + "] Starting Byte Location: "
            + freeBlocks.get(freeBlocks.size() - 1).getOffset() + ", Size "
            + freeBlocks.get(freeBlocks.size() - 1).getByteLength() + " bytes";
        return result;
    }


    /**
     * @param insert
     *            Sequence to be inserted
     * @param length
     *            length of sequence
     * @return array with Offset and Length
     */
    public int[] insert(String insert, int length) {
        int[] insertInfo = new int[2];
        int byteLength = (length + 4 - 1) / 4;
        try {
            int seekVal = (int)raf.length();
            if (!freeBlocks.isEmpty()) {
                for (int c = 0; c < freeBlocks.size(); c++) {
                    if (freeBlocks.get(c).getByteLength() == byteLength) {
                        seekVal = freeBlocks.get(c).getOffset();
                        freeBlocks.remove(c);
                        break;
                    }
                    else if (freeBlocks.get(c).getByteLength() > byteLength) {
                        seekVal = freeBlocks.get(c).getOffset();
                        freeBlocks.get(c).setOffset(seekVal + byteLength);
                        freeBlocks.get(c).setByteLength(freeBlocks.get(c)
                            .getByteLength() - byteLength);
                        break;
                    }
                }
                fixFreeBlocks();
            }
            raf.seek(seekVal);
            byte[] fileInput = convertToBytes(insert, length);
            insertInfo[1] = (int)raf.getFilePointer();
            raf.write(fileInput);
            insertInfo[0] = length;
        }
        catch (IOException e) {
            System.out.println("MYEH");
        }
        return insertInfo;
    }


    /**
     * @param offset
     *            offset of data
     * @param length
     *            length of data
     * @return DNA Sequence
     */
    public String get(int offset, int length) {
        return convertFromBytes(offset, length);
    }


    /**
     * @param query
     *            offset and length of removal
     */
    public void remove(int[] query) {
        FreeBlock insert = new FreeBlock((int)((query[0] + 4 - 1) / 4),
            query[1]);
        boolean inserted = false;
        if (freeBlocks.isEmpty()) {
            freeBlocks.add(insert);
        }
        else if (freeBlocks.size() == 1) {
            if (freeBlocks.get(0).getOffset() < insert.getOffset()) {
                freeBlocks.add(insert);
            }
            else {
                freeBlocks.add(0, insert);
            }
        }
        else {
            for (int c = 0; c < freeBlocks.size() - 1; c++) {
                if (insert.getOffset() > freeBlocks.get(c).getOffset() && insert
                    .getOffset() < freeBlocks.get(c + 1).getOffset()) {
                    freeBlocks.add(c + 1, insert);
                    inserted = true;
                    break;
                }
                else if (insert.getOffset() < freeBlocks.get(c).getOffset()) {
                    freeBlocks.add(c, insert);
                    inserted = true;
                    break;
                }
            }
            if (!inserted) {
                freeBlocks.add(insert);
            }
        }
        fixFreeBlocks();
    }


    /**
     * Fixes free block list
     */
    private void fixFreeBlocks() {
        for (int c = 0; c < freeBlocks.size() - 1; c++) {
            if (freeBlocks.get(c).getOffset() + freeBlocks.get(c)
                .getByteLength() == freeBlocks.get(c + 1).getOffset()) {
                freeBlocks.set(c, new FreeBlock(freeBlocks.get(c)
                    .getByteLength() + freeBlocks.get(c + 1).getByteLength(),
                    freeBlocks.get(c).getOffset()));
                freeBlocks.remove(c + 1);
                c--;
            }
        }
        try {
            for (int c = 0; c < freeBlocks.size(); c++)
            {
                if (freeBlocks.get(c)
                    .getOffset() + freeBlocks.get(c)
                        .getByteLength() == raf.length()) {
                    long newFileLength = freeBlocks.get(c)
                        .getOffset();
                    freeBlocks.remove(c);
                    raf.setLength(newFileLength);
                    c--;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * @param offset
     *            offset of data in file
     * @param length
     *            length of data
     * @return converted String from file
     */
    private String convertFromBytes(int offset, int length) {
        int strLength = length;
        String result = "";
        short mask = 0x03;
        if (length % 4 != 0) {
            length = length / 4 + 1;
        }
        else {
            length = length / 4;
        }
        byte[] fromFile = new byte[length];
        try {
            raf.seek(offset);
            raf.readFully(fromFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for (int c = 0; c < (length * 4) - strLength; c++) {
            fromFile[length - 1] >>>= 2;
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int c = i * 4; c < 4 + i * 4 && c < strLength; c++) {
                if ((fromFile[i] & mask) == 0) {
                    result += "A";
                }
                else if ((fromFile[i] & mask) == 0x01) {
                    result += "C";
                }
                else if ((fromFile[i] & mask) == 0x02) {
                    result += "G";
                }
                else if ((fromFile[i] & mask) == 0x03) {
                    result += "T";
                }
                fromFile[i] >>>= 2;
            }
        }
        return reverse(result);
    }


    /**
     * @param str
     *            string to be flipped
     * @return reversed string
     */
    private String reverse(String str) {
        String result = "";
        for (int c = str.length(); c >= 1; c--) {
            result += str.substring(c - 1, c);
        }
        return result;
    }


    /**
     * 
     * A = 00, C = 01, G = 10, T = 11
     * 
     * @param str
     *            String to be converted to bytes
     * @param length
     *            length of string
     * @return byte array with converted data
     */
    private byte[] convertToBytes(String str, int length) {
        int strLength = length;
        length = (length + 4 - 1) / 4;
        short[] converted = new short[length];
        short aMask = 0x00;
        short cMask = 0x01;
        short gMask = 0x02;
        short tMask = 0x03;
        for (int i = 0; i < length; i++) {
            for (int c = i * 4; c < 4 + i * 4 && c < strLength; c++) {
                if (str.substring(c, c + 1).equals("A")) {
                    converted[i] <<= 2;
                    converted[i] |= aMask;
                }
                else if (str.substring(c, c + 1).equals("C")) {
                    converted[i] <<= 2;
                    converted[i] |= cMask;
                }
                else if (str.substring(c, c + 1).equals("G")) {
                    converted[i] <<= 2;
                    converted[i] |= gMask;
                }
                else if (str.substring(c, c + 1).equals("T")) {
                    converted[i] <<= 2;
                    converted[i] |= tMask;
                }
            }
        }
        for (int c = 0; c < (length * 4) - strLength; c++) {
            converted[length - 1] <<= 2;
        }
        byte [] byteArray = new byte[converted.length];
        for (int c = 0; c < converted.length; c++) {
            byteArray[c] = (byte)(converted[c] & 0xFF);
        }
        return byteArray;
    }
}
