/* 3. Program to remove an object from the Stack when the position is passed
as parameter.*/

import java.util.*;
class stackdemo{
	
	public static void main(String args[]){
	Stack<String>stack=new Stack<String>();

	//creating stack by adding elements
	stack.push("BMW");
	stack.push("JAGUAR");
	stack.push("FERRARI");
	stack.push("ford");
	stack.push("benz");

	System.out.println("original contents in the stack is:"+stack);
	System.out.println("size of stack:"+stack.size());

	System.out.println("----------------------\n");

	//removing elements from the stack
	stack.removeElementAt(2);
	System.out.println("contents in stack after removing elements @ index position 2:"+stack);
						}
		}

/* output:

original contents in the stack is:[BMW, JAGUAR, FERRARI, ford, benz]
size of stack:5
----------------------

contents in stack after removing elements @ index position 2:[BMW, JAGUAR, ford, benz]
*/
