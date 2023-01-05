package Student_Class;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertStudent {
	public static void main(String[] args) throws Exception {
		Statement stmt = UtilityDB.getConn();
		Student stud = new Student();
		stud.setId(21);
		stud.setName("Jackson");
		stud.setPhone("665987455");
		stud.setCity("UK");
		stud.setMarks("55");
				
	}
}
