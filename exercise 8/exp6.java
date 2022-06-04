/* Program to demonstrate the creation of Set object using the LinkedHashset class    DATE--1/05/2022*/

import java.util.*;
 class LinkedHashSetDemo{
             public static void main(String args[]){
                 LinkedHashSet<String>set=new LinkedHashSet<String>();
  
                //creating set objects using LinkedHashset
                set.add("neymar");
                set.add("messi");
                set.add("cr7");
                set.add("mbappe");
               set.add("verratti");
               set.add("thiago silva");
               set.add("coutinho");
               set.add("pedri"); 
               
                System.out.println("\n size of set after adittion of objects:"+set.size());
                 
               System.out.println("\n objects of set after adittion :"+set); 

		

             
}


}

/* output:

 size of set after adittion of objects:8

 objects of set after adittion :[neymar, messi, cr7, mbappe, verratti, thiago silva, coutinho, pedri]
*/
