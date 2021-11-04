package CRUD_Utils;

import org.hibernate.Session;

import beans.Students;

public class UpdateData 
{
	// update operation requires Trasaction object
	
	private static Session session;
	
	public UpdateData(Session ses) 
	{
		session=ses;
	}
	
	// Update data using update() method
	// Always update the data whether change is there or not
	// Raise exception when data already exists in session 
	public void updateData_Update(Students s) 
	{
		session.update(s);
		
		// Saves objects to database when commit() method called
		session.beginTransaction().commit();
		// Objects saved in db ie permanent state not eligible for garbage collection
				
		session.evict(s);
		// Object state will be detached ie eligible for garbage collection
		
	}
	
	// Update data using merge() method
	// First select the data, if there is any change then update else do nothing
	// Use merge() method when update() method raise exceptions
	public void updateData_Merge(Students s) 
	{
		session.merge(s);
		
		// Saves objects to database when commit() method called
		session.beginTransaction().commit();
		// Objects saved in db ie permanent state not eligible for garbage collection
				
		session.evict(s);
		// Object state will be detached ie eligible for garbage collection
		
	}
	
	// update also possible using session.saveOrUpdate(obj);

}
