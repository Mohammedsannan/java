/*Program to demonstrate the creation of queue object using the PriorityQueue class  DATE--1/06/2022  */

import java.util.*;
class PriorityQDemo {
                    
                           public static void main(String args[]){
                        PriorityQueue<String>queue=new PriorityQueue<String>();
       
                              //adding elements to Priority queue

                              queue.add("junaid");
                              queue.add("shamil");
                              queue.add("anand");
                              queue.add("alen");
                              queue.add("shamna");
                              queue.add("aneetha");
                                     
                             System.out.println("queue elementa are ");
                             System.out.println(queue);
                              
                            }
                }
  
   

/*output:

queue elementa are 
[alen, anand, aneetha, shamil, shamna, junaid]

*/
