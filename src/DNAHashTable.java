
public class DNAHashTable implements HashTableInterface<String, DNAEntry> {
    private DNAEntry data[];


    public DNAHashTable(int length) {
        data = new DNAEntry[length];
    }


    public long sfold(String s, int M) {
        int intLength = s.length() / 4;
        long sum = 0;
        for (int j = 0; j < intLength; j++) {
            char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
            long mult = 1;
            for (int k = 0; k < c.length; k++) {
                sum += c[k] * mult;
                mult *= 256;
            }
        }

        char c[] = s.substring(intLength * 4).toCharArray();
        long mult = 1;
        for (int k = 0; k < c.length; k++) {
            sum += c[k] * mult;
            mult *= 256;
        }

        sum = (sum * sum) >> 8;
        return (Math.abs(sum) % M);
    }


    public int getLength() {
        return data.length;
    }


    public void remove(DNAEntry remove) {
        for (int c = 0; c < data.length; c++) {
            if (data[c] != null && remove.equals(data[c])) {
                data[c].setTombstone(true);
            }
        }
    }


    public void insert(DNAEntry insert, int index) {
        data[index] = insert;
    }


    public boolean isOccupied(long hashIndex) {
        return data[(int)hashIndex] != null && !data[(int)hashIndex]
            .isTombstone();
    }


    public DNAEntry get(int index) {
        return data[index];
    }


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
