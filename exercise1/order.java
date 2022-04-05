/*Write a program that accepts three numbers from the user and prints
"increasing" if the numbers are in increasing order, "decreasing" if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise.*/
import java.util.*;
class order {
	public static void main(String args[])
		{
		Scanner s=new Scanner(System.in);
		System.out.println("enter three number");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if(x<y && y<z)
		{
		System.out.println("increasing order");
		}
		else if(x>y && y>z)
		{
		System.out.println("decreasing order");
		}
		else
		{
		System.out.println("either increasing nor decreasing order....!");
		}
		}
	}



o/p:

enter three number
1 2 3
increasing order

