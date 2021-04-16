import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class MobileLogTest {
	public static void main(String[] args) {
		
		//content | Water
		System.out.println("Creating content....");
		Log l1 = new Log("Missed",new Date(), "Julie");
		Log l2 = new Log("Dialled",new Date(), "Robert");
		Log l3 = new Log("Recieved",new Date(), "Jane");
		Log l4 = new Log("Missed",new Date(), "Julia");
		Log l5 = new Log("Dialled",new Date(), "Jack");
		System.out.println("Content....created...");
		
		//container | Glass
		ArrayList<Log> myLogList = new ArrayList<Log>();
		System.out.println("Container is ready...");
		
		System.out.println("Adding content in the container...");
		//adding the content(WATER) in the container(GLASS)
		myLogList.add(l1);
		myLogList.add(l2);
		myLogList.add(l3);
		myLogList.add(l4);
		myLogList.add(l5);
		System.out.println("Adding is done....");
		
		//capturing straw to access content(Water) from the container(glass)
		System.out.println("Iterating through the container...");
		Iterator<Log> myIter = myLogList.iterator();
		while(myIter.hasNext()) {
			Log x = myIter.next();
			System.out.println("Log is : "+x);
		}
	}
}

class Log
{
	String logType;
	Date logDate;
	String name;
	
	Log(String logType, Date logDate, String name) {
		super();
		this.logType = logType;
		this.logDate = logDate;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Log [logType=" + logType + ", logDate=" + logDate + ", name=" + name + "]";
	}
	
}

