 
package training_codes;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ReadOpr {
    public static void main(String args[])
    { 
        try{
      File f=new File("C:\\training\\Day2.txt");
      Scanner sc=new Scanner(f);
      while(sc.hasNextLine())
      {
        String data = sc.nextLine();
        System.out.println(data);
      }
      sc.close();
        }
        catch(IOException e){
         System.out.println("Error");
         e.printStackTrace();
        }
    }
}

