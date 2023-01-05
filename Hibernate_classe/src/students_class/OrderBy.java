package students_class;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class OrderBy {
	public static void main(String[] args) {
		
		SessionFactory factory = Utility.getSesseionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Students.class);
		
		criteria.addOrder(Order.desc("marks"));
//		Students stud = new Students();	// for sorting constructor is not mandatory without this line opr done successfully 
		
		List<Students> list = criteria.list();
		for (Students students : list) {
			System.out.println(students.getS_id()+" "+students.getS_name()+" "+students.getS_phone()+" "+students.getS_city()+" "+students.getMarks());
		}
		
	}
}
