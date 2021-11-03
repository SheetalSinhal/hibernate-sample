package com.tryHibernate.TrySimpleHibernate;

import java.util.Scanner;

import org.hibernate.Session;

// import
import beans.Students;
import hibernateUtils.HibernateUtility;
import beans.Course;
import beans.Department;
import beans.Employee;

public class App 
{
    public static void main( String[] args )
    {    	
        Students s=new Students(101,"Xyz", "xyz.@gmail.com",78);
        Employee e=new Employee(001,"Pqr Lmn", "pqr@yahoo.com");
        Course c=new Course(1,"Computer Science",50000);
        Department d=new Department(1,"Developer");
        // Currently objects are in transient ie eligible for garbage collection after execution
        
        Session mySession=HibernateUtility.getSession();
        mySession.save(s);
        mySession.save(e);
        mySession.save(c);
        mySession.save(d);
        // Objects in persistant state
        
        // Saves all objects to database
        mySession.beginTransaction().commit();
        // Objects saved in db ie permanent state not eligible for garbage collection
        
        mySession.evict(s);
        // Object state will be detached ie eligible for garbage collection
        
        System.out.println("Execution completed...");
    }
}
