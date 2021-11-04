package CRUD_Utils;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;

import beans.Students;

public class SelectData {
	// Do not require Transaction object

	private Session session;

	public SelectData(Session ses) {
		session = ses;
	}

	// select Student using get() method
	// fires select query at the time of get() method execution
	// if record not found returns null
	public void selectStudent_Get(int primaryKey) {
		Object o = session.get(Students.class, primaryKey);
		if (o != null) {
			Students s = (Students) o;
			System.out.println(s.toString());
		} else {
			System.out.println("Record not found");
		}
	}

	// Select Student using load() method
	// fires query at the time o access non-primary property
	// if record not found raise ObjectNotFoundException	
	public void selectStudent_Load(int primaryKey) {
		Object o = session.load(Students.class, primaryKey);
		Students s = (Students) o;
		try {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getMarks());
		} catch (ObjectNotFoundException e) {
			System.out.println("Record not found");
		}
	}

}
