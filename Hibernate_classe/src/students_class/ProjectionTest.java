package students_class;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

public class ProjectionTest {
	public static void main(String[] args) throws Exception {
		
		SessionFactory sf = Utility.getSesseionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Students.class);
		cr.setProjection(Projections.count("marks"));
		List<Students> li = cr.list();
		System.out.println(li);
	}
}
