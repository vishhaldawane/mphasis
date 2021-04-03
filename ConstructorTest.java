
public class ConstructorTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		
//		name of 	ref allocation  constructor of this class
//		the class	|	 |			  |
		Doctor 		d1 = new 		Doctor();
		Doctor 		d2 = new 		Doctor();
		Doctor 		d3 = new 		Doctor();
		
		Doctor		d4 ; //first reference is created
		
		d4 = new Doctor(); // and now reference is initialized
		
		d1.diagnose();
		d2.diagnose();
		d3.diagnose();
		d4.diagnose();
		System.out.println("End main");
	}
}
class Doctor
{
	Doctor() { //its visible to all of us / hence EXPLICIT CTOR
		System.out.println("Doctor constructor invoked...");
	}
	void diagnose() {
		System.out.println("Doctor is diagnosing....");
	}
}

class Kite // do we have a constructor in this class
{
	//yes we do have a constructor in this class
	// and that is NOT VISIBLE
	// IT IS KNOWN AS 
		// 1. DEFAULT CONSTRUCTOR	or
		// 2. IMPLICIT NO-ARG CONSTRUCTOR
	
}
//any class can EITHER HAVE IMPLICIT OR EXPLICIT CONSTRUCTOR
//, BUT NOT BOTH

//default constructor is NOT provided, if a java developer provides
//an explicit constructor

class Planet
{

}

//in this class there is a constructor present
	//that is not visible to all of us
	// it is known "IMPLICIT NO-ARG CONSTRUCTOR"
	// ALSO KNOWN AS THE "DEFAULT CONSTRUCTOR"
	// WHAT THE PURPOSE CONSTRUCTOR???????
	//IT IS INVOKED DURING OBJECT CREATION LINE
