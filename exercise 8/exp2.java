/* 2. Program to remove all the elements from a linked list.*/


import java.util.*;


class LinkedListDemo{

                       public static void main(String args[]){
   
                       //creating a linked list
                       LinkedList<String>Ll=new LinkedList<String>();
                     
                       //adding elements to linked list
                       Ll.add("orange");
                       Ll.add("grape");
                       Ll.addFirst("banana");
                       Ll.addLast("pineaple");
                       Ll.add(4,"guava");
                     
                       //adding elements at 3rd index
                       Ll.add(3,"watermeoln");

                       System.out.println("original  contents of the linked list:"+Ll);
           
                      //removing elements from linkedlist
                      Ll.removeFirst();
                      Ll.remove(4);
 
                      System.out.println("contents of  linked list after removing elements:" +Ll);

                     //removing all elements from the linkedlist
                     Ll.clear();
                     System.out.println("contents of  linked list after removing  all elements:"+Ll);

               }
  }

/* output:

original  contents of the linked list:[banana, orange, grape, watermeoln, pineaple, guava]
contents of  linked list after removing elements:[orange, grape, watermeoln, pineaple]
contents of  linked list after removing  all elements:[]
 */
