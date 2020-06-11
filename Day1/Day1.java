//Covaraint return types
// Two classes used for return types. 
class A {} 
class B extends A {} 
  
class Base 
{ 
    A fun() 
    { 
        System.out.println("Base fun()"); 
        return new A(); 
    } 
} 
  
class Derived extends Base 
{ 
    B fun() 
    { 
        System.out.println("Derived fun()"); 
        return new B(); 
    } 
} 

//Shadowig of static method
class C { 
    static void fun() 
    { 
        System.out.println("C.fun()"); 
    } 
} 
  
class D extends C { 
    static void fun() 
    { 
        System.out.println("D.fun()"); 
    } 
} 
  
  
public class Main 
{ 
    public static void main(String args[]) 
    { 
       Base base = new Base(); 
       base.fun(); 
  
       Derived derived = new Derived(); 
       derived.fun(); 
       
       Base base1 = new Derived(); 
       base1.fun(); 
       
       C c = new D(); 
        c.fun(); // prints C.fun(); 
  
         D d = new D(); 
         d.fun(); // 
    } 
} 