package databaseUtils;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernateUtils.HibernateInitiator;
import modals.Product;

// Get record or value from database using HQL
public class ValueFetcher {
	private static Session _session;

	public static void getAllRecords() {
		if (_session == null) {
			_session = HibernateInitiator.getSession();
		}

		String getAllRecordsHQL = "from modals.Product";
		Query q = _session.createQuery(getAllRecordsHQL);
		Object allRecords = q.list();
		displayData(allRecords);
	}
	
	public static void getRecord(double priceFilter) 
	{
		if (_session == null) {
			_session = HibernateInitiator.getSession();
		}

		String getRequiredRecordsHql = "select productName, productPrice from modals.Product where productPrice >="+priceFilter;
		Query q = _session.createQuery(getRequiredRecordsHql);
		Object reqRecords = q.list();
		displayData(reqRecords);
		
	}

	public static int getMaxProductId() {
		if (_session == null) {
			_session = HibernateInitiator.getSession();
		}
		String maxProductIdHQL = "select max(productId) from modals.Product";
		Query q = _session.createQuery(maxProductIdHQL);
		Object maxProductId = q.uniqueResult();
		if (maxProductId == null) {
			return 0;
		}
		return (Integer) maxProductId;
	}

	private static void displayData(Object data) {
		if (data == null) {
			System.out.println("No data");
		}

		if (data instanceof List<?>) {
			List<Object> allData = (List<Object>) data;

			if (allData.size() <= 0) {
				System.out.println("No data");
			} else {

				for (Object d : allData) {
					if (d instanceof Product) {
						Product p = (Product) d;
						System.out.println(String.format("Name: %s \t Price: %f \t Category: %s ", p.getProductName(),
								p.getProductPrice(), p.getProductCategory()));
					}

					if (d instanceof Object[]) {
						Object[] recordInfo = (Object[]) d;
						for (Object o : recordInfo) {
							System.out.print(o + "\t");
						}

					}
					System.out.println();

				}
			}

		}

	}

}
