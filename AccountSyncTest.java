
public class AccountSyncTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(101,"Suresh",50000);
		System.out.println("Before deposits : ba : "+ba);//it invoked toString()
		
		Teller teller1 = new Teller("Medha",ba,5000);
		Teller teller2 = new Teller("Swetha",ba,7000);
		Teller teller3 = new Teller("Marina",ba,8000);
		
		teller1.start();
		teller2.start();
		teller3.start();
		try {
			teller1.join();
			teller2.join();
			teller3.join();
		}catch(InterruptedException e) { } 
		
		System.out.println("After deposits : ba : "+ba);//it invoked toString()
		
	}
}
class BankAccount {
	private int accNumber;
	private String accHolder;
	private double accBalance;
	
	BankAccount(int accNumber, String accHolder, double accBalance) {
		super();
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}
	public String toString() { //overridden method
		return accNumber+" "+accHolder+" "+accBalance;
	}
	public void showBankAccount() {
		System.out.println("Bank Acc Num    : "+accNumber);
		System.out.println("Bank Acc Holder : "+accHolder);
		System.out.println("Bank Acc Balance: "+accBalance);
	}
	
	void deposit(double amt) {
		System.out.println("Depositing....");
		double currentBalance = getBalance();
		System.out.println("Balance got");
		
		System.out.println("Calculating...");
		double newBalance = currentBalance + amt;
		System.out.println("Calculated...");
		
		setBalance(newBalance);
		System.out.println("Balance is set...");
	}
	
	//assume below methods are dealing with DATABASE
	private double getBalance() {
		System.out.println("Trying to read the balance...");
		try { Thread.sleep(400); } catch(InterruptedException e) { }
		return accBalance;
	}
	private void setBalance(double amt) {
		System.out.println("Trying to set the balance...");
		try { Thread.sleep(400); } catch(InterruptedException e) { }
		accBalance = amt;
	}
}

class Teller extends Thread //Method A
{
	String tellerName;
	BankAccount baRef; //hasA
	double amountToDeposit;
	
	Teller(String telName, BankAccount x, double amtToDepo) {
		tellerName = telName;
		baRef = x;
		amountToDeposit = amtToDepo;
	}
	public void run() {
		System.out.println("Teller "+tellerName+" started depositing..."+amountToDeposit);
		baRef.deposit(amountToDeposit);
	}
}
