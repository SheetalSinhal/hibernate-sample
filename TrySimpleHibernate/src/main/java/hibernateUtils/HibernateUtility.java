package hibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Create and returns Session object
public class HibernateUtility {
	private static Session session;

	public static Session getSession() 
	{
		if (session == null) 
		{
			Configuration cfg = new Configuration();
			cfg.configure("/resources/hibernate.cfg.xml");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			
			session=sessionFactory.openSession();;

			return session;
			
		} else
			return session;
	}

	public static void Close() {
		session.close();
		session = null;
	}

}
