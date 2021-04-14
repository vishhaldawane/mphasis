import java.util.InputMismatchException;
import java.util.Scanner;

//java   DivideTest
// |		|
//"main"	p s v main(String args[]){}

public class DivideTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//press ctrl +shift + M 
		System.out.println("Begin");
		try
		{
			System.out.println("Setting x...");
			int x=scan.nextInt();			System.out.println("x : "+x);
			System.out.println("Setting y...");
			int y=scan.nextInt(); 			System.out.println("y : "+y);
			System.out.println("Dividing x/y...setting z");
			int z=x/y; //susceptible
			System.out.println("z : "+z);
		}
		catch(InputMismatchException e) {
			System.out.println("Input is wrong");
		}
		catch(ArithmeticException e) {//show error
			System.out.println("Cannot divide by zero...");
		}

		System.out.println("End");
		
	}
}
