/*Create an interface having prototypes of
functions area() and perimeter(). Create two
classes Circle and Rectangle which implements
the above interface. Create a menu driven
program to find area and perimeter of objects.*/





import java.util.*;

interface ap{

	void input();
	void area();
	void perimeter();
}
class circle implements ap
	{
	Scanner sc=new Scanner (System.in);
	int r=0;
	double pi=3.14;
	double area=0;
	double perimeter=0;
	public void input(){
		System.out.println("enter radius");
		this.r=sc.nextInt();
	}
	
	public void area(){
		area=pi*r*r;
		System.out.println("area="+area);
	}
	
	public void perimeter(){
		perimeter=2*pi*r;
		System.out.println("perimeter="+perimeter);
	}
	}

class rectangle implements ap{
		Scanner sc=new Scanner(System.in);
		int l=0;
		int b=0;
		double area=0;
		double perimeter=0;
		public void input(){
			System.out.println("enter length and breadth");
			this.l=sc.nextInt();
			this.b=sc.nextInt();
		}

	public void area(){
		area=l*b;
		System.out.println("area="+area);
	}

	public void perimeter(){
		perimeter=2*(l+b);
		System.out.println("perimeter="+perimeter);
	}
	}

	class main{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		circle c=new circle();
		rectangle r=new rectangle();

		while(true){
			System.out.println("1.circle\n2.rectangle\n3.exit..");
			System.out.print("enter your choice:");
			int opt =sc.nextInt();
			switch(opt){
				case 1:System.out.println("\n\ncircle");
					c.input();
					c.area();
					c.perimeter();
					System.out.println("------------");
					break;
				case 2:System.out.println("\n\nrectangle");
					r.input();
					r.area();
					r.perimeter();
					System.out.println("---------------");
					break;
			default:System.out.println("exiting...!");
				
					System.exit(0);
					break;
		}
		}

}
}



/* output:

1.circle
2.rectangle
3.exit..
enter your choice:1


circle
enter radius
6
area=113.03999999999999
perimeter=37.68
------------
1.circle
2.rectangle
3.exit..
enter your choice:2


rectangle
enter length and breadth
4
5
area=20.0
perimeter=18.0
---------------
1.circle
2.rectangle
3.exit..
enter your choice:3
exiting...!
*/
