# hibernate-sample

This project allows to add values from java application (maven) to database(PostgreSQL) table using hibernate.

Steps are:

1. Create table in database to which we want to add data using hibernate.
2. Create simple maven project and add hibernate-core dependencies in pom.xml file.
3. Create classes whose data we want to add in database table.
    Classes should contain default constructor and getter and setter for every property that e want to add in table.
4. Create hibernate mapping file (contains mapping between class property and table columns).
    For Dtd refer hibernate-core-5.6.1.Final.jar/org/hibernate/hibernate-mapping-3.0.dtd
5. Create hibernate configuration file (contains database and hibernate configurations)
    For dtd refer hibernate-core-5.6.1.Final.jar/org/hibernate/hibernate-configuration-3.0.dtd
6. Create Test class.
