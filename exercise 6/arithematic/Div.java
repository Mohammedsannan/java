package arithematic;

interface Division{

	void Result(int a,int b);
	
}




public class Div implements Division{
		double r=0;

	public void Result(int a,int b){
		r= (double)a/b;
		System.out.println("Division Result");
		System.out.println("Result="+(r)+"\n----------------");
		
	}

}

