//creator ---creativity-> creation
//	YOU						
public class BankTest {
	public static void main(String[] args) {
		System.out.println("Begin banking....");
		BankAccount ba1 = new BankAccount(); 	 
		ba1.setBankAccountDetails(1234,"Deepika",875000,7890,"Chennai");
		ba1.showBankAccountDetails(); 	
		//RC HA MT P C T S
		//ba1.withdraw(800000);//process
		
		//ba1.bankAccountBalance = 2100000;			A (boy)		--->  B (girl)
		ba1.withdraw(2100000);
		
		ba1.showBankAccountDetails();
		
		//ba1.bankAccountBalance = -2100000;
		ba1.withdraw(-2100000);
		
		ba1.showBankAccountDetails();
		
		ba1.withdraw(12000);
		
		ba1.showBankAccountDetails();
		
		
	} //ctrl +F11 short cut to run
}
//above main method is not the member of class BankAccount 
class BankAccount { 		
	//below is a contract of 5 fields  + 6 methods
	private int bankAccountNumber; 	 //private members are available within the class
	private String bankAccountHolderName;	//but not to the outside code
	private double bankAccountBalance;	
	private int bankAccountPinNumber; 
	private String bankAccountHolderAddress; 
	
	void setBankAccountDetails(int a, String b, double c, int d, String e) {
		System.out.println("Setting bank Account details....");
		bankAccountNumber=a; 	bankAccountHolderName=b; 
		bankAccountBalance=c;	bankAccountPinNumber=d; 	bankAccountHolderAddress=e;
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