package students_class;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CriteriaTest {
	public static void main(String[] args) {
		
		SessionFactory factory = Utility.getSesseionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Students.class);
		criteria.add(Restrictions.eq("s_name", "Tushar")); //this line helps if your want to set condition and display the perticular result related to condition OR Without this line display all the records present in table
		List<Students> std = criteria.list();
		for (Students students : std) {
			System.out.println(students.getS_id()+" "+students.getS_name()+" "+students.getS_phone()+" "+students.getS_city());
		}
	}
}
