package com.tryHibernate.SampleHibernateApp;

import org.hibernate.Session;

import java.util.Scanner;

import entities.Account;
import entities.Course;
import entities.Student;
import hibernateUtilis.HibernateUtility;

public class App 
{
	private static Session session;
    public static void main( String[] args )
    {    	
        session=HibernateUtility.getSession();     
        
        userInputPrimaryKey();
        autoGeneratePrimarKey_Increment();
        autoGeneratePrimaryKey_Customized();
        
        HibernateUtility.closeSession();
        System.out.println("Execution completed...");
        
    }
    
    // Takes user input as primary key
    private static void userInputPrimaryKey() 
    {
    	Student s = new Student(101,"Ram","ram@gmail.com");
    	session.saveOrUpdate(s);
    	session.beginTransaction().commit();
    	session.evict(s);    	
    }
    
    private static void autoGeneratePrimarKey_Increment() {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Course Name: ");
    	String courseName=sc.nextLine();
    	
    	System.out.print("Enter course fees: ");
    	double fees=sc.nextDouble();
    	
    	Course c=new Course(courseName, fees);
    	session.save(c);
    	session.beginTransaction().commit();
    	session.evict(c);
    }
    
    private static void autoGeneratePrimaryKey_Customized() 
    {
    	Account acc=new Account("Abc","Salary");
    	String primaryKey=session.save(acc).toString();
    	session.beginTransaction().commit();
    	session.evict(acc);
    	System.out.println("New Account created: "+primaryKey);
    	
    }
}
