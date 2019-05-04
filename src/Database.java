import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Database {
    private MemoryManager memory;
    private DNAHashTable d;

    public Database(String fileName, int length) throws FileNotFoundException, UnsupportedEncodingException {
        memory = new MemoryManager(fileName);
        d = new DNAHashTable(length);
    }


    public void insertSequence(String ID, String seq, int length) {
        int insertionState = checkInsertion(ID);
        if (insertionState != -1 && insertionState != -2) {
            DNAEntry insert = new DNAEntry(memory.insert(ID, ID.length()),
                memory.insert(seq, length));
            d.insert(insert, checkInsertion(ID));
        }
        else if (insertionState == -1) {
            System.out.println("SequenceID " + ID + " exists");
        }
        else {
            System.out.println("Bucket full.Sequence " + seq
                + " could not be inserted");
        }
    }


    public void removeSequence(String ID) {
        DNAEntry dna = findID(ID);
        if (dna != null) {
            d.remove(dna);
            String seq = memory.get(dna.getSeqOffset(), dna.getSeqLength());
            memory.remove(dna.getID());
            memory.remove(dna.getSeq());
            System.out.println("Sequence Removed " + ID + ":\n" + seq);
        }
        else {
            System.out.println("SequenceID " + ID + " not found");
        }
    }


    public void findSequence(String ID) {
        DNAEntry dna = findID(ID);
        if (dna != null) {
            System.out.println("Sequence Found: " + memory.get(dna
                .getSeqOffset(), dna.getSeqLength()));
        }
        else {
            System.out.println("SequenceID " + ID + " not found");
        }
    }


    public void printDB() {
        System.out.println("Sequence IDs:");
        for (int c = 0; c < d.getLength(); c++) {
            if (d.isOccupied(c)) {
                System.out.println(memory.get(d.get(c).getIDOffset(), d.get(c)
                    .getIDLength()) + ": hash slot [" + c + "]");
            }
        }
        System.out.println(memory.printFreeBlocks());
    }


    private int checkInsertion(String ID) {
        long homePosition = d.sfold(ID, d.getLength());
        int bucketNum = (int)(homePosition / 32);
        int maxIndex = 31 + bucketNum * 32;
        int minIndex = bucketNum * 32;
        int hashIndex = (int)homePosition;
        boolean canInsert = true;
        for (int c = 0; c < 32; c++) {
            if (!d.isOccupied(hashIndex)) {
                return hashIndex;
            }
            else {
                String currentID = memory.get(d.get(hashIndex).getIDOffset(), d
                    .get(hashIndex).getIDLength());
                canInsert = !currentID.equals(ID);
                if (!canInsert) {
                    return -1;
                }
            }
            if (hashIndex == maxIndex) {
                hashIndex = minIndex;
            }
            else {
                hashIndex++;
            }
        }
        return -2;
    }


    private DNAEntry findID(String ID) {
        int index = (int)d.sfold(ID, d.getLength());
        int bucketNum = index / 32;
        int maxIndex = 31 + bucketNum * 32;
        int minIndex = bucketNum * 32;
        for (int c = 0; c < d.getLength(); c++) {
            String currentID = "";
            if (d.get(index) != null && d.get(index).isTombstone()) {
                if (index == maxIndex) {
                    index = minIndex;
                }
                else {
                    index++;
                }
                continue;
            }
            else if (!d.isOccupied(index)) {
                return null;
            }
            else {
                currentID = memory.get(d.get(index).getIDOffset(), d.get(index)
                    .getIDLength());
                if (currentID.equals(ID)) {
                    return d.get(index);
                }
                if (index == maxIndex) {
                    index = minIndex;
                }
                else {
                    index++;
                }
            }
        }
        return null;
    }
}
