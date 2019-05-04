
public class FreeBlock {
    private int byteLength;
    private int offset;
    

    public FreeBlock(int byteLength, int offset)
    {
        this.byteLength = byteLength;
        this.offset = offset;
    }

    public int getByteLength() {
        return byteLength;
    }

    public void setByteLength(int byteLength) {
        this.byteLength = byteLength;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    
    public String toString()
    {
        return "(" + offset + ", " + byteLength + ")";
    }
}
