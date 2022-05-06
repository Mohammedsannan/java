package graphics;

interface areaS{

	void area(int a);
	
}


public class Square implements areaS{

	public void area(int a){
		System.out.println("Area of Square having\n\nside="+a);
		System.out.println("Area="+(a*a)+"\n-----------------");

		
	}

}
