package jdbc_classes;

import java.sql.DriverManager;

public class TestCon {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded...");
		DriverManager.getConnection("jdbc:mysql://localhost:3307/tkdb", "root", "Tushar");
		System.out.println("Database got connected...");
	}

}
