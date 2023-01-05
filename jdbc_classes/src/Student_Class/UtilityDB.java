package Student_Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UtilityDB {
	
		public static Statement getConn() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/tkdb", "root", "Tushar");
			Statement statement = con.createStatement();
			return statement;
		}
	
}
