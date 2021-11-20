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


Note : for composite primary key(primary key as combination of multiple columns) are defined in composite-id tag ie.
        To represent the composite keys, hibernate provides <key-property> tag under the <composite-id> tag.
        We can represent each primary key with <key-property> tag, so that all primary keys will be binded with the <composite-id> tag.
    
     To represent the composite key in hibernate, the pojo class should implement the Serializable interface. Otherwise hibernate will throw org.hibernate.MappingException like         “Composite-id class must implement Serializable”

<hibernate-mapping>
    <class>
        <composite-id>
            <key-property name="primary_prop1" column="column_name" />
            <key-property name="primary_prop2" column="column_name" />
            -----
        </composite-id>
   </class>
</hibernate-mapping>
    
    For more reference, refer    
    https://www.onlinetutorialspoint.com/hibernate/hibernate-composite-key-mapping-example.html
    https://www.tutorialandexample.com/hibernate-composite-primary-key/

    
