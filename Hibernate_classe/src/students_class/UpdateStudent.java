package students_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateStudent {
	public static void main(String[] args) {
		SessionFactory sf = Utility.getSesseionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Students s1 = session.load(Students.class, 11);
		s1.setS_city("Mandal");
		session.update(s1);
		tr.commit();
		System.out.println("Record Updated...");
		
	}
}
