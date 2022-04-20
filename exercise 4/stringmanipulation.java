class strmanipulation{
	public static void main(String[] args){
	// new string using new
	char chs[] = {'w','e','l','c','o','m','e'};
	String newstr = new String(chs);
	System.out.println("new string from char[] using new string: "+ newstr);

	byte asciis[] = {65, 66, 67, 68, 69, 70};
	newstr = new String(asciis);
	System.out.println("new string from byte[] using new string: "+ newstr);
	
	String s1 = "good";
	String s2 = "morning";

	// string length
	System.out.println("string length of 'good': "+ s1.length());

	//to uppercase and lowercase
	System.out.println("------string case change------");
	System.out.println(s1 + " to uppercase: "+ s1.toUpperCase());
	System.out.println(s2 + " to lowercase: "+ s2.toLowerCase()); 

	//string concatenation
	System.out.println("------string concatenation------");
	System.out.println("using concat(): "+ s1.concat(s2));
	System.out.println("using + operator: "+ s1 + s2);
	
	//character extraction
	System.out.println("------character extraction------");
	System.out.println("character at 3rd position: "+ s1.charAt(3));
	char c[] = new char[5];
	s1.getChars(2,4,c,0);
	System.out.println("character between 2 and 4 : "+ new String(c));

	System.out.println("------character comparison------");
	s1 = "welcome";
	s2 = "WELCOME";
	System.out.println(s1 + " Equals " + s2 + " : " + s1.equals(s2));
	System.out.println(s1 + " equalsIgnoreCase " + s2 + " : " +s1.equalsIgnoreCase(s2));

	System.out.println(s1 + " compareTo " + s2 + " : " + s1.compareTo(s2));
	System.out.println(s1 + " equalsIgnoreCase " + s2 + " : " +s1.equalsIgnoreCase(s2));

	System.out.println(s1 + " startwith w : " +s1.startsWith("w"));
	System.out.println(s1 + " endswith  x : " +s1.endsWith("x"));

	
	System.out.println("\n---------Search Substring------------\n");
		s1= "hello alexa how how are you";
		System.out.println(s1 +" indexOf(how) : "+s1.indexOf("how"));
		System.out.println(s1 +" lastIndexOf(how) : "+s1.lastIndexOf("how"));


		System.out.println("\n---------Modifying a string------------\n");
		s1="welcome to java";
		
		System.out.println(s1+"<--> replace java to python: "+s1.replace("java","python"));



		System.out.println("\n---------Data conversion using valueOf()------------\n");
		int i=10;
		
		System.out.println(i +" is covert using Data conversion using valueOf() : "+String.valueOf(i));
		
		System.out.println("concat 100 with string "+i+":"+100 + String.valueOf(i));
		
 


	}
}




/* output:
new string from char[] using new string: welcome
new string from byte[] using new string: ABCDEF
string length of 'good': 4
------string case change------
good to uppercase: GOOD
morning to lowercase: morning
------string concatenation------
using concat(): goodmorning
using + operator: goodmorning
------character extraction------
character at 3rd position: d
character between 2 and 4 : od
------character comparison------
welcome Equals WELCOME : false
welcome equalsIgnoreCase WELCOME : true
welcome compareTo WELCOME : 32
welcome equalsIgnoreCase WELCOME : true
welcome startwith w : true
welcome endswith  x : false

---------Search Substring------------

hello alexa how how are you indexOf(how) : 12
hello alexa how how are you lastIndexOf(how) : 16

---------Modifying a string------------

welcome to java<--> replace java to python: welcome to python

---------Data conversion using valueOf()------------

10 is covert using Data conversion using valueOf() : 10
concat 100 with string 10:10010

*/
