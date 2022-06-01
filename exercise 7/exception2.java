/*2. Find the average of N positive integers, raising a user
defined exception for each negative input.*/


import java.util.*;
class myException extends Exception{
	public myException(String s){
		super(s);
	}
	}
class main{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of items:");
		int n=sc.nextInt();
	int d;
	int total=0;
	int c=0;
	System.out.println("enter numbers:");
	for(int i=n;i>0;i--){
	d=sc.nextInt();
		try{
			if(d>=0){
				c++;
				total=total+d;
			}
		else {
			throw new myException("negative numbers not allowed\nplease enter positive numbers");
			}
			}
	catch(myException ex){
			System.out.println(ex.getMessage()+"\n");
			}
		if(d<0){
			i=i+1;
	}
	}
System.out.println("average of "+c+" positive numbers="+(double)total/c);
}
}


/*output:

enter the number of items:
6
enter numbers:
1
2
3
4
5
-6
negative numbers not allowed
please enter positive numbers

6
average of 6 positive numbers=3.5
*/
