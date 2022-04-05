import java.util.*;
class matrix {

	public static void main(String args [])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the rows:");
	int m=s.nextInt();
	System.out.println("enter the columns:");
	int n=s.nextInt();

	int array1[][]=new int[m][n];
	int array2[][]=new int[m][n];
	int result[][]=new int[m][n];
	
	System.out.println("enter the elements of first matrix:");
	
	for (int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			array1[i][j]=s.nextInt();
		}
	}

	System.out.println("enter the elements of second matrix:");
	
	for (int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			array2[i][j]=s.nextInt();
		}
	}

	System.out.println("added matrix is:");
	for( int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			result[i][j]=array1[i][j]+array2[i][j];
			
			System.out.print("\t"+result[i][j]);
		}
		
		System.out.println();
	}

	

	}
}


/*output:

enter the rows:
3
enter the columns:
3
enter the elements of first matrix:
1 2 3
3 4 5
4 5 6
enter the elements of second matrix:
7 8 9
9 8 7
9 0 8
added matrix is:
	8	10	12
	12	12	12
	13	5	14

*/
	
