
package training_codes;

import java.io.FileWriter;
import java.io.IOException;
public class WriteOpr {
    public static void main(String args[])
    { 
        try{
      FileWriter f=new FileWriter("C:\\training\\Day2.txt");
      f.write("Concepts of Github, File handling and collections discussed in session.Programs for file handling showing different file operations were made in files filehandling.java , writeopr.java and readopr.java. Collections program was made in collections.java ");
      f.close();
      System.out.println("Successfully written in file.");
        }
        catch(IOException e){
         System.out.println("Error");
         e.printStackTrace();
        }
    }
}
