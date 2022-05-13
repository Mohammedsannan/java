/*3. Prepare bill with the given format using
calculate method from interface.*/
import java.util.* ;
interface billgen{
	int calculate( ) ;
}
class Productb implements billgen {
	String name ;
	int prodid , quantity , unitprice , total ;
	Productb ( ){}
	Productb( String n , int p , int q , int u){
		name = n ; 
		prodid = p ;
		quantity = q ;
		unitprice = u ;
	}
	public int calculate ( ) {
		total = quantity * unitprice ;
		return total ;
	}
}
public class bill {
	public static void main ( String [ ] args ) {
		Productb [ ] [ ] order ;
		System.out.println (" Enter no. of orders : " ) ;
		Scanner sc = new Scanner ( System.in ) ;
		int n = sc.nextInt ( ) ;
		order = new Productb[n][ ] ;
		for ( int i = 0 ; i < n ; i++){
			System.out.print(" Enter no. of Products : " ) ;
			int m = sc.nextInt ( ) ;
			order[i] = new Productb[m] ;
			for (int j = 0 ; j < m; j++ ){
				System.out.print (" Enter Product " + j + " Name : " ) ;
				String a = sc.next ( ) ;
				System.out.print(" Enter Product ID: " ) ;
				int b = sc.nextInt ( ) ;
				System.out.print (" Enter Product Quantity : " ) ;
				int c = sc . nextInt ( ) ;
				System.out.print (" Enter Product Unit Price : " ) ;
				int d = sc .nextInt ( ) ;
				Productb pb = new Productb ( a , b , c , d ) ;
				order [ i ] [ j ] = pb ;
				order [ i ] [ j ] . total = order [ i ] [ j ] . calculate ( ) ;
			}
		}
		for(int i = 0 ; i < n ; i++){
			int sum = 0 ;
			System.out.println("Order No : " + ( i +1) ) ;
			Date date=java.util.Calendar.getInstance() . getTime ( ) ;
			System.out.println( date ) ;
			System.out.println("__________________________________________________________________________________________");

			System.out.printf ("%5s %20s %25s %10s %10s " ,"ProdId " ,"Name" , "Quantity " , " Unit Price " ," Total " ) ;
			System.out.println ( ) ;
			System.out.println("__________________________________________________________________________________________");

			for( int j =0; j<order [ i ] . length ; j++){
				System.out.printf ("%5s %20s %25s %10s%10s " ,order[i][j].prodid ,order [ i ] [ j ] . name ,	order [ i ] [ j ] . quantity ,
				order [ i ] [ j ] . unitprice ,order [ i ] [ j ] . total ) ;
				System.out.println ( ) ;
			}
			System.out.println("___________________________________________________________________________________________");
			for ( int k=0; k<order [i] . length ; k++)
				sum = sum + order[i] [k] . total ;
			System.out.println (" Net Amount : " + sum) ;
			System.out.println("___________________________________________________________________________________________");
			}
		}
}

/* output:

Enter no. of orders : 
2
 Enter no. of Products : 2
 Enter Product 0 Name : iphone
 Enter Product ID: 123
 Enter Product Quantity : 1
 Enter Product Unit Price : 100000
 Enter Product 1 Name : airpod
 Enter Product ID: 124
 Enter Product Quantity : 1
 Enter Product Unit Price : 15000
 Enter no. of Products : 1
 Enter Product 0 Name : earphone
 Enter Product ID: 125
 Enter Product Quantity : 1
 Enter Product Unit Price : 2000
Order No : 1
Fri May 06 15:34:54 IST 2022
__________________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
__________________________________________________________________________________________
  123               iphone                         1     100000    100000 
  124               airpod                         1      15000     15000 
___________________________________________________________________________________________
 Net Amount : 115000
___________________________________________________________________________________________
Order No : 2
Fri May 06 15:34:54 IST 2022
__________________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
__________________________________________________________________________________________
  125             earphone                         1       2000      2000 
___________________________________________________________________________________________
 Net Amount : 2000
___________________________________________________________________________________________

*/

