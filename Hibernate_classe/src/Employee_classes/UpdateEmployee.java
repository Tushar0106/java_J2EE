package Employee_classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction(); 
		Employee e1 = session.load(Employee.class, 1);
		e1.setSalary("35000");
		session.update(e1);
		tr.commit();
		System.out.println("Row updated...");
		
	}
}
