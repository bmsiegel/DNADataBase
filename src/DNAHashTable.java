
/**
 * HashTable to hold DNAEntries. Manages Handles
 * 
 * @author Brady Siegel (bmsiegel@vt.edu)
 * @version 2019-05-04
 */
public class DNAHashTable implements HashTableInterface<String, DNAEntry> {
    /**
     * Data container
     */
    private DNAEntry [] data;


    /**
     * @param length
     *            length of hashtable given in command line args
     */
    public DNAHashTable(int length) {
        data = new DNAEntry[length];
    }


    /**
     * Given hashing function to find index
     * 
     * @param s
     *            String to be hashed
     * @param m
     *            length of hashtable
     * @return index of home position for data
     */
    public long sfold(String s, int m) {
        int intLength = s.length() / 4;
        long sum = 0;
        for (int j = 0; j < intLength; j++) {
            char [] c = s.substring(j * 4, (j * 4) + 4).toCharArray();
            long mult = 1;
            for (int k = 0; k < c.length; k++) {
                sum += c[k] * mult;
                mult *= 256;
            }
        }

        char [] c = s.substring(intLength * 4).toCharArray();
        long mult = 1;
        for (int k = 0; k < c.length; k++) {
            sum += c[k] * mult;
            mult *= 256;
        }

        sum = (sum * sum) >> 8;
        return (Math.abs(sum) % m);
    }


    /**
     * 
     * @return length of HashTable
     * 
     */
    public int getLength() {
        return data.length;
    }


    /**
     * @param remove
     *            DNAEntry to be removed
     */
    public void remove(DNAEntry remove) {
        for (int c = 0; c < data.length; c++) {
            if (data[c] != null && remove.equals(data[c])) {
                data[c].setTombstone(true);
            }
        }
    }


    /**
     * 
     * 
     * @param insert
     *            DNAEntry to be inserted
     * @param index
     *            index of insertion
     */
    public void insert(DNAEntry insert, int index) {
        data[index] = insert;
    }


    /**
     * @param hashIndex
     *            Index to check
     * @return true if occupied false if not
     * 
     */
    public boolean isOccupied(long hashIndex) {
        return data[(int)hashIndex] != null && !data[(int)hashIndex]
            .isTombstone();
    }


    /**
     * 
     * @param index
     *            index to get
     * @return DNAEntry at given index
     * 
     */
    public DNAEntry get(int index) {
        return data[index];
    }


    /**
     * @return String representation of hashtable
     */
    public String toString() {
        String result = "";
        for (int c = 0; c < data.length; c++) {
            if (data[c] != null) {
                result += c + ":\t" + data[c] + "\t" + data[c].isTombstone()
                    + "\n";
            }
        }
        return result;
    }
}
