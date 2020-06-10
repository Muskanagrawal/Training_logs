//basic program for arraylist and linklist
package training_codes;
 import java.util.*;

public class Collections {
   public static void main(String args[]) {
      
      ArrayList<String> sample = new ArrayList<String>();
      sample.add("Apple");
      sample.add("Melon");
      sample.add("Coconut");
      sample.add("Mango");
      sample.add("Papaya");

      
      System.out.println("ArrayList before modification:");
      for(String str:sample)
         System.out.println(str);

 
      sample.add(0, "WaterMelon");
      sample.add(1, "Orange");
     

      System.out.println("ArrayList after add operation:");
      for(String str:sample)
         System.out.println(str);

     
      sample.remove("Coconut"); 
     
     
      System.out.println("ArrayList after remove operation:");
      for(String str:sample)
         System.out.println(str);

   int pos = sample.indexOf("Orange");
      sample.remove(1); 
      
      System.out.println(pos);
   
      System.out.println("Final ArrayList:");
      for(String str:sample)
         System.out.println(str);
      
      LinkedList<String> ll=new LinkedList<String>();

  ll.add("1");

  ll.add("2");

  ll.add("3");

  ll.add("4");

  ll.add("5");

  Iterator<String> itr=ll.iterator();

  while(itr.hasNext())
  {

   System.out.print(itr.next());

   System.out.print("\t");

  }
   }
}


