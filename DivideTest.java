import java.util.Scanner;

//java   DivideTest
// |		|
//"main"	p s v main(String args[]){}

public class DivideTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//press ctrl +shift + M 
		System.out.println("Begin");
		System.out.println("Setting x...");
		int x=scan.nextInt();
		System.out.println("x : "+x);
		
		System.out.println("Setting y...");
		int y=scan.nextInt();
		System.out.println("y : "+y);
		
		System.out.println("Dividing x/y...setting z");
		//if(y!=0) {//checking for business
		try {
			int z=x/y; //susceptible
			System.out.println("z : "+z);
			System.out.println("line3");
			System.out.println("line4");
			System.out.println("line5");
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Some division issue .... "+e);
			System.out.println("Some division issue .... "+e.getMessage());
			
		}
		//}
		//else {//show error
		//	System.out.println("Cannot divide by zero...");
		//}
		
		System.out.println("End");
		
	}
}
