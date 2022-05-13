/*Create a Graphics package that has classes and interfaces for
figures Rectangle, Triangle, Square and Circle. Test the package by
finding the area of these figures.*/

import graphics.*;


class p{
	public static void main(String ar[]){
				Rectangle r=new Rectangle();
				r.area(8,7);
				Triangle t=new Triangle();
				t.area(10,10);
				Square s=new Square();
				s.area(11);
				Circle c=new Circle();
				c.area(6);

	}


}

/*output:
Area of rectangle having

length=8
breadth=7

Area=56
-----------------
Area of Triangle having

base=10
height=10
Area=50.0
-----------------
Area of Square having

side=11
Area=121
-----------------
Area of Circle having

radius=6.0
Area=113.03999999999999
----------------
*/
