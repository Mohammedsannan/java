/*1. Write a user defined exception class to authenticate
the user name and password.*/

import java.util.*;
class myException extends Exception {
	public myException(String s){
		super(s);
	}
}

class main{
	public static void main(String ar[]){
		String username="pvsanan";
		String password="neymar";
		Scanner sc=new Scanner(System.in);
		System.out.print("enter username:");
		String u=sc.next();
		System.out.print("enter password:");
		String p=sc.next();
		try{
		if((u.equals(username))&&(p.equals(password))){
		System.out.println("authentication success");
		}
		else {
			throw new myException("authentication failed...!");
}
}
catch(myException ex){
		System.out.println(ex.getMessage()+"\n");
}
}
}


/*out put:

enter username:sanan
enter password:sanan123
authentication failed...!

enter username:pvsanan
enter password:neymar
authentication success
*/
