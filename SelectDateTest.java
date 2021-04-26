import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SelectDateTest {
	public static void main(String[] args) {
		try
		{
			//1st step : load the driver
			System.out.println("Trying to load the driver.......");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver loaded....");
		
			//2nd step : connect to the database 
			System.out.println("Trying to connect to the database");
//jdbc:oracle:thin:@localhost:1521:yourInstanceName XE/ORCL/OSE whaterver name found in tnsnames.ora file
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
					+ "@DESKTOP-EPTT35F:1521:XE", "system", "manager");
			System.out.println("Connected to the database");
			
			System.out.println("Trying to make a statement for DQL");	//3rd step : create statement of your choice select(DQL)/DML/PL-SQL(proce/funs)
			Statement st = conn.createStatement(); // this is for DQL
	
			System.out.println("Statement made....for DQL");
			System.out.println("Trying to write a query and fire it... ");	//4th step : fire the statement and acquire result if any

			//Scanner scan = new Scanner(System.in);
			//String date = scan.next(); //what if the date comes from date control from a UI
			
		
			// java.text.SimpleDateFormat;
			java.util.Date myDate = null;
			
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateInString = "1981-12-03 12:00:00"; //from any UI control - then u should be knowing the format of the UI 
				myDate = formatter.parse(dateInString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			System.out.println("dt is "+myDate);
			
		
			ResultSet rs = st.executeQuery("select * from emp where to_char(hiredate,'Dy Mon DD HH:MI:SS YYYY')="+"'"+myDate+"'"); // type the query here
			
			
			
			System.out.println("Query fired...and got the result...."+rs);
			
			System.out.println("Now processing the result....."); //5th step : process the result
			while(rs.next()) { // process the result set like a cursor program
				int x = rs.getInt(1); 	String y = rs.getString(2); // dname
				String z = rs.getString(3); 
				java.sql.Date dt = rs.getDate(5); //not from java.util
				
				System.out.println("x  : "+x);
				System.out.println("y  : "+y);
				System.out.println("x  : "+z);
				System.out.println("dt : "+dt);
				
				System.out.println("---------------------------");
			}
			System.out.println("RESULT PROCESSED...."); 	//step 6 : close db resources 
			System.out.println("Trying to close ResultSet,Statement,Connection....");
			rs.close(); st.close();  conn.close();  // close DB resources
			System.out.println("ResultSet,Statement,Connection closed....");
			System.out.println("End of main..."); 
		}
		catch(SQLException e) {
			System.out.println("Some SQL problem : "+e);
		}
	}
}

