
/**
 * Container class for DNA handle data (Lengths and Offsets)
 * 
 * @author Brady Siegel (bmsiegel@vt.edu)
 * @version 2019-05-04
 */
public class DNAEntry {
    /**
     * Array for id Handle Information {Length, Offset}
     */
    private int[] id;
    /**
     * Array for Sequence Handle Information {Length, Offset}
     */
    private int[] seq;
    /**
     * Flag for whether the hashtable entry is a tombstone (the index has had an
     * entry remove)
     */
    private boolean tombstone;


    /**
     * @param id
     *            Array with id Data
     * @param seq
     *            Array with Seq Data
     */
    public DNAEntry(int[] id, int[] seq) {
        this.id = id;
        this.seq = seq;
        tombstone = false;
    }


    /**
     * @return id Data
     */
    public int[] getid() {
        return id;
    }


    /**
     * @return Sequence Data
     */
    public int[] getSeq() {
        return seq;
    }


    /**
     * @return id Length
     */
    public int getidLength() {
        return id[0];
    }


    /**
     * @param length
     *            new id length
     */
    public void setidLength(int length) {
        this.id[0] = length;
    }


    /**
     * @param length
     *            new Sequence length
     */
    public void setSeqLength(int length) {
        this.seq[1] = length;
    }


    /**
     * @return id offset in file
     */
    public int getidOffset() {
        return id[1];
    }


    /**
     * @param offset
     *            new offset in file
     */
    public void setidOffset(int offset) {
        this.id[1] = offset;
    }


    /**
     * @return Sequence offset in file
     */
    public int getSeqOffset() {
        return seq[1];
    }


    /**
     * @return Sequence length
     */
    public int getSeqLength() {
        return seq[0];
    }


    /**
     * @param offset
     *            new offset in file
     */
    public void setSeqOffset(int offset) {
        this.seq[1] = offset;
    }


    /**
     * @return True if the entry is tombstone, false if not
     */
    public boolean isTombstone() {
        return tombstone;
    }


    /**
     * @param tombstone
     *            flag
     */
    public void setTombstone(boolean tombstone) {
        this.tombstone = tombstone;
    }

}
