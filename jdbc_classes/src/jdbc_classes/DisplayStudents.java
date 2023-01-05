package jdbc_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudents {
	
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/tkdb", "root", "Tushar");
			
			Statement st = con.createStatement();
			String sql = "SELECT * FROM students;";
			
			ResultSet rs = st.executeQuery(sql);
			System.out.println("ID  NAME    PHONE   CITY");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			con.close();
		}
	}

