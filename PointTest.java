class GrandFather {
	GrandFather() { 
		super();  //invoked the constructor of Object class 		
		System.out.println("GrandFather Constructor...");	}
	void farming() {	System.out.println("GrandFather is farming...");	}
}
class Father extends GrandFather {
	Father() {	
		super(); // its a by default line of every ctor
		System.out.println("Father Constructor...");
	}
	//Father() { }
	void banking() {	System.out.println("Father is banking...");	}
}
class Child extends Father {
	Child() {	
		super(); //IT IS ALWAYS the first line
		System.out.println("Child Constructor...");
	}
	void javaCoding() {	System.out.println("Child is Coding Java...");	}
}

class Person  { //gender age name 
	
}
class Student extends Person { // marks grade
	
}
class Employee extends Student {  // salary 
	
}

// if u are an Employee, and apply in an organization
// which details would be verified first


public class PointTest {
	public static void main(String[] args) {
	/*	GrandFather gf = new GrandFather();		gf.farming(); System.out.println("---------");
		Father f = new Father(222);				f.banking();  System.out.println("---------");
		Child c = new Child(333);					c.javaCoding();
		*/
		
		Point2D p1 = new Point2D(75,80);
		p1.showPoint2D();
		System.out.println("---------------");
		Point3D p2 = new Point3D(10,20,30);
		p2.showPoint3D(); 
		System.out.println("---------------");
		
		ColouredPoint3D cp3d = new ColouredPoint3D(40, 50, 60, "Red");
		cp3d.showColouredPoint3D();
	}
}

//every java class has a super class knonw as "Object"
class Point2D { //any bug / any future improvement
			//wont reflect in the Point3D
	private int x;	private int y;
	Point2D(int x, int y) {
		super(); //<---- this line is a call to super class constructor
		System.out.println("Point2D constructor...");
		
		if(x<0) {
			System.out.println("x cannot be negative...");
		}
		else
			this.x = x;		
		
		if(y<0) {
			System.out.println("y cannot be negative...");
		}
		else
			this.y = y;
	}
	
	void showPoint2D() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("------------------");
	}
}
class Point3D extends Point2D //inherit the properties of Point2D
{
	//x and y is also created for this Point3D
	//we dont have to write these two lines of x and y
	private int z;
	
	Point3D(int a, int b, int c) { //10,20,30
		super(a,b); // setting of x and y is done here
		System.out.println("Point3D constructor...");
		if(c<0) { System.out.println("z cannot be negative...");	}
		else	this.z = c;
	}
	void showPoint3D() {
		super.showPoint2D(); //reuse the code
		System.out.println("z "+z);
	}
} 
class ColouredPoint3D extends Point3D //inherit the properties of Point2D
{
	//x, y and z are created for this ColouredPoint3D
	private String color;
	
	ColouredPoint3D(int a, int b, int c, String col) { //10,20,30
		super(a,b,c); // setting of x and y is done here
		System.out.println("ColouredPoint3D constructor...");
		
		this.color = col;
	}
	void showColouredPoint3D() {
		super.showPoint3D(); //reuse the code
		System.out.println("colour "+color);
	}
} 

//super() is to invoke only the constructor of the super class
//super. is to invoke any member of the super class

/*
class Point3D
{
	private int x;	private int y;  
	private int z;// <==
							//<==
	Point3D(int x, int y, int z) {
		super(); //<---- this line is a call to super class constructor
		System.out.println("Point3D constructor...");
		this.x = x;		this.y = y;
		this.z = z; //<===
	}
	void showPoint3D() {
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("z "+z); //<==
		System.out.println("------------------");
	}
}
*/