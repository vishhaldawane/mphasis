
public class PassingObjectAndReturningObjectTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		mm.calculateAreaOfCircle1();	System.out.println("-------------");
		
		mm.calculateAreaOfCircle2(26.7f);	System.out.println("-------------");
		
		float myRad=146.7f;
		float myArea = mm.calculateAreaOfCircle3(myRad);
		System.out.println("rad  is "+myRad);	System.out.println("area is "+myArea);
		System.out.println("-------------");
		
		float myRad1=89.4f;
		float myArea1 = mm.calculateAreaOfCircle4();
		System.out.println("rad1  is "+myRad1);
		System.out.println("area1 is "+myArea1);
		System.out.println("-------------");
	}
}

class MyMath {
	void calculateAreaOfCircle1() { //1st type - no arg + no return
		float radius=89.6f; //radius is always 89.6
		float PI=3.14f;		float area = radius * radius * PI;
		System.out.println("Radius is : "+radius);
		System.out.println("1. Area of Circle is : "+area);
	}
	void calculateAreaOfCircle2(float radius) { //1st type - no arg + no return
		float PI=3.14f;		float area = radius * radius * PI;
		System.out.println("Radius is : "+radius);
		System.out.println("2. Area of Circle is : "+area);
	}
	float calculateAreaOfCircle3(float radius) { //1st type - no arg + no return
		float PI=3.14f;		
		float area = radius * radius * PI;	
		return area;
	}
	float calculateAreaOfCircle4() { //1st type - no arg + no return
		float radius = 56.7f;	float PI=3.14f;	 float area = radius * radius * PI;
		return area;
	}
}
