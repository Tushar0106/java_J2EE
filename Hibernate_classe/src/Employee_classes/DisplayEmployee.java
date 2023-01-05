package Employee_classes;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class DisplayEmployee {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		
		
		List<Employee> li = cr.list();
		for (Employee employee : li) {
			System.out.println(employee.id+" "+employee.name+" "+" "+employee.salary);
		}
		
	}
}
