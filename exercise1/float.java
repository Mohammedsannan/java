/*Write a Java program to read a floating-point number and if the number is zero
it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
absolute value of the number is less than 1, or "large" if it exceeds 1,00,000.*/
import java.util.*;
class Float {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter your number:");
		double f=s.nextDouble();
		if(f>0)
		{
		
		if(f<1)
		{
		System.out.println("small positive number");
		}
		else if(f>100000)
		{
		System.out.println("large positive number");
		}
		else
		{
		System.out.println("positive number");
		}
		}
		else if(f<0)
		{
		
		if(Math.abs(f)<1)
		{
		System.out.println("small negative number");
		}	
		else if(Math.abs(f)>100000)
		{
		System.out.println("large negative number");
		}
		else
		{
		System.out.println("negative number");
		}
		}
		else
		{
		System.out.println("zero");
		}
	}
	}



/*o/p:


enter your number:1
positive number
enter your number:0.4
small positive number
enter your number:100002
large positive number


enter your number:-1
negative number
enter your number:-0.4
small negative number
enter your number:-100004
large negative number


*/



