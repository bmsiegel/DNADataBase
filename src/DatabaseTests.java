import student.TestCase;

public class DatabaseTests extends TestCase {
    DNAdbase d = new DNAdbase();


    public void testMain() {
        String args[] = { "P4SampleInput.txt", "hash.bin", "64",
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
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 64 bytes\n" + 
            "Sequence IDs:\n" + 
            "AAGGTTCCAA: hash slot [26]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 6, Size 58 bytes\n" + 
            "SequenceID AAGG not found\n" + 
            "Sequence IDs:\n" + 
            "AAGGTTCCAA: hash slot [26]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 6, Size 58 bytes\n" + 
            "Sequence Removed AAGGTTCCAA:\n" + 
            "AAAAAAAAAA\n" + 
            "Sequence IDs:\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 64 bytes\n" + 
            "Sequence IDs:\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 4, Size 60 bytes\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 56, Size 8 bytes\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List: none\n" + 
            "Sequence IDs:\n" + 
            "CCCC: hash slot [3]\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
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
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence Removed CCCC:\n" + 
            "CGATGC\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ATGC: hash slot [24]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence Removed ATGC:\n" + 
            "AGTCGTC\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 64, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 3] Starting Byte Location: 75, Size 4 bytes\n" + 
            "SequenceID TGATCA not found\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 64, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 3] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "TGATCA: hash slot [9]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence Found: AGTG\n" + 
            "SequenceID AGTG not found\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "TGATCA: hash slot [9]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence Removed TGATCA:\n" + 
            "AGTG\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTT: hash slot [7]\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 64, Size 3 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 3] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence Removed TTTTTTTTTTTTTTTT:\n" + 
            "TTTTTTTTTTTTTTTT\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 56, Size 11 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 3] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "AGTC: hash slot [30]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 60, Size 7 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 3] Starting Byte Location: 75, Size 4 bytes\n" + 
            "SequenceID AGTCA not found\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "TTAC: hash slot [27]\n" + 
            "AGTC: hash slot [30]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 60, Size 7 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 3 bytes\n" + 
            "[Block 3] Starting Byte Location: 75, Size 4 bytes\n" + 
            "Sequence Removed TTAC:\n" + 
            "TTAC\n" + 
            "Sequence Removed AGTC:\n" + 
            "AGTCTGACA\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "ACGTACGT: hash slot [26]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 56, Size 11 bytes\n" + 
            "[Block 2] Starting Byte Location: 70, Size 9 bytes\n" + 
            "Sequence Removed ACGTACGT:\n" + 
            "TGCATGCA\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]\n" + 
            "GTCA: hash slot [11]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 4 bytes\n" + 
            "[Block 2] Starting Byte Location: 56, Size 11 bytes\n" + 
            "[Block 3] Starting Byte Location: 70, Size 9 bytes\n" + 
            "SequenceID ACGTACGT not found\n" + 
            "Sequence Removed GTCA:\n" + 
            "AGTCA\n" + 
            "Sequence Removed TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT\n" + 
            "Sequence IDs:\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 79 bytes\n" + 
            "Sequence IDs:\n" + 
            "TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTAT: hash slot [17]\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 60, Size 19 bytes\n" + 
            "Sequence Removed TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTAT:\n" + 
            "TTTTATGTGTGTGTGTGTGTGTGTGAC\n" + 
            "Sequence IDs:\n" + 
            "Free Block List:\n" + 
            "[Block 1] Starting Byte Location: 0, Size 79 bytes\n" + 
            "SequenceID GATACA not found\n" + 
            "SequenceID GTGGTGG not found\n");
    }

    
//    Sequence IDs:
//        AAAA: hash slot [18]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        AAAA: hash slot [18]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        AAAA: hash slot [18]
//        GGGG: hash slot [21]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        AAAA: hash slot [18]
//        GGGG: hash slot [21]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        GGGG: hash slot [21]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        TTTT: hash slot [27]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAAA: hash slot [18]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List: none
//        Sequence Removed AAAA:
//        AAAA
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCC: hash slot [3]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 2 bytes
//        Sequence Removed CCCC:
//        CCCC
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        GGGG: hash slot [21]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 4 bytes
//        Sequence Removed GGGG:
//        GGGG
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTT: hash slot [27]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 6 bytes
//        Sequence Removed TTTT:
//        TTTT
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAAC: hash slot [19]
//        AAAG: hash slot [20]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 8 bytes
//        Sequence Removed AAAC:
//        AAAC
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAAG: hash slot [20]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 10 bytes
//        Sequence Removed AAAG:
//        AAAG
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAAT: hash slot [22]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 12 bytes
//        Sequence Removed AAAT:
//        AAAT
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCA: hash slot [4]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 14 bytes
//        Sequence Removed CCCA:
//        CCCA
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCG: hash slot [5]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 16 bytes
//        Sequence Removed CCCG:
//        CCCG
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        CCCT: hash slot [6]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 18 bytes
//        Sequence Removed CCCT:
//        CCCT
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        GGGA: hash slot [23]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 20 bytes
//        Sequence Removed GGGA:
//        GGGA
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        GGGC: hash slot [24]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 22 bytes
//        Sequence Removed GGGC:
//        GGGC
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        GGGT: hash slot [25]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 24 bytes
//        Sequence Removed GGGT:
//        GGGT
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AACC: hash slot [26]
//        TTTA: hash slot [28]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 26 bytes
//        Sequence Removed TTTA:
//        TTTA
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AACC: hash slot [26]
//        TTTC: hash slot [29]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 28 bytes
//        Sequence Removed TTTC:
//        TTTC
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AACC: hash slot [26]
//        TTTG: hash slot [30]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 30 bytes
//        Sequence Removed TTTG:
//        TTTG
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AACC: hash slot [26]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 32 bytes
//        Sequence Removed AACC:
//        AACC
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        AAGG: hash slot [31]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 34 bytes
//        Sequence Removed AAGG:
//        AAGG
//        Sequence IDs:
//        AATT: hash slot [0]
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 36 bytes
//        Sequence Removed AATT:
//        AATT
//        Sequence IDs:
//        AACA: hash slot [1]
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 38 bytes
//        Sequence Removed AACA:
//        AACA
//        Sequence IDs:
//        AACG: hash slot [2]
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 40 bytes
//        Sequence Removed AACG:
//        AACG
//        Sequence IDs:
//        AACT: hash slot [7]
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 42 bytes
//        Sequence Removed AACT:
//        AACT
//        Sequence IDs:
//        AAGC: hash slot [8]
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 44 bytes
//        Sequence Removed AAGC:
//        AAGC
//        Sequence IDs:
//        AATC: hash slot [9]
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 46 bytes
//        Sequence Removed AATC:
//        AATC
//        Sequence IDs:
//        CCAA: hash slot [10]
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 48 bytes
//        Sequence Removed CCAA:
//        CCAA
//        Sequence IDs:
//        CCGG: hash slot [11]
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 50 bytes
//        Sequence Removed CCGG:
//        CCGG
//        Sequence IDs:
//        CCTT: hash slot [12]
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 52 bytes
//        Sequence Removed CCTT:
//        CCTT
//        Sequence IDs:
//        CCAC: hash slot [13]
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 54 bytes
//        Sequence Removed CCAC:
//        CCAC
//        Sequence IDs:
//        CCAG: hash slot [14]
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 56 bytes
//        Sequence Removed CCAG:
//        CCAG
//        Sequence IDs:
//        CCAT: hash slot [15]
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 58 bytes
//        Sequence Removed CCAT:
//        CCAT
//        Sequence IDs:
//        GTGA: hash slot [16]
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 60 bytes
//        Sequence Removed GTGA:
//        GTGA
//        Sequence IDs:
//        CTGA: hash slot [17]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 62 bytes
//        Sequence Removed CTGA:
//        CTGA
//        Sequence IDs:
//        Free Block List: none
//        Sequence IDs:
//        AAGGTTCCAA: hash slot [26]
//        Free Block List: none
//        SequenceID AAGG not found
//        Sequence IDs:
//        AAGGTTCCAA: hash slot [26]
//        Free Block List: none
//        Sequence Removed AAGGTTCCAA:
//        AAAAAAAAAA
//        Sequence IDs:
//        Free Block List: none
//        Sequence IDs:
//        ACGTACGT: hash slot [26]
//        Free Block List: none
//        Sequence IDs:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        ACGTACGT: hash slot [26]
//        Free Block List: none
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        ACGTACGT: hash slot [26]
//        Free Block List: none
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        ATGC: hash slot [24]
//        ACGTACGT: hash slot [26]
//        Free Block List: none
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ATGC: hash slot [24]
//        ACGTACGT: hash slot [26]
//        Free Block List: none
//        Sequence IDs:
//        CCCC: hash slot [3]
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        TGATCA: hash slot [9]
//        GTCA: hash slot [11]
//        ATGC: hash slot [24]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List: none
//        Sequence Removed TGATCA:
//        TGATCA
//        Sequence IDs:
//        CCCC: hash slot [3]
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ATGC: hash slot [24]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List: none
//        Sequence Removed CCCC:
//        CGATGC
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ATGC: hash slot [24]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List:
//        [Block 1] Starting Byte Location: 70, Size 3 bytes
//        Sequence Removed ATGC:
//        AGTCGTC
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List:
//        [Block 1] Starting Byte Location: 64, Size 3 bytes
//        [Block 2] Starting Byte Location: 70, Size 3 bytes
//        SequenceID TGATCA not found
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List:
//        [Block 1] Starting Byte Location: 64, Size 3 bytes
//        [Block 2] Starting Byte Location: 70, Size 3 bytes
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        TGATCA: hash slot [9]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List:
//        [Block 1] Starting Byte Location: 70, Size 3 bytes
//        Sequence Found: AGTG
//        SequenceID AGTG not found
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        TGATCA: hash slot [9]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List:
//        [Block 1] Starting Byte Location: 70, Size 3 bytes
//        Sequence Removed TGATCA:
//        AGTG
//        Sequence IDs:
//        TTTTTTTTTTTTTTTT: hash slot [7]
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List:
//        [Block 1] Starting Byte Location: 64, Size 3 bytes
//        [Block 2] Starting Byte Location: 70, Size 3 bytes
//        Sequence Removed TTTTTTTTTTTTTTTT:
//        TTTTTTTTTTTTTTTT
//        Sequence IDs:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        Free Block List:
//        [Block 1] Starting Byte Location: 56, Size 11 bytes
//        [Block 2] Starting Byte Location: 70, Size 3 bytes
//        Sequence IDs:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        AGTC: hash slot [30]
//        Free Block List:
//        [Block 1] Starting Byte Location: 60, Size 7 bytes
//        [Block 2] Starting Byte Location: 70, Size 3 bytes
//        SequenceID AGTCA not found
//        Sequence IDs:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        TTAC: hash slot [27]
//        AGTC: hash slot [30]
//        Free Block List:
//        [Block 1] Starting Byte Location: 60, Size 7 bytes
//        [Block 2] Starting Byte Location: 70, Size 3 bytes
//        Sequence Removed TTAC:
//        TTAC
//        Sequence Removed AGTC:
//        AGTCTGACA
//        Sequence IDs:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        ACGTACGT: hash slot [26]
//        Free Block List:
//        [Block 1] Starting Byte Location: 56, Size 11 bytes
//        Sequence Removed ACGTACGT:
//        TGCATGCA
//        Sequence IDs:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT: hash slot [8]
//        GTCA: hash slot [11]
//        Free Block List:
//        [Block 1] Starting Byte Location: 0, Size 4 bytes
//        [Block 2] Starting Byte Location: 56, Size 11 bytes
//        SequenceID ACGTACGT not found
//        Sequence Removed GTCA:
//        AGTCA
//        Sequence Removed TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT
//        Sequence IDs:
//        Free Block List: none
//        Sequence IDs:
//        TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTAT: hash slot [17]
//        Free Block List: none
//        Sequence Removed TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTAT:
//        TTTTATGTGTGTGTGTGTGTGTGTGAC
//        Sequence IDs:
//        Free Block List: none
//        SequenceID GATACA not found
//        SequenceID GTGGTGG not found

}
