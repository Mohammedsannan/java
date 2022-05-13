package arithematic;

interface Substraction{

	void Result(int a,int b);
	
}




public class Sub implements Substraction{

	public void Result(int a,int b){
		System.out.println("Substraction Result");
		System.out.println("Result="+(a-b)+"\n----------------");
		
	}

}

