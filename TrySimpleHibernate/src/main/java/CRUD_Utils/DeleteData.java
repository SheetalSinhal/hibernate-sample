package CRUD_Utils;

import org.hibernate.Session;

import beans.Students;

public class DeleteData 
{
	// Delete operation requires Transaction object
	
	private Session session;
	
	public DeleteData(Session ses) {
		session=ses;
	}
	
	public void deleteData(Students s) 
	{
		session.delete(s);
		
		session.beginTransaction().commit();
		
		session.evict(s);
	}

}
