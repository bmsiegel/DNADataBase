
/**
 * Container for freeBlock information. Holds length in bytes of free block and
 * offset in file
 * 
 * @author Brady Siegel (bmsiegel@vt.edu)
 * @version 2019-05-04
 */
public class FreeBlock {
    /**
     * Length of block in bytes
     */
    private int byteLength;
    /**
     * offset of block in file
     */
    private int offset;


    /**
     * @param byteLength
     *            length of block in bytes
     * @param offset
     *            offset of block in file
     */
    public FreeBlock(int byteLength, int offset) {
        this.byteLength = byteLength;
        this.offset = offset;
    }


    /**
     * @return byte length of free block
     */
    public int getByteLength() {
        return byteLength;
    }


    /**
     * @param byteLength
     *            new byte length
     */
    public void setByteLength(int byteLength) {
        this.byteLength = byteLength;
    }


    /**
     * @return offset of free block in file
     */
    public int getOffset() {
        return offset;
    }


    /**
     * @param offset
     *            new offset in file
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }


    /**
     * @return string representation of FreeBlock object
     */
    public String toString() {
        return "(" + offset + ", " + byteLength + ")";
    }
}
