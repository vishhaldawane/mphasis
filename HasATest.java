
public class HasATest {
	public static void main(String[] args) {
		System.out.println("BEGIN of MAIN");
		WashingMachine washMach1 = new WashingMachine(123,"Samsung", 9);
		washMach1.showWashingMachine();
		washMach1.wash();
		System.out.println("End of MAIN");
	}
}
class Machine {
	private int machineId;	private String company;
	Machine(int machineId, String company) {
		super();		this.machineId = machineId;		this.company = company;
	}
	void showMachine() { System.out.println("Machine Id : "+machineId);
		System.out.println("Company    : "+company);
	}
}
//Yet the washing machine has to "USE" WashingPowder to PRODUCE WashedClothes
class WashingTub {
	private String type; // plastic or steel
	private int capacityInLitre;
	WashingTub(String type, int capacityInLitre) {
		super(); this.type = type;	this.capacityInLitre = capacityInLitre;
	}
	void showWashingTub() {	System.out.println("Washing Tub Type     : "+type);
		System.out.println("Washing Tub Capacity : "+capacityInLitre+" ltr");
	}
}
class WashingMachine extends Machine /*isA*/ {
	int capacity; 										//hasA
	WashingTub washTub = new WashingTub("Steel", 150); //hasA
	
	WashingMachine(int machineId, String company, int capacity) {
		super(machineId, company);		this.capacity = capacity;
	}
	void showWashingMachine() {
		super.showMachine(); System.out.println("Capacity   : "+capacity+" KG");
		washTub.showWashingTub(); // invoke method
	}
	void wash() {	int timer=25;
		do {	System.out.println("Washing clothes....."+timer);	timer--;
		}while(timer>=0);
		rinse(); //nested call
	}
	void rinse() {	int timer=10;
		do {	System.out.println("\tRinsing clothes....."+timer);	timer--;
		}while(timer>=0);
		spin(); //nested call
	}
	void spin() {	int timer=5;
		do {	System.out.println("\t\tSpinning (drying) ....."+timer);timer--;
		}while(timer>=0);
	}
}
