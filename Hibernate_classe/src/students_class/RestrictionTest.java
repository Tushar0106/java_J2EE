package students_class;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class RestrictionTest {
	public static void main(String[] args) {
		SessionFactory factory = Utility.getSesseionFactory();
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Students.class);
		cr.add(Restrictions.ge("marks", "70"));
		List<Students> list = cr.list();
		for (Students students : list) {
			System.out.println(students.getS_id()+" "+students.getS_name()+" "+students.getS_phone()+" "+students.getS_city()+" "+students.getMarks());
		}
	}
}
