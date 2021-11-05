# hibernate-sample
Sample hibernate maven project in java to automatically generate primary key.

Steps are :

1. Create Java Maven application.
2. Create java classes(add objects to tables).
3. Create mapping files. Assign value how primary key will be generated (automatic or based on user input).
    Possible values are assigned,increment,sequence,identity,native,hilo,foregin and custom generator.
    Default value : assigned (user input)
    For automatic primary key generation change value of <generator> tag.
4. Create hibernate configuration file.
5. Create test application.
 
  
  Structure of Mapping file for auto key generation
  
  <hibernate-mapping>
    <class name="----" table="----" schema="-----">
      <id name="-----" column="------">
        <generator class="value decides how primary key will generate" />
      </id>
      <property name="-----" column="------" />
        -----
    </class>
  </hibernate-mapping>

