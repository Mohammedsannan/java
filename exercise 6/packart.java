/*
5. Create an Arithmetic package that has classes and interfaces
for the 4 basic arithmetic operations. Test the package by
implementing all operations on two given numbers
*/

import arithematic.*;
import java.util.*;

class pack{
	public static void main(String ar[]){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 2 Numbers ");
				int a=sc.nextInt();
				int b=sc.nextInt();

				Add add=new Add();
				add.Result(a,b);

				Sub sub=new Sub();
				sub.Result(a,b);

				Mul mul=new Mul();
				mul.Result(a,b);

				Div div=new Div();
				div.Result(a,b);

	}


}

/*output:

Enter 2 Numbers 
3
4
Addition Result
Result=7
----------------
Substraction Result
Result=-1
----------------
Multiplication Result
Result=12
----------------
Division Result
Result=0.75
----------------
*/
