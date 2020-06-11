//program taking pair of string as input and check for unique paires 
package training_codes;
import java.io.*;
import java.util.*;


public class Collections2 {
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       String[] pair_left=new String[t];
       String[] pair_right=new String[t];
       for(int i=0;i<t;i++){
           pair_left[i]=s.next();
           pair_right[i]=s.next();
       }
       HashSet<String> pairs=new HashSet<String>(t);
       for(int j=0;j<t;j++){
          pairs.add("("+pair_left[j]+", "+pair_right[j]+")");
          System.out.println(pairs.size());
       }
   }
}

