import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class genCommandFile {
    public static void main(String [] args) throws FileNotFoundException, UnsupportedEncodingException
    {
        LinkedList<String> IDs = new LinkedList<String>();
        String arr[] = {"insert", "insert", "insert", "remove", "search"};
        int randomCommandNum = (int)((int) ((Math.random()*1000) + 1));
        for (int c = 0; c < randomCommandNum; c++)
        {
           String command = arr[(int) (Math.random()*5)];
           System.out.print(command);
           int randomCharNum = (int) ((Math.random()*12) + 1);
           int randomSeqLength = (int) ((Math.random()*50) + 1);
           String ID = "";
           if (command.equals("insert"))
           {
               for (int i = 0; i < randomCharNum; i++)
               {
                   int randomChar = (int) (Math.random()*4);
                   if (randomChar == 0)
                   {
                       ID += "A";
                   }
                   else if (randomChar == 1)
                   {
                       ID += "C";
                   }
                   else if (randomChar == 2)
                   {
                       ID += "G";
                   }
                   else if (randomChar == 3)
                   {
                       ID += "T";
                   }
               }
               IDs.add(ID);
               System.out.print(" " + ID + " " + randomSeqLength + "\n");
               String seq = "";
               for (int j = 0; j < randomSeqLength; j++)
               {
                   int randomChar = (int) (Math.random()*4);
                   if (randomChar == 0)
                   {
                       seq += "A";
                   }
                   else if (randomChar == 1)
                   {
                       seq += "C";
                   }
                   else if (randomChar == 2)
                   {
                       seq += "G";
                   }
                   else if (randomChar == 3)
                   {
                       seq += "T";
                   }                   
               }
               System.out.println(seq + "\nprint");
           }
           else if (command.equals("remove") || command.equals("search"))
           {
               int randomLLIndex = (int) (Math.random()*IDs.size());
               System.out.println(" " + IDs.get(randomLLIndex) + "\nprint");
               IDs.remove(randomLLIndex);
           }
        }
    }
}
