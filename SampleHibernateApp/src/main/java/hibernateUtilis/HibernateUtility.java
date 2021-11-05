package hibernateUtilis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static Session session;
	private static SessionFactory sessionFac;

	public static Session getSession() {
		if (session == null) 
		{
			Configuration cfg = new Configuration();
			cfg.configure("/resources/hibernate-cfg.hbm.xml");
			sessionFac = cfg.buildSessionFactory();
			session = sessionFac.openSession();
		}
		return session;
	}
	
	public static void closeSession() {
		session.close();
		sessionFac.close();
		session=null;
		sessionFac=null;
	}

}
