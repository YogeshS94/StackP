import java.util.*;

public class StackDemo {
      
   static void showpush(Stack st, int a) {
    
      st.push(new Integer(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + st);
     // System.out.println("search stack: " +st.search("66"));
   }
  // static void showsearch(Stack st){
    
   //}
  
   
   static void showpeek(Stack st) {
       Integer a = (Integer) st.peek();
       System.out.println("peek stack: " + a);
     //  System.out.println("peek stack: " + st);
       
     
     
   }

   static void showpop(Stack st) {
      System.out.print("pop -> ");
      Integer a;
       a = (Integer) st.pop();
       
      System.out.println(a);
      System.out.println("stack: " + st);
   }

   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("stack: " + st);
      showpush(st, 42);
      showpush(st, 66);
      showpush(st, 99);
    
      showpeek(st);
      
      showpop(st);
      showpop(st);
      showpop(st);
      try {
         showpop(st);
      }catch (EmptyStackException e) {
         System.out.println("empty stack");
      }
      
     
   }

   }
