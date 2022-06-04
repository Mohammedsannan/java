/* Program to demonstrate the addition and deletion of elements in deque      DATE--1/06/2022 */

import java.util.*;
class deque  {
          public static void main(String args[]){

          Deque<String>dq=new ArrayDeque<String>();

          //addding elements to deque
          dq.add("rashid");
          dq.add("thoha");
          dq.add("sideeq");
          dq.add("munees");
          dq.add("fayis");
          dq.add("rafeeq");
          dq.add("anfaz");

           System.out.println("\n  size of deque after addition:"+dq.size());
           System.out.println("\n elements in deque after addition: "+dq);
           
         //removing 3 elements from deque
         dq.remove();
         dq.remove("rafeeq");
         dq.remove("anfaz");
         
         System.out.println("\n  deque after removing 3 elements:"+dq);

          //removing  remaining elements from deque
          dq.remove("sideeq");
          dq.remove("munees");
          dq.remove("fayis");

          
           System.out.println("\n  elements in deque after removing elements:"+dq);
           System.out.println("\n  size of deque after removal of elements:"+dq.size());

          
 
         }
}


/* output:

size of deque after addition:7

 elements in deque after addition: [rashid, thoha, sideeq, munees, fayis, rafeeq, anfaz]

  deque after removing 3 elements:[thoha, sideeq, munees, fayis]

  elements in deque after removing elements:[thoha]

  size of deque after removal of elements:1

*/

