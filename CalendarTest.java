import java.util.Calendar;
import java.util.TimeZone;

public class CalendarTest {
	public static void main(String[] args) {
		
		//America/New_York	Japan	 Europe/London Asia/Kolkata
		
		
		/*String allIds [] = TimeZone.getAvailableIDs();
		
		for (int i = 0; i < allIds.length; i++) {
			System.out.println("Id "+allIds[i]);
		}*/
		
		TimeZone tz1 = TimeZone.getTimeZone("Japan");
		TimeZone tz2 = TimeZone.getTimeZone("America/New_York");
		TimeZone tz3 = TimeZone.getTimeZone("Europe/London");
		TimeZone tz4 = TimeZone.getTimeZone("Asia/Kolkata");
		
		Calendar cal1 = Calendar.getInstance(tz1);
		Calendar cal2 = Calendar.getInstance(tz2);
		Calendar cal3 = Calendar.getInstance(tz3);
		Calendar cal4 = Calendar.getInstance(tz4);
	
		printDateAndTime(cal1);
		printDateAndTime(cal2);
		printDateAndTime(cal3);
		printDateAndTime(cal4);
		
	}
	public static void printDateAndTime(Calendar x) {
		System.out.println("-- date/time of "+x.getTimeZone().getID());
		System.out.println("Day : "+x.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mon : "+(x.get(Calendar.MONTH)+1));
		System.out.println("Year: "+x.get(Calendar.YEAR));
		System.out.println("HOUR: "+x.get(Calendar.HOUR_OF_DAY));
		System.out.println("MNT : "+x.get(Calendar.MINUTE));
		System.out.println("SEC : "+x.get(Calendar.SECOND));
		System.out.println("-------------------");
	}
}
