/*2. Create a class ‘Person’ with data members Name, Gender, Address, Age and a
constructor to initialize the data members and another class ‘Employee’ that inherits
the properties of class Person and also contains its own data members like Empid,
Company_name, Qualification, Salary and its own constructor. Create another class
‘Teacher’ that inherits the properties of class Employee and contains its own data
members like Subject, Department, Teacherid and also contain constructors and
methods to display the data members. Use array of objects to display details of N
teachers.*/



import java.util.*;
class person{ //create class person
	String Name;
	String gender;
	int age;
	String address;

	person(String gen,String name,int age,String adrs){ //constructor of person
		gender=gen;
		Name=name;
		age=age;
		address=adrs;
}
}
class employee extends person{  //create class employee that inherit person
	int empid;
	String company_name;
	String qualification;
	double salary;

	employee(String gen,String name,int age,String adrs,int id,String c_n,String qualif,double sal){ //constructor of employee
	super(gen,name,age,adrs);
	empid=id;
	company_name=c_n;
	qualification=qualif;
	salary=sal;
}
}
class teacher extends employee { //create class teacher that inherit employee

	String Sub;
	String Dpt;
	int t_id;
	teacher(String gen,String name,int age,String adrs,int id,String c_n,String qualif,double sal,String sub,String dpt,int tid){
	super(gen,name,age,adrs,id,c_n,qualif,sal);
		Sub=sub;
		Dpt=dpt;
		t_id=tid;

	}

	void display(){ //method to display all data members of all classes

System.out.println("\nname:"+super.Name+"\ngender:"+super.gender+"\nage:"+super.age+"\naddress:"+super.address);
System.out.println("\nempid:"+empid+"\ncompanyname:"+company_name+"\nqualification:"+qualification+"\nsalary:"+salary);
System.out.println("\nteachersid:"+t_id+"\ndep:"+Dpt+"\nsub:"+Sub);

System.out.println("-------------------------------------------------------------------------------------------------");
}
}

class Person{ //main class
	public static void main(String args[]){ //main methode
		Scanner obj=new Scanner(System.in);
	System.out.print("enter the no. of teacher:");
	int n=obj.nextInt();

	// declaring an array of teacher

	teacher[] arr=new teacher[n]; //allocating memory for n objects of type teacher
	for(int i=0;i<n;i++){

System.out.println("\nenter the details of teacher - "+(i+1)); //enter the details of all data members using forloop
System.out.println("-----------------------------------------------------------------------------------------------");

		System.out.print("\nenter name:");
		String name=obj.next();
		System.out.print("enter gender:");
		String gen=obj.next();
		System.out.print("enter age:");
		int age=obj.nextInt();
		System.out.print("enter address:");
		String adrs=obj.next();
		System.out.print("\nenter emp id:");
		int id=obj.nextInt();
		System.out.print("enter company name:");
		String cname=obj.next();
		System.out.print("enter qualification:");
		String qualif=obj.next();
		System.out.print("enter emp salary:");
		double sal=obj.nextDouble();
		System.out.print("\nenter teachers id:");
		int t_id=obj.nextInt();
		System.out.print("enter department:");
		String dpt=obj.next();
		System.out.print("enter subject:");
		String sub=obj.next();
		
		arr[i]=new teacher(gen,name,age,adrs,id,cname,qualif,sal,sub,dpt,t_id); //calling constructor of teacher class and passing parameters


System.out.println("---------------------------------------------------------\n");
}
	for(int j=0;j<n;j++){

System.out.println("---details of teacher--" +(j+1)+"--");
		arr[j].display(); // calling display method of teacher objects using forloop
}
}
}



/* output:

enter the no. of teacher:2

enter the details of teacher - 1
-----------------------------------------------------------------------------------------------

enter name:ajaysir
enter gender:m
enter age:47
enter address:clct

enter emp id:1
enter company name:kmct
enter qualification:phd
enter emp salary:60000

enter teachers id:123
enter department:mca
enter subject:datastructure
---------------------------------------------------------


enter the details of teacher - 2
-----------------------------------------------------------------------------------------------

enter name:sabnamiss
enter gender:f
enter age:36
enter address:mkm

enter emp id:2
enter company name:kmct
enter qualification:phd
enter emp salary:50000

enter teachers id:124
enter department:mca
enter subject:oops
---------------------------------------------------------

---details of teacher--1--

name:ajaysir
gender:m
age:0
address:clct

empid:1
companyname:kmct
qualification:phd
salary:60000.0

teachersid:123
dep:mca
sub:datastructure
-------------------------------------------------------------------------------------------------
---details of teacher--2--

name:sabnamiss
gender:f
age:0
address:mkm

empid:2
companyname:kmct
qualification:phd
salary:50000.0

teachersid:124
dep:mca
sub:oops
-------------------------------------------------------------------------------------------------

*/



























