/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training_codes;
import java.io.File;
import java.io.IOException;

public class FileHandling{
    public static void main(String[] args) {
        try{
         File obj=new File("C:\\training\\Day2.txt");
         if(obj.createNewFile())
         {System.out.println("File created: "+obj.getName());}
         else{
             {System.out.println("File already exists");}
             if(obj.exists())
             { System.out.println("Absolute path: "+obj.getAbsolutePath());
             System.out.println("Writable: "+obj.canWrite());
              System.out.println("Readable: "+obj.canRead());
             }
             else{
              System.out.println("File does not exists");
             }
         }
        }
        catch(IOException e){
              {System.out.println("Error occured");}
              e.printStackTrace();
         }
    }
    
}
