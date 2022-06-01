/* Define 2 classes; one for generating Fibonacci
numbers and other for displaying even numbers in a
given range. Implement using threads. (Runnable
Interface) */

import java.util.*;

class Fibonacci implements Runnable{
int n;
Fibonacci(int a){
this.n=a;

}

public void run(){

int a=0,b=1;
try{if(n==1){
System.out.println("fibonacci series \n -->0");

}
else{
int f=0;
System.out.println("fibonacci -->0\nfibonacci -->1");
while(0<n-2){
f=a+b;
a=b;
b=f;
System.out.println("fibonacci -->"+f);
n--;
Thread.sleep(1000);
}

}
}
catch(Exception e){
System.out.println("something wrong");
}
}
}

class Even implements Runnable{
int e;
Even(int a){
this.e=a;

}
public void run(){
//System.out.println("Even numbers between 0 to "+e);
try{for(int i=1;i<=e;i++){
if(i%2==0){
System.out.println("even number -->"+i);
Thread.sleep(1000);
}

}
}
catch(Exception e){
System.out.println("something wrong");
}

}

}





class thrd2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter a number:");
int u=sc.nextInt();

Fibonacci f= new Fibonacci(u);
Thread th = new Thread(f);


Even e =new Even(2*u);
Thread th1 = new Thread(e);
th1.start();
th.start();
/*try{

Thread.sleep(1000);
}
catch(Exception ex){
System.out.println(e);
}*/

/* output:

enter a number:
11
even number -->2
fibonacci -->0
fibonacci -->1
fibonacci -->1
even number -->4
fibonacci -->2
even number -->6
fibonacci -->3
even number -->8
fibonacci -->5
fibonacci -->8
even number -->10
even number -->12
fibonacci -->13
even number -->14
fibonacci -->21
even number -->16
fibonacci -->34
even number -->18
fibonacci -->55
even number -->20
even number -->22
*/


}

}


