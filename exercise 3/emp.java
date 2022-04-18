/*Program to create a class for Employee having attributes eNo, eName
eSalary. Read n employ information and Search for an employee given
eNo, using the concept of Array of Objects*/
import java.util.*;
class search{

		int linear(int arr[],int item,int len){
		int j=0;
		while(j<len){
			if(arr[j]==item){
				return j;
			}
			j++;
		}
		return -1;
		
	
	
	}

}
class Employee{
	int eno;			//initialise variables
	String eName;
	double eSalary;
	
	
	void setData(int eno,String name,double salary){
			this.eno=eno;
			this.eName=name;      
			this.eSalary=salary;
	
	}
	void disp(){  //methord for display the details
			
			System.out.println("Employee no: "+eno+"\nEmployee Name: "+eName+"\nSalary:"+eSalary+"\n");
	
	}
	
	public static void main(String ar[]){
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the no.of employees:");
			int n=obj.nextInt();
			search s= new search();
			// Declaring an array of Employee
			Employee[] arr;
			arr=new Employee[n];// Allocating memory for n objects of type Employee
			int array[]=new int[n];
			for(int i=0;i<n;i++){
					System.out.println("Enter the details of "+(i+1)+"th employee");
					
					System.out.print("Enter emp no:");
					int en=obj.nextInt();
					
					System.out.print("\nEnter emp name:");
					String name=obj.next();
					
					System.out.print("\nEnter emp salary:");
					double sal=obj.nextDouble();
					
					arr[i]=new Employee();
					arr[i].setData(en,name,sal);
					array[i]=en;
					System.out.println("-----------------------\n");
					
			}
			
			
			
			do{
					System.out.println("\n1.Search \n2.exit");
					System.out.println("Select your option: ");
					int opt =obj.nextInt();
					
					System.out.println("-----------------------\n");
					
					switch(opt){
						case 1:System.out.println("Searching....!");
							   System.out.println("Enter the emp no to search:");
							   int emp_no=obj.nextInt();
							   int result= s.linear(array,emp_no,n);
							   if(result==-1){
									System.out.println("no employee exists for  										this number");
								}
								else{
										arr[result].disp();
				
								}
								System.out.println("-----------------------\n");
								break;
						case 2: System.out.println("Exiting....!");
								System.exit(0);
								break;
								
					
					
					}
					
					
			
			
			
			}while(true);
			
			/*System.out.print("\nEnter the enmp no to search:");
			int emp_no=obj.nextInt();
			int result= s.linear(array,emp_no,n);
			System.out.println("-----------------------\n");
			
			
			
			/*if(emp_no<=n){
					arr[emp_no-1].disp();
			}
			else{
					System.out.println("no employee exists for this number");
			}
			
			if(result==-1){
					System.out.println("no employee exists for this number");
			}
			else{
					arr[result].disp();
				
			}*/
			
	}

}

/* output:
Enter the no.of employees:
2
Enter the details of 1th employee
Enter emp no:1

Enter emp name:sanan

Enter emp salary:1000
-----------------------

Enter the details of 2th employee
Enter emp no:2

Enter emp name:anand

Enter emp salary:999
-----------------------


1.Search 
2.exit
Select your option: 
1
-----------------------

Searching....!
Enter the emp no to search:
1
Employee no: 1
Employee Name: sanan
Salary:1000.0

-----------------------


1.Search 
2.exit
Select your option: 
2
-----------------------

Exiting....!
*/
