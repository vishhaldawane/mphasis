//creator ---creativity-> creation
//	YOU						
public class BankTest {
	public static void main(String[] args) {
		System.out.println("Begin banking....");
		//
		
		BankAccount ba1 = new BankAccount(1234);
		BankAccount ba2 = new BankAccount(2234,"Deepkia");
		BankAccount ba3 = new BankAccount(4234,"Deepika",875000,7890,"Chennai"); 
		
		ba1.showBankAccountDetails();
		ba1.withdraw(55222);
		ba1.withdraw(95222);
		ba1.withdraw(75222);
		ba1.withdraw(85222);
		
		ba1.deposit(22223);
		
		ba2.showBankAccountDetails();
		ba3.showBankAccountDetails();
	} //ctrl +F11 short cut to run
}
class BankAccount { 		
	//below is a contract of 5 fields  + 6 methods
	private int bankAccountNumber; 		private String bankAccountHolderName;	
	private double bankAccountBalance;	private int bankAccountPinNumber; 
	private String bankAccountHolderAddress; 

	//1
	BankAccount() { System.out.println("BankAccount constructor.....");	}
	//explicit fully parameterized contructor
	
	//2
	BankAccount(int a, String b, double c, int d, String e) {
		
		System.out.println("BankAccount(int,String,double,int,String) fully parameterized constructor.....");
		bankAccountNumber=a; 	bankAccountHolderName=b; 
		bankAccountBalance=c;	bankAccountPinNumber=d; 	bankAccountHolderAddress=e;
	}
	
	//3
	BankAccount(int a) {
		System.out.println("BankAccount(int) constructor.....");
		bankAccountNumber=a; 	 
	}
	
	
	//4
	BankAccount(int a, String b) {
			System.out.println("BankAccount(int,String) parameterized constructor.....");
			bankAccountNumber=a; 	bankAccountHolderName=b; 
	}
	
	//5
	BankAccount(int a, String b, double c) {
			System.out.println("BankAccount(int,String,double) parameterized constructor.....");
			bankAccountNumber=a; 	bankAccountHolderName=b; 
			bankAccountBalance=c;	
	}
	
	//6
	BankAccount(int a, String b, double c, int d) {
			System.out.println("BankAccount(int,String,double,int) parameterized constructor.....");
			bankAccountNumber=a; 	bankAccountHolderName=b; 
			bankAccountBalance=c;	bankAccountPinNumber=d; 	
	}
	
	//7
	BankAccount(String b) {
				System.out.println("BankAccount(String) parameterized constructor.....");
				bankAccountHolderName=b; 
	}
		
	void showBankAccountDetails() {
		System.out.println("Bank Account Number          : "+bankAccountNumber);
		System.out.println("Bank Account Holder          : "+bankAccountHolderName);
		System.out.println("Bank Account Balance         : "+bankAccountBalance);
		System.out.println("Bank Account Pin             : "+bankAccountPinNumber);
		System.out.println("Bank Account Holders Address : "+bankAccountHolderAddress);
		System.out.println("---------------------------------");
	}

	void withdraw(double d) { //member method - to have a banking withdraw logic 
		System.out.println(bankAccountHolderName+" is withdrawing...");
//						870000
//		876000		  875000  - 5000
		if(d < 0 ) {
			System.out.println("Withdraw amount cannot be negative....");
		}
		else if(d > bankAccountBalance) {
			System.out.println("Cannot withdraw...more than the actual balance......");
		}
		else if(d > (bankAccountBalance-5000) ) //bank wants to maintain 5000 as min balance
			System.out.println("Cannot withdraw...min balance must be maintained...");
		else {
			System.out.println("Withdrawing..."+d);
			bankAccountBalance = bankAccountBalance - d;
		}
	}
	void deposit(double d) { //member method OR funcionality service
		System.out.println(bankAccountHolderName +" is depositing...");
		bankAccountBalance = bankAccountBalance + d;
	}
	void changePin() { //member method
		System.out.println(bankAccountHolderName +" is chaning Pin...");
	}
	void changeAddress() { //member method
		System.out.println(bankAccountHolderName+" is changing Address...");
	}
}

/*
ba1.bankAccountNumber=1234; //object fields are filled up 
ba1.bankAccountHolderName="Deepik@ Bondili";
ba1.bankAccountBalance=1999887465;
ba1.bankAccountPinNumber=7890;
ba1.bankAccountHolderAddress="ChennaiAndMumbai";

ba2.bankAccountNumber=2234; //object fields are filled up 
ba2.bankAccountHolderName="Prudvi Reddy";
ba2.bankAccountBalance=-7465;
ba2.bankAccountPinNumber=-4890;
ba2.bankAccountHolderAddress="K0lk@tta";

ba3.bankAccountNumber=6234; //object fields are filled up 
ba3.bankAccountHolderName="Venk@t $@i";
ba3.bankAccountBalance=9787465;
ba3.bankAccountPinNumber=3890;
ba3.bankAccountHolderAddress="Delhi";
*/