/*Write a program in Java to display the cube of the number up to a given
integer.*/
import java.util.*;
class cube {

	public static void main(String args[])
		{
		Scanner s= new Scanner(System .in);
		System.out.println("enter your number:");
		int c=s.nextInt();
		for(int i=0;i<=c;i++)
		{
		int m=i*i*i;
		System.out.println(m);
		}
		}
	}



o/p:

enter your number:
5
0
1
8
27
64
125

