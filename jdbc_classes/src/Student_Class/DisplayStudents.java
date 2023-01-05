package Student_Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudents {
	public static void main(String[] args) throws Exception {
		Statement stmt = UtilityDB.getConn();
		ResultSet rs = stmt.executeQuery("select * from students");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));			
		}
		
	}
}
