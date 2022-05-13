package graphics;

interface areaC{

	void area(double r);
	
}




public class Circle implements areaC{

	public void area(double r){
		System.out.println("Area of Circle having\n\nradius="+r);
		System.out.println("Area="+(3.14*r*r)+"\n----------------");
		
	}

}
