package students_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
	public static void main(String[] args) {
		SessionFactory sf = Utility.getSesseionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Students s1 = new Students("Ajay", "7776046465", "Bhandara", "52");
		session.save(s1);
		tr.commit();
		System.out.println("Record inserted...");
	}
}
