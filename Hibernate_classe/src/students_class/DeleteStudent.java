package students_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteStudent {
	public static void main(String[] args) {
		SessionFactory factory = Utility.getSesseionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Students s1 = session.load(Students.class, 9);
		session.delete(s1);
		tr.commit();
		System.out.println("Record deleted...");
	}
}
