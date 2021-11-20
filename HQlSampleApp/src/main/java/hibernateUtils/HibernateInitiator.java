package hibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateInitiator {
	private static SessionFactory _sessionFactory;
	private static Session _session;

	public static Session getSession() 
	{
		if (_session == null) {
			Configuration config = new Configuration();
			config.configure("hibernateResources/hibernate.cfg.xml");
			_sessionFactory = config.buildSessionFactory();
			_session = _sessionFactory.openSession();
		}
		return _session;
	}

	public static void closeSession() 
	{
		_session.close();
		_sessionFactory.close();
		_session =null;
		_sessionFactory = null;
	}

}
