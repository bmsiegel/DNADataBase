/**
 * Database helper class for use with DNAHashTable and MemoryManager. Allows the
 * HashTable to have access to the Memory Manager
 * 
 * @author Brady Siegel (bmsiegel@vt.edu)
 * @version 2019-05-04
 */
public class Database {
    /**
     * Memory Manager to keep track of Sequenceids and DNA Sequence
     */
    private MemoryManager memory;
    /**
     * Hash Table to hold handles (file offset, and length of data)
     */
    private DNAHashTable d;


    /**
     * @param fileName
     *            File that will hold the sequences
     * @param length
     *            Length of HashTable
     */
    public Database(String fileName, int length) {
        memory = new MemoryManager(fileName);
        d = new DNAHashTable(length);
    }


    /**
     * @param id
     *            id of DNA Sequence
     * @param seq
     *            DNA Sequence
     * @param length
     *            Length of sequence
     */
    public void insertSequence(String id, String seq, int length) {
        int insertionState = checkInsertion(id);
        if (checkForDupes(id)) {
            System.out.println("SequenceID " + id + " exists");
        }
        else {
            if (insertionState != -2) {
                DNAEntry insert = new DNAEntry(memory.insert(id, id.length()),
                    memory.insert(seq, length));
                d.insert(insert, checkInsertion(id));
            }
            else {
                System.out.println("Bucket full.Sequence " + seq
                    + " could not be inserted");
            }
        }
    }


    /**
     * @param id
     *            Sequenceid
     */
    public void removeSequence(String id) {
        DNAEntry dna = findid(id);
        if (dna != null) {
            d.remove(dna);
            String seq = memory.get(dna.getSeqOffset(), dna.getSeqLength());
            memory.remove(dna.getid());
            memory.remove(dna.getSeq());
            System.out.println("Sequence Removed " + id + ":\n" + seq);
        }
        else {
            System.out.println("SequenceID " + id + " not found");
        }
    }


    /**
     * @param id
     *            Sequenceid
     */
    public void findSequence(String id) {
        DNAEntry dna = findid(id);
        if (dna != null) {
            System.out.println("Sequence Found: " + memory.get(dna
                .getSeqOffset(), dna.getSeqLength()));
        }
        else {
            System.out.println("SequenceID " + id + " not found");
        }
    }


    /**
     * Prints database to standard output
     */
    public void printDB() {
        System.out.println("Sequence IDs:");
        for (int c = 0; c < d.getLength(); c++) {
            if (d.isOccupied(c)) {
                System.out.println(memory.get(d.get(c).getidOffset(), d.get(c)
                    .getidLength()) + ": hash slot [" + c + "]");
            }
        }
        System.out.println(memory.printFreeBlocks());
    }


    /**
     * 
     * @param id
     *            id to check for in hash table
     * @return true if duplicates exist, false if not
     */
    private boolean checkForDupes(String id) {
        int index = (int)d.sfold(id, d.getLength());
        int bucketNum = index / 32;
        int maxIndex = 31 + bucketNum * 32;
        int minIndex = bucketNum * 32;
        for (int c = 0; c < d.getLength(); c++) {
            String currentid = "";
            if (d.get(index) != null && d.get(index).isTombstone()) {
                if (index == maxIndex) {
                    index = minIndex;
                }
                else {
                    index++;
                }
                continue;
            }
            else if (d.get(index) == null) {
                return false;
            }
            else {
                currentid = memory.get(d.get(index).getidOffset(), d.get(index)
                    .getidLength());
                if (currentid.equals(id)) {
                    return true;
                }
                if (index == maxIndex) {
                    index = minIndex;
                }
                else {
                    index++;
                }
            }
        }
        return false;
    }


    /**
     * @param id
     *            Sequence id
     * @return integer where the sequence handle can be stored, -1 when the
     *         bucket is full
     */
    private int checkInsertion(String id) {
        long homePosition = d.sfold(id, d.getLength());
        int bucketNum = (int)(homePosition / 32);
        int maxIndex = 31 + bucketNum * 32;
        int minIndex = bucketNum * 32;
        int hashIndex = (int)homePosition;
        for (int c = 0; c < 32; c++) {
            if (!d.isOccupied(hashIndex)) {
                return hashIndex;
            }
            if (hashIndex == maxIndex) {
                hashIndex = minIndex;
            }
            else {
                hashIndex++;
            }
        }
        return -1;
    }


    /**
     * @param id
     *            Sequenceid
     * @return DNAEntry object that holds the location of the id and sequence,
     *         or null if not found
     */
    private DNAEntry findid(String id) {
        int index = (int)d.sfold(id, d.getLength());
        int bucketNum = index / 32;
        int maxIndex = 31 + bucketNum * 32;
        int minIndex = bucketNum * 32;
        for (int c = 0; c < d.getLength(); c++) {
            String currentid = "";
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
                currentid = memory.get(d.get(index).getidOffset(), d.get(index)
                    .getidLength());
                if (currentid.equals(id)) {
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
