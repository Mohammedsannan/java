import java.util.*;
class Float {
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("enter your number:");
double f=s.nextDouble();
if(f>0)
	{
	System.out.println("positive number");
	if(f<1)
	{
	System.out.println("small positive number");
	}
	else if(f>100000)
	{
	System.out.println("large positive number");
	}
	}
else if(f<0)
	{
	System.out.println("negative number");
	if(Math.abs(f)<1)
	{
	System.out.println("small negative number");
	}	
	else if(Math.abs(f)>100000)
	{
	System.out.println("large negative number");
	}
	}
else
{
System.out.println("zero");
}
}
}


