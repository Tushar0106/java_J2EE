package students_class;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	 static SessionFactory getSesseionFactory(){
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Students.class);
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
	}
}
