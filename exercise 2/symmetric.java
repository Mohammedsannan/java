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
	
	System.out.println("enter the elements of first matrix:");
	
	for (int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			array1[i][j]=s.nextInt();
		}
	}

	System.out.println("check:");
	
	for (int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			array2[i][j]=array1[j][i];
		}
	}

if(Arrays.deepEquals(array1,array2))
{
	System.out.println("it's a symmetric");
}
else
{
	System.out.println("it's not a symmetric");
}

	}
}


/*out put:

enter the rows:
3
enter the columns:
3
enter the elements of first matrix:
1 2 3
2 3 4
4 5 6
check:
it's not a symmetric

*/
