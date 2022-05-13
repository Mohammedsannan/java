package graphics;

interface areaT{

	void area(int b, int h);
	
}


public class Triangle implements areaT{

	public void area(int b,int h){
		System.out.println("Area of Triangle having\n\nbase="+b+"\nheight="+h);
		System.out.println("Area="+(0.5*b*h)+"\n-----------------");
		
		
	}

}

