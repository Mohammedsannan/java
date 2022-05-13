
package graphics;

interface Area{

	void area(int l,int b);
	
}


public class Rectangle implements Area
{

	public void area(int l,int b){
		System.out.println("Area of rectangle having\n\nlength="+l+"\nbreadth="+b);
		System.out.println("\nArea="+(l*b)+"\n-----------------");

		
	}

}



