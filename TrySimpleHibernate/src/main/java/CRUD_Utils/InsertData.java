package CRUD_Utils;

import org.hibernate.Session;

import beans.Students;
import hibernateUtils.HibernateUtility;

public class InsertData {
	// Insert operation requires Transaction object

	Session session;

	public InsertData(Session session) {
		this.session = session;
	}

	// Insert data using save() method
	// Raises exception if there is primary key violation
	public int insertData_Save(Students s) 
	{
		int pkey = (Integer) session.save(s);

		// Saves objects to database when commit() method called
		session.beginTransaction().commit();
		// Objects saved in db ie permanent state not eligible for garbage collection

		session.evict(s);
		// Object state will be detached ie eligible for garbage collection

		return pkey;
	}

	// Insert data using persist() method
	// Raises exception if there is primary key violation
	public void insertData_Persist(Students s) 
	{
		session.persist(s);

		// Saves objects to database when commit() method called
		session.beginTransaction().commit();
		// Objects saved in db ie permanent state not eligible for garbage collection

		session.evict(s);
		// Object state will be detached ie eligible for garbage collection

	}

	// Insert data using saveOrUpdate() method
	// If primary key already exists, updates the object (is there is any difference
	// between existing and passed)
	// else insert the object
	public void insertData_SaveOrUpdate(Students s) 
	{
		session.saveOrUpdate(s);

		// Saves objects to database when commit() method called
		session.beginTransaction().commit();
		// Objects saved in db ie permanent state not eligible for garbage collection

		session.evict(s);
		// Object state will be detached ie eligible for garbage collection
	}

}
