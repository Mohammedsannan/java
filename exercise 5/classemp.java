/*1.Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.*/

import java.util.*;

class employee {
	
	int empid;
	String name;
	double salary;
	String address;

	void employee (int id,String name,double sal,String add)
	{
	 this.empid=id;
	 this.name=name;
	 this.salary=sal;
	 this.address=add;
	}
	       }
	
class teacher extends employee {
		String department;
		String subjects_taught;

	teacher(String dpt,String sub,int id,String name,double sal,String add)
	{
	 this.department=dpt;
	 this.subjects_taught=sub;
	 this.empid=id;
	 this.name=name;
	 this.salary=sal;
	 this.address=add;
	 
	}
	void display(){
	
		System.out.println("empid:"+empid+"\nempname:"+name+"\nsalary:"+salary+"\naddress:"+address);
		System.out.println("dep:"+department+"\nsub taught:"+subjects_taught);
		System.out.println("---------------------");

	                                }
			}
					

class main{
	 
	public static void main(String args[])
	{
		Scanner obj=new
	Scanner(System.in);
		System.out.println("enter the no. of teacher:");
		int n=obj.nextInt();		

		// declaring an array of teacher

		teacher[] arr;
		arr=new teacher[n]; //allocating memory for n objects of type teacher
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("enter the details of "+(i+1)+"th teacher");
		System.out.println("enter emp id:");
		int id=obj.nextInt();
		System.out.println("\nenter emp name:");
		String name=obj.next();
		System.out.print("\nenter emp salary:");
		double sal=obj.nextDouble();
		System.out.println("\nenter address:");
		String ad=obj.next();
		System.out.println("\nenter department:");
		String dep=obj.next();
		System.out.println("\nenter sub taught:");
		String sub=obj.next();
		

		arr[i]=new teacher(dep,sub,id,name,sal,ad);
System.out.println("-----------------\n");
	
	}
	
	for(int j=0;j<n;j++){
		System.out.println("---details of teacher "+(j+1)+"---");
		arr[j].display();
	
			     }
				

}
}

/* output: 
enter the no. of teacher:
2
enter the details of 1th teacher
enter emp id:
1

enter emp name:
ajay

enter emp salary:60000

enter address:
clt

enter department:
mva

enter sub taught:
ds
-----------------

enter the details of 2th teacher
enter emp id:
2

enter emp name:
sabna

enter emp salary:50000

enter address:
mkm

enter department:
mca

enter sub taught:
oops
-----------------

---details of teacher 1---
empid:1
empname:ajay
salary:60000.0
address:clt
dep:mva
sub taught:ds
---------------------
---details of teacher 2---
empid:2
empname:sabna
salary:50000.0
address:mkm
dep:mca
sub taught:oops
---------------------

*/

