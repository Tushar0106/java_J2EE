package students_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

 
public class SaveOrUpdateTest {
	public static void main(String[] args) {
		SessionFactory factory = Utility.getSesseionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Students std = new Students();
		std.setS_id(14);
		std.setS_name("Ajay");
		std.setS_phone("8889999999");
		std.setS_city("Gondia");
		std.setMarks("50");
		session.saveOrUpdate(std); // if I'm not write this line then it doesn't affect the operation it update record successfully
		tr.commit();
		System.out.println("Successfully done...!");
	}
}
