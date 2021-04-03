
public class FunctionOverloadingTest {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.dial();
		byte policeNumber=100;
		byte ambulanceNumber=108;
		byte fireBrigade = 101;
		sp.dial(fireBrigade);
		
		int speedDialForFather=1;
		int speedDialForMother=2;
		int speedDialForSister=3;
		
		sp.dial(speedDialForMother); //
		
		int managerLevel1=4;
		int managerLevel2=5;
		
		sp.dial(managerLevel1,managerLevel2); //dialing manager1 and manager2
		
		sp.dial("Julie"); //dialing by name
		sp.dial(1,"Julia"); //dialing by name
		sp.dial("Janet",2); //dialing by name
		
		Tiger t = new Tiger();
		t.jump(); //the compiler searches the function during compile time
		t.jump(15);
		t.jump("Sam");
		t.jump(15, 12);
		t.jump("Jack", 12);
		t.jump(14, "Robert");
		t.jump(9, 13, 300);
		//t.jump(456.8);
		
	}
}
			//	innovate your example - unique example

class Tiger {
	void jump() {
		System.out.println("Tiger is jumping....");
	}
	void jump(String name) { //count of args 1 but type is diff
		System.out.println(name +" Tiger is jumping....");
	}
	void jump(int jumpLength) { //count of args 1 but type is diff
		System.out.println(" Tiger is jumping...."+jumpLength+" feet ");
	}
	void jump(String name, int jumpLength) { //type and count is same, sequence is diff
		System.out.println(name +" Tiger is jumping...."+jumpLength+" feet");
	}
	void jump(int jumpLength, String name ) { //type and count is same, sequence is diff
		System.out.println("Tiger is jumping...."+jumpLength+" feet, Tiger name is "+name);
	}
	void jump(int jumpLength, int jumpHeight) { //type is same, but count is diff
		System.out.println(" Tiger is jumping...."+jumpLength+" feet "+" with height "+jumpHeight+" feet");
	}
	void jump(int jumpLength, int jumpHeight,int weight) { //type is same, but count is diff
		System.out.println(weight+"kg Tiger is jumping...."+jumpLength+" feet "+" with height "+jumpHeight+" feet");
	}
}
class SmartPhone {
	void dial() {		System.out.println("Simply dialing any number....");	    }
	void dial(int num, String name) {	System.out.println(1+" Dialing ..."+name);	}
	void dial(String name,int num) {System.out.println(name+" Dialing ..."+num);	}
	void dial(String name)	{		System.out.println("Dialing...."+name);     	}
	void dial(int number1, int number2) //type is same, but number of arguments are different
	{
		System.out.println("Dialing to both the managers for a conference call...");
	}
	void dial(int number) { //number of args is same but type is int
		if(number==1) {
			System.out.println("Dialing father...");
		}
		else if(number==2) {
			System.out.println("Dialing mom...");
		}
		else if(number==3) {
			System.out.println("Dialing sister...");
		}
	}
	void dial(byte number) { //number of args is same but type is byte
		if(number==100)
			System.out.println("Dialing Police.."+number);
		else if(number==101)
			System.out.println("Dialing FireBrigade.."+number);
		if(number==108)
			System.out.println("Dialing Ambulance.."+number);
	}
}