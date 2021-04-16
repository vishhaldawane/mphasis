import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
		Contact cnt1 = new Contact("Julie","9876534232","julie@gmail.com");
		Contact cnt2 = new Contact("Julia","8876534232","julia@gmail.com");
		Contact cnt3 = new Contact("Janet","7776534232","janet@gmail.com");
		Contact cnt4 = new Contact("Jane","5576534232","jane@gmail.com");
		Contact cnt5 = new Contact("Milli","4476534232","milli@gmail.com");
		Contact cnt6 = new Contact("Rose","3376534232","rose@gmail.com");
		System.out.println("Content ready....");
		
		LinkedList<Contact> myContactList = new LinkedList<Contact>();
		System.out.println("Container is ready....");
		
		myContactList.add(cnt1);
		
		myContactList.add(cnt2);
		myContactList.add(cnt2);
		
		myContactList.add(cnt3);
		myContactList.add(cnt4);
		
		myContactList.add(cnt5);
		myContactList.add(cnt5);
		
		myContactList.add(cnt6);
		System.out.println("Content is added.....");
		
		Iterator<Contact> iter = myContactList.iterator();
		System.out.println("Stepping through the container.....via iterator....");
		
		while(iter.hasNext()) {
			Contact cnt = iter.next();
			System.out.println("Contact : "+cnt);
		}
	}
}

class Contact
{
	String contactName;
	String contactNumber;
	String emailAddress;
	
	Contact(String contactName, String contactNumber, String emailAddress) {
		super();
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", contactNumber=" + contactNumber + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
	
}
