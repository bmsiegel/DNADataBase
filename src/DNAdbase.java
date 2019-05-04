import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class DNAdbase {
    /**
     * Constant for insert command
     */
    static final String INSERT = "insert";
    /**
     * Constant for remove command
     */
    static final String REMOVE = "remove";
    /**
     * Constant for search command
     */
    static final String SEARCH = "search";
    /**
     * Constant for print command
     */
    static final String PRINT = "print";


    public static void main(String[] args) {
        if (args.length == 4) {
            try {
                Database db = new Database(args[3], Integer.parseInt(args[2]));
                Scanner sc = new Scanner(new File(args[0]));
                String command = "";
                while (sc.hasNext()) {
                    command = sc.next();
                    if (command.equals(INSERT)) {
                        String ID = sc.next();
                        int length = sc.nextInt();
                        String seq = sc.next();
                        db.insertSequence(ID, seq, length);
                    }
                    else if (command.equals(REMOVE)) {
                        String ID = sc.next();
                        db.removeSequence(ID);
                    }
                    else if (command.equals(SEARCH)) {
                        String ID = sc.next();
                        db.findSequence(ID);
                    }
                    else if (command.equals(PRINT)) {
                        db.printDB();
                    }
                }
                sc.close();
            }
            catch (FileNotFoundException e) {
                System.out.println("Bad Formatting");
            }
            catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else {
            System.out.println(
                "Usage: java DNAdbase <command-file> <hash-file> <hash-table-size> <memory-file>");
        }
    }
}
