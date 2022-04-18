/*
exp1. Define a class ‘product’ with data members pcode, pname and price.
Create 3 objects of the class and find the product having the lowest
price
*/
import java.util.*;

class Product{ //create a class product
	int pcode;
	double price;		//declare variables
	String pname;
	void disp(){           // methord for display details
		
		System.out.println("product code:"+pcode+"\nproduct Name:"+pname+"\nProduct Price"+price);		
	     
	}
}

 class Details { 
//main class
	public static void main(String ar[]){  //main function
		Scanner ob=new Scanner(System.in);
		Product p1=new Product();          //create 3 objects of Product class
		Product p2=new Product();
		Product p3=new Product();
		
		System.out.println("Enter the details of product 1");	//details of product 1
		System.out.print("\nproduct code:");
		p1.pcode=ob.nextInt();
		System.out.print("product Name:");
		p1.pname=ob.next();
		System.out.print("product Price:");
		p1.price=ob.nextDouble();
		System.out.println("-----------------------");
		
		
		System.out.println("Enter the details of product 2");	//details of product 2
		System.out.print("\nproduct code:");
		p2.pcode=ob.nextInt();
		System.out.print("product Name:");
		p2.pname=ob.next();
		System.out.print("product Price:");
		p2.price=ob.nextDouble();
		System.out.println("-----------------------");
		
		
		System.out.println("Enter the details of product 3");	//details of product 1
		System.out.print("\nproduct code:");
		p3.pcode=ob.nextInt();
		System.out.print("product Name:");
		p3.pname=ob.next();
		System.out.print("product Price:");
		p3.price=ob.nextDouble();
		System.out.println("-----------------------\n");
		
		
		
		if(p1.price<p2.price){		//checking for minimum priced product
	
			if(p1.price<p3.price){
				System.out.println("The product "+p1.pname+"is minimum price\n-------------------");
				p1.disp();
			}
			else{
				System.out.println("The  product "+p3.pname+" is minimum price\n-------------------");
				p3.disp();
			}	
		}
		else{
		 
			if(p2.price<p3.price){
				System.out.println("The  product"+p2.pname+" is minimum price\n-------------------");
				p2.disp();
			}
			else{
				System.out.println("The  product"+p3.pname+" is minimum price\n-------------------");
				p3.disp();
			}	
		}
		
		
	}
	

}


/* output:

Enter the details of product 1

product code:123
product Name:1
product Price:100
-----------------------
Enter the details of product 2

product code:124
product Name:2
product Price:400
-----------------------
Enter the details of product 3

product code:125
product Name:3
product Price:500
-----------------------

The product 1is minimum price
-------------------
product code:123
product Name:1
Product Price100.0
*/
