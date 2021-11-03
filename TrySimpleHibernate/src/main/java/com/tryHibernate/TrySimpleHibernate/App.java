package com.tryHibernate.TrySimpleHibernate;

import java.util.Scanner;

import org.hibernate.Session;

// import
import beans.Students;
import hibernateUtils.HibernateUtility;;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Student Id: ");
    	int sId=sc.nextInt();
    	sc.nextLine();
    	System.out.print("\nEnter Student Name: ");
    	String sName=sc.nextLine();
    	System.out.print("\nEnter Student Email: ");
    	String sEmail=sc.next();
    	System.out.print("\nEnter Student Marks: ");
    	double sMarks=sc.nextDouble();
    	
        Students s=new Students(sId,sName, sEmail,sMarks);
        // Currently Student object (s) is transient ie eligible for garbage collection after execution
        Session mySession=HibernateUtility.getSession();
        mySession.save(s);
        // Object in persistant state
        mySession.beginTransaction().commit();
        // Objects saved in db ie permanent state not eligible for garbage collection
        
        mySession.evict(s);
        // Object state will be detached ie eligible for garbage collection
    }
}
