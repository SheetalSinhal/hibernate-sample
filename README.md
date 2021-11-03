# hibernate-sample

Sample code to automatically creates tables(whose mapping files specified in hiberate configuration file) in database

Steps are:

1. Create Java Maven application.
2. Create java classes(add objects to tables).
3. Create mapping files for all classes(whose data to be added to tables).
    If class property and table columns are same then from <property> or <id> tag we can ommit column attribute.
5. Create hibernate configuration file.
  i) Add all mappings of classes(for which we auto create table in specified database).
  ii) Add hibernate command "hbm2ddl.auto" with create/update/validate/create-drop accordingly.
  iii) Add hibernate command "show_sql" with true value to see internal sql queries that are executed for creation/insertion...
6. Create test application.
