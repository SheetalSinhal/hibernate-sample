# hibernate-sample
Sample hibernate maven project in java

Using HQL(hibernate Query Language) we can perform following operations

1. insert : 
    using HQL, we can insert records only from one table to another table.
    
2. update :
      we can update single or multiple columns including primary key also using HQL, while using update() and merge() method we need to update all columns.
      
3. delete:

4. select:
      Using HQL, we can select multiple records or single record or apply aggregate functions and can also join tables.
      
Steps to use HQL in hibernate application:

1. Create hibernate application.
2. Create hibernate query using class and property names.
      String hql = .....
4. Call createQuery() using Session class object
      Query q = session_obj.createQuery(hql);
5. Using Query object, call either
    i. executeUpdate() :  for DML quieries ie for insert, update and delete operation.
    ii. uniqueResult() :  for selecting unique record based on condition.
    iii. list()   :   for selecting multiple records from table.
