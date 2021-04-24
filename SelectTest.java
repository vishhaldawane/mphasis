import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
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

			ResultSet rs = st.executeQuery("select * from dept"); // type the query here
			System.out.println("Query fired...and got the result....");
			System.out.println("Now processing the result....."); //5th step : process the result
			while(rs.next()) { // process the result set like a cursor program
				int deptno = rs.getInt(1); 	String dname = rs.getString(2); // dname
				String loc = rs.getString(3); System.out.println("DEPTNO : "+deptno);
				System.out.println("DNAME  : "+dname);System.out.println("LOC    : "+loc);
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

