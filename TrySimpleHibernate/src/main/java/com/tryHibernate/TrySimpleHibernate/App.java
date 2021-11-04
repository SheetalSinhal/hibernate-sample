package com.tryHibernate.TrySimpleHibernate;

import java.util.Scanner;

import org.hibernate.Session;

// import
import beans.Students;
import hibernateUtils.HibernateUtility;
import CRUD_Utils.*;

public class App 
{
    public static void main( String[] args )
    {   
    	Session mySession=HibernateUtility.getSession();
        
    	// Performs insert, update and delete operation
    	performNonSelectOperation(mySession);    	
    	
    	// Performs select operation
    	performSelectOperation(mySession);
    	
    	HibernateUtility.Close();
     	        
        System.out.println("Execution completed...");
    }
    
    private static void performSelectOperation(Session mySession) 
    {
    	// Select Data
     	SelectData select =new SelectData(mySession);
     	//select.selectStudent_Get(101);
     	select.selectStudent_Load(101);    	
    }
    
    private static void performNonSelectOperation(Session mySession) 
    {
    	// Insert Data
    	
    	Students s=new Students(101,"xyz", "xyz.@gmail.com",57);
        InsertData insert=new InsertData(mySession);  
        insert.insertData_Save(s);        
//      insert.insertData_Persist(s);
//      insert.insertData_SaveOrUpdate(s);      
        
        // Updates the data
    	// Updates all properties of object, cannot update single property of object
    	
//    	Students s = new Students();
//    	s.setId(102);
//    	s.setName("Ram"); 
    	// set email and marks to "null" and 0 respectively because it is not set
    	
        s = new Students(101,"john","john@gmail.com",77);
    	UpdateData update=new UpdateData(mySession);
     	update.updateData_Update(s); 
//    	update.updateData_Merge(s);
     	
     	// Delete object 
     	// if only primary key property set, then it works fine for delete
    	Students st = new Students();
    	st.setId(101);
     	DeleteData delete =new DeleteData(mySession);
     	delete.deleteData(st);
    	
    }
}
