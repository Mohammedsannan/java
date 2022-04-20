/*
Create CPU with attribute price. Create inner class
Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.
*/


class Cpu{

	public static void main(String ar[]){
					Cpu c=new Cpu();
					c.display();
			
			}
			

	double price=5000;
		void display(){
				System.out.println("CPU Detais\n\nprice="+price);
				Processor p=new Processor();
				Ram r= new Ram();
		
		
		}
			
			
			
			class Processor{
					int core=8;
					String manufacture="intel";
					Processor(){
						System.out.println("\nProcessor");
						System.out.println(" no. of core="+core+"\nManufacture:"+manufacture);
						
					}
			
			}
			 class Ram{
					int memmory=128;
					String manufacture="crucial";
					Ram(){
							System.out.println("\nRam");
							System.out.println("memmory="+memmory+"\nManufacture:"+manufacture);
							
					
					}
					
			}

}

/*OUTPUT:

CPU Detais

price=5000.0

Processor
 no. of core=8
Manufacture:intel

Ram
memmory=128
Manufacture:crucial
*/

