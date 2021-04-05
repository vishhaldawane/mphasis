public class PassingObjectAndReturningObjectTest1 {
	public static void main(String[] args) {
		Milk mlk = new Milk("OffWhite","Cow",3);		mlk.showMilk();
		MilkMan mm = new MilkMan();
		
		//Observe below line, it is NOT --> Curd crd = new Curd();
		Curd crd = mm.coagulate(mlk); //usesA relationship - MilkMan is using Milk to prepare Curd
		crd.showCurd();  //|  //mlk is passed and Curd object is produced
	}//				       |
}	//				       |
class MilkMan { //		   |  //here x is a proxy ( for mlk )
//  return type			   |
//     |                   |	
	  Curd coagulate(Milk x) { //here Milk's object is passed as an argument
		System.out.println("Coagulating "+x.quantity+" ltr "+x.type+" milk...to prepare Curd.");
		Curd c = new Curd("White","Cow",2,"Thick");
		return c;
	  } //this function must produce object of Curd type
	  
	/*void coagulate(Milk x) { //here Milk's object is passed as an argument
		System.out.println("Coagulating "+x.quantity+" ltr "+x.type+" milk...to prepare Curd.");
	}*/
}
class Curd
{
	private String color;
	String type;	int quantity; // in Kgs 
	String density; // 
	
	Curd(String color, String type, int quantity, String density) {
		super();
		this.color = color;		this.type = type;
		this.quantity = quantity;	this.density = density;
	} 
	void showCurd() {
		System.out.println("Curd Color    : "+color);
		System.out.println("Curd Type     : "+type);
		System.out.println("Curd Quantity : "+quantity);
		System.out.println("Curd Density  : "+density);
	}
}

class Milk {
	private String color;	String type;	int quantity; //in ltr
	Milk(String color, String type, int quantity) {		super();
		this.color = color;		this.type = type;		this.quantity = quantity; }
	void showMilk() {		System.out.println("Milk Color    : "+color);
		System.out.println("Milk Type     : "+type);
		System.out.println("Milk Quantity : "+quantity);
	}
}

