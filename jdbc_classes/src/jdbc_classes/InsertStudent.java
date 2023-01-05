package jdbc_classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/tkdb", "root", "Tushar");

		Students s1 = new Students("Alex", "5547555454", "USA", "50");
		
		String name = s1.name;
		String phone = s1.phone;
		String city = s1.city;
		String marks = s1.marks;
//			String sql = "INSERT INTO students (s_name, s_phone,s_city) VALUES('Achal',125478532,'Bhandara');";
		String sql = "INSERT INTO students (s_name, s_phone, s_city, marks) VALUES('" + name + "'," + phone + ",'" + city
				+ "','"+marks+"');";

		Statement st = con.createStatement();
		int result = st.executeUpdate(sql);
		if (result > 0)
			System.out.println("data inserted...");
	}
}
