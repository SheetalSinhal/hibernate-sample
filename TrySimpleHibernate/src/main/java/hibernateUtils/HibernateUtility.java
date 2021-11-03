package hibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Create and returns Session object
public class HibernateUtility 
{
	private Session session;
	
	public static Session getSession() 
	{
		Configuration cfg=new Configuration();
		cfg.configure("/resources/hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		
		return sessionFactory.openSession();		
	}
	
	public void Close() 
	{
		session.close();		
	}

}
