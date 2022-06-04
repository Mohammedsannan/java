/*Write a Java program to compare two hash set    DATE--2/05/2022  */

import java.util.*;

class compset{
	public static void main(String ar []){

	//create a empty hash set
	HashSet<String>hsA=new HashSet<String>();
	hsA.add("red");
	hsA.add("blue");
	hsA.add("white");
	hsA.add("pink");
	hsA.add("yellow");

	System.out.println("\nelements in the hashset1: "+hsA);


	HashSet<String>hsB=new HashSet<String>();
	hsB.add("orange");
	hsB.add("violet");
	hsB.add("pink");
	hsB.add("green");
	hsB.add("red");

	System.out.println("\nelements in the hashset2: "+hsB);
	System.out.println("\ncomparing two hashsets hsA & hsB");
	System.out.println("--------------");
	for(String element:hsA){

		if(hsB.contains(element)){
			System.out.println("\nhashsets hsA & hsB have element "+element);
			}
		else{
			System.out.println("\nelement "+ element +" is only in one hashset");
			}
	}

		System.out.println("\n whether both sets are equal:"+hsA.equals(hsB));
}
}

/*output:

elements in the hashset1: [red, pink, blue, white, yellow]

elements in the hashset2: [orange, red, pink, green, violet]

comparing two hashsets hsA & hsB
--------------

hashsets hsA & hsB have element red

hashsets hsA & hsB have element pink

element blue is only in one hashset

element white is only in one hashset

element yellow is only in one hashset

 whether both sets are equal:false

 */
