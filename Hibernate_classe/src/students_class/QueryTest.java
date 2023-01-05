package students_class;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class QueryTest {
	public static void main(String[] args) {
		SessionFactory factory = Utility.getSesseionFactory();
		Session session = factory.openSession();
//		Query query = session.createQuery("from Students");
//		List<Students> list = query.list();
//		for (Students students : list) {
//			System.out.println(students.getS_name()+" "+students.getS_phone());
//		}
		Query query = session.createQuery("from Students where s_id=1");
		List<Students> list = query.list();
		for (Students students : list) {
			System.out.println(students.getS_name()+" "+students.getS_phone());
		}
	}
}
