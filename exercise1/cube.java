/*Write a program in Java to display the cube of the number up to a given
integer.*/


import java.util.*;
class cube {

	public static void main(String args[])
		{
		Scanner s= new Scanner(System .in);
		System.out.println("enter your number:");
		int c=s.nextInt();

		for(int i=1;i<=c;i++)
		{
		System.out.println("number is : "+i+" is: "+(i*i*i));
		}
		}
	}



/* o/p:

enter your number:
5
number is : 1 is: 1
number is : 2 is: 8
number is : 3 is: 27
number is : 4 is: 64
number is : 5 is: 125


*/

