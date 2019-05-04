import student.TestCase;

/**
 * Test Class for DNA Database 
 *
 * @author Brady Siegel (bmsiegel@vt.edu)
 * @version 2019-05-04
 */
public class DatabaseTests extends TestCase {
    /**
     * Driver class object
     */
    private DNAdbase d = new DNAdbase();


    /**
     * Simpler Test for Database
     */
    public void testMain() {
        String [] args = { "P4SampleInput.txt", "hash.bin", "64",
            "biofile.bin" };
        d.main(args);
        String history = systemOut().getHistory();
        assertEquals(history, "Sequence IDs:\n" + "AAAAA: hash slot [6]\n"
            + "Free Block List: none\n" + "Sequence IDs:\n"
            + "AAAAA: hash slot [6]\n" + "AAAA: hash slot [18]\n"
            + "Free Block List: none\n" + "Sequence IDs:\n"
            + "AAAAA: hash slot [6]\n" + "AAAA: hash slot [18]\n"
            + "AAA: hash slot [19]\n" + "Free Block List: none\n"
            + "Sequence IDs:\n" + "TTTTTTTTTTAAAAACCCA: hash slot [0]\n"
            + "AAAAA: hash slot [6]\n" + "AAAA: hash slot [18]\n"
            + "AAA: hash slot [19]\n" + "Free Block List: none\n"
            + "Sequence IDs:\n" + "TTTTTTTTTTAAAAACCCA: hash slot [0]\n"
            + "AAAAA: hash slot [6]\n" + "AAAA: hash slot [18]\n"
            + "AAA: hash slot [19]\n" + "TCATATCTATCCAAAAAAAA: hash slot [62]\n"
            + "Free Block List: none\n" + "Sequence IDs:\n"
            + "TTTTTTTTTTAAAAACCCA: hash slot [0]\n" + "AAAAA: hash slot [6]\n"
            + "AAAA: hash slot [18]\n" + "AAA: hash slot [19]\n"
            + "TCATATCTATCCAAAAAAAA: hash slot [62]\n"
            + "TCATATCTATCCAAAAAAA: hash slot [63]\n"
            + "Free Block List: none\n" + "Sequence IDs:\n"
            + "TTTTTTTTTTAAAAACCCA: hash slot [0]\n" + "AAAAA: hash slot [6]\n"
            + "AAAA: hash slot [18]\n" + "AAA: hash slot [19]\n"
            + "TCATATCTATCCAAAAAA: hash slot [32]\n"
            + "TCATATCTATCCAAAAAAAA: hash slot [62]\n"
            + "TCATATCTATCCAAAAAAA: hash slot [63]\n"
            + "Free Block List: none\n" + "Sequence Removed AAAAA:\n"
            + "AAAATTTTCCCCGGGGAAAACCCCGGGGTTTTAAAATTTT\n"
            + "Sequence Removed AAA:\n" + "AAAA\n" + "Sequence Removed AAAA:\n"
            + "AAAATTTTCCCCGGGGAAAACCCCGGGGTTTTAAAATTTT\n" + "Sequence IDs:\n"
            + "TTTTTTTTTTAAAAACCCA: hash slot [0]\n"
            + "TCATATCTATCCAAAAAA: hash slot [32]\n"
            + "TCATATCTATCCAAAAAAAA: hash slot [62]\n"
            + "TCATATCTATCCAAAAAAA: hash slot [63]\n" + "Free Block List:\n"
            + "[Block 1] Starting Byte Location: 0, Size 25 bytes\n"
            + "SequenceID AAAAA not found\n"
            + "Sequence Found: CCTTTTCCCCGGGGAAAACCCCGGGGTTTTAAAATTTT\n");
    }


    /**
     * Harder test for Database
     */
    public void testHarder() {
        String[] args = { "Harder.txt", "b", "32", "biofile.bin" };
        d.main(args);
        String output = systemOut().getHistory();
        assertEquals(output, "Sequence IDs:\n" + 
            "AAAA: hash slot [18]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "AAAA: hash slot [18]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "AAAA: hash slot [18]\n" + 
            "GGGG: hash slot [21]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "AAAA: hash slot [18]\n" + 
            "GGGG: hash slot [21]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "GGGG: hash slot [21]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "TTTT: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAAA: hash slot [18]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List: none\n" + 
            "Sequence Removed AAAA:\n" + 
            "AAAA\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCC: hash slot [3]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 2 bytes\n" + 
            "Sequence Removed CCCC:\n" + 
            "CCCC\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "GGGG: hash slot [21]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 4 bytes\n" + 
            "Sequence Removed GGGG:\n" + 
            "GGGG\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTT: hash slot [27]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 6 bytes\n" + 
            "Sequence Removed TTTT:\n" + 
            "TTTT\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAAC: hash slot [19]\n" + 
            "AAAG: hash slot [20]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 8 bytes\n" + 
            "Sequence Removed AAAC:\n" + 
            "AAAC\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAAG: hash slot [20]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 10 bytes\n" + 
            "Sequence Removed AAAG:\n" + 
            "AAAG\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAAT: hash slot [22]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 12 bytes\n" + 
            "Sequence Removed AAAT:\n" + 
            "AAAT\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCA: hash slot [4]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 14 bytes\n" + 
            "Sequence Removed CCCA:\n" + 
            "CCCA\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCG: hash slot [5]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 16 bytes\n" + 
            "Sequence Removed CCCG:\n" + 
            "CCCG\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "CCCT: hash slot [6]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 18 bytes\n" + 
            "Sequence Removed CCCT:\n" + 
            "CCCT\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "GGGA: hash slot [23]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 20 bytes\n" + 
            "Sequence Removed GGGA:\n" + 
            "GGGA\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "GGGC: hash slot [24]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 22 bytes\n" + 
            "Sequence Removed GGGC:\n" + 
            "GGGC\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "GGGT: hash slot [25]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 24 bytes\n" + 
            "Sequence Removed GGGT:\n" + 
            "GGGT\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTA: hash slot [28]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 26 bytes\n" + 
            "Sequence Removed TTTA:\n" + 
            "TTTA\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTC: hash slot [29]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 28 bytes\n" + 
            "Sequence Removed TTTC:\n" + 
            "TTTC\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AACC: hash slot [26]\n" + 
            "TTTG: hash slot [30]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 30 bytes\n" + 
            "Sequence Removed TTTG:\n" + 
            "TTTG\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AACC: hash slot [26]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 32 bytes\n" + 
            "Sequence Removed AACC:\n" + 
            "AACC\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "AAGG: hash slot [31]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 34 bytes\n" + 
            "Sequence Removed AAGG:\n" + 
            "AAGG\n" + 
            "Sequence IDs:\n" + 
            "AATT: hash slot [0]\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 36 bytes\n" + 
            "Sequence Removed AATT:\n" + 
            "AATT\n" + 
            "Sequence IDs:\n" + 
            "AACA: hash slot [1]\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 38 bytes\n" + 
            "Sequence Removed AACA:\n" + 
            "AACA\n" + 
            "Sequence IDs:\n" + 
            "AACG: hash slot [2]\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 40 bytes\n" + 
            "Sequence Removed AACG:\n" + 
            "AACG\n" + 
            "Sequence IDs:\n" + 
            "AACT: hash slot [7]\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 42 bytes\n" + 
            "Sequence Removed AACT:\n" + 
            "AACT\n" + 
            "Sequence IDs:\n" + 
            "AAGC: hash slot [8]\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 44 bytes\n" + 
            "Sequence Removed AAGC:\n" + 
            "AAGC\n" + 
            "Sequence IDs:\n" + 
            "AATC: hash slot [9]\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 46 bytes\n" + 
            "Sequence Removed AATC:\n" + 
            "AATC\n" + 
            "Sequence IDs:\n" + 
            "CCAA: hash slot [10]\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 48 bytes\n" + 
            "Sequence Removed CCAA:\n" + 
            "CCAA\n" + 
            "Sequence IDs:\n" + 
            "CCGG: hash slot [11]\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 50 bytes\n" + 
            "Sequence Removed CCGG:\n" + 
            "CCGG\n" + 
            "Sequence IDs:\n" + 
            "CCTT: hash slot [12]\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 52 bytes\n" + 
            "Sequence Removed CCTT:\n" + 
            "CCTT\n" + 
            "Sequence IDs:\n" + 
            "CCAC: hash slot [13]\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 54 bytes\n" + 
            "Sequence Removed CCAC:\n" + 
            "CCAC\n" + 
            "Sequence IDs:\n" + 
            "CCAG: hash slot [14]\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 56 bytes\n" + 
            "Sequence Removed CCAG:\n" + 
            "CCAG\n" + 
            "Sequence IDs:\n" + 
            "CCAT: hash slot [15]\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 58 bytes\n" + 
            "Sequence Removed CCAT:\n" + 
            "CCAT\n" + 
            "Sequence IDs:\n" + 
            "GTGA: hash slot [16]\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 60 bytes\n" + 
            "Sequence Removed GTGA:\n" + 
            "GTGA\n" + 
            "Sequence IDs:\n" + 
            "CTGA: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 62 bytes\n" + 
            "Sequence Removed CTGA:\n" + 
            "CTGA\n" + 
            "Sequence IDs:\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "AAGGTTCCAA: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "SequenceID AAGG not found\n" + 
            "Sequence IDs:\n" + 
            "AAGGTTCCAA: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence Removed AAGGTTCCAA:\n" + 
            "AAAAAAAAAA\n" + 
            "Sequence IDs:\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTT: hash slot [8]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTT: hash slot [8]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTT: hash slot [8]\n" + 
            "TGATCA: hash slot [9]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence Removed TGATCA:\n" + 
            "TGATCA\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List: none\n" + 
            "Sequence Removed CCCC:\n" + 
            "CGATGC\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 70, Size 3 bytes\n" + 
            "Sequence Removed ATGC:\n" + 
            "AGTCGTC\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 64, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "SequenceID TGATCA not found\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 64, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTT: hash slot [8]\n" + 
            "TGATCA: hash slot [9]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 70, Size 3 bytes\n" + 
            "Sequence Found: AGTG\n" + 
            "SequenceID AGTG not found\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTT: hash slot [8]\n" + 
            "TGATCA: hash slot [9]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 70, Size 3 bytes\n" + 
            "Sequence Removed TGATCA:\n" + 
            "AGTG\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 64, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "Sequence Removed TTTTTTTTTTTTTTTT:\n" + 
            "TTTTTTTTTTTTTTTT\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 56, Size 11 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "AGTC: hash slot [30]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 60, Size 7 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "SequenceID AGTCA not found\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "AGTC: hash slot [30]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 60, Size 7 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "Sequence Removed TTAC:\n" + 
            "TTAC\n" + 
            "Sequence Removed AGTC:\n" + 
            "AGTCTGACA\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTT"
            + "TTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 56, Size 11 bytes\n" + 
            "Sequence Removed ACGTACGT:\n" + 
            "TGCATGCA\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTT"
            + "TTTTTTTTTTTT"
            + "TTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTT"
            + "TTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 4 bytes\n" + 
            "[Block 2] Starting Byte Location: 56, Size 11 bytes\n" + 
            "SequenceID ACGTACGT not found\n" + 
            "Sequence Removed GTCA:\n" + 
            "AGTCA\n" + 
            "Sequence Removed TTTTTTTTTTTTTT"
            + "TTTTTTTTTTTT"
            + "TTTTTTTTTTTTT"
            + "TTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTT"
            + "TTTTTTT:\n" + 
            "TTTTTTTTTTTT"
            + "TTTTTTTTTTT"
            + "TTTTTTTTTT"
            + "TTTTTTTTTTTT"
            + "TTTTTTTTTTTT"
            + "TTTTTTTTTTTTT"
            + "TTTTTTTTTTTTT"
            + "TTTTTTTTTTTTT"
            + "TTTTTTTT\n" + 
            "Sequence IDs:\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTT"
            + "TTTTTTTT"
            + "TTTTTTTTT"
            + "TTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTT"
            + "TTAT: hash slot [17]\n" + 
            "Free Block List: none\n" + 
            "Sequence Removed TTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTTTTTTTTTTTTTTTTTTT"
            + "TTTTTTTTTAT:\n" + 
            "TTTTATGTGTGTGTGTGTGTGTGTGAC\n" + 
            "Sequence IDs:\n" + 
            "Free Block List: none\n" + 
            "SequenceID GATACA not found\n" + 
            "SequenceID GTGGTGG not found\n");
    }
}