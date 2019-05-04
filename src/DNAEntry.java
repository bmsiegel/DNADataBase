
public class DNAEntry {
    private int[] ID;
    private int[] seq;
    private boolean tombstone;


    public DNAEntry(int[] ID, int[] Seq) {
        this.ID = ID;
        this.seq = Seq;
        tombstone = false;
    }


    public int[] getID() {
        return ID;
    }


    public int[] getSeq() {
        return seq;
    }


    public int getIDLength() {
        return ID[0];
    }


    public void setIDLength(int length) {
        this.ID[0] = length;
    }


    public void setSeqLength(int length) {
        this.seq[1] = length;
    }


    public int getIDOffset() {
        return ID[1];
    }


    public void setIDOffset(int offset) {
        this.ID[1] = offset;
    }


    public int getSeqOffset() {
        return seq[1];
    }


    public int getSeqLength() {
        return seq[0];
    }


    public void setSeqOffset(int offset) {
        this.seq[1] = offset;
    }


    public boolean isTombstone() {
        return tombstone;
    }


    public void setTombstone(boolean tombstone) {
        this.tombstone = tombstone;
    }


    public boolean equals(DNAEntry d) {
        if (getIDOffset() == d.getIDOffset() && getSeqOffset() == d
            .getSeqOffset()) {
            if (getIDLength() == d.getIDLength() && getSeqLength() == d
                .getSeqLength()) {
                return true;
            }
        }
        return false;
    }

}
