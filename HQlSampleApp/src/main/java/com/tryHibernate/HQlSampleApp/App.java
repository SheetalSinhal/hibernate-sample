package com.tryHibernate.HQlSampleApp;

import org.hibernate.Session;

import databaseUtils.ValueFetcher;
import hibernateUtils.HibernateInitiator;
import modals.Product;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int recordInserted=0;
	
    public static void main( String[] args )
    {
        System.out.println( "Initaiting connection..." );
        Session session = HibernateInitiator.getSession();        
        
        insertProducts(session);
        
        session.beginTransaction().commit();    
        
        ValueFetcher.getAllRecords();
        
        System.out.print("Get Records above or equal to price: ");
        Scanner sc= new Scanner(System.in);
        double priceFilter=sc.nextDouble();
        ValueFetcher.getRecord(priceFilter);
        
        HibernateInitiator.closeSession();
        
        System.out.println("Operation completed successfully");
        
    }
    
    private static void insertProducts(Session session) 
    {  
    	Scanner sc = new Scanner(System.in);
    	do {
    		System.out.println("Want to insert new product. Y/N?");
    		if(sc.next().equalsIgnoreCase("n"))
    		{
    			break;
    		}
    		System.out.print("\nEnter Product Name");
    		sc.nextLine();
    		String pName=sc.nextLine();
    		System.out.print("\nEnter Product Price: ");
    		double pPrice=sc.nextDouble();
    		System.out.print("\nEnter Product Category");
    		sc.nextLine();
    		String pCategory=sc.nextLine();
    		
    		Product p= new Product(pName,pPrice,pCategory);
    		session.save(p);    		
    	}while(true);    	    	
    }
}
