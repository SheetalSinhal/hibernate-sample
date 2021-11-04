# hibernate-sample
Sample hibernate maven project to perform different CRUD operations(insert, update,delete and select)

1. Create classes for entities.
2. Create mapping and hibernate configuration file.
3. Create test class/application to perform CRUD operations.

i. For insert, methods used are:
  a) session_obj.save(obj_to_insert)  => returns primary key in serializable format
  b) session_obj.persist(obj_to_insert)   => returns void
  c) session_obj.saveOrUpdate(obj)    => returns void
  
ii. For update, methods used are:
    a) session_obj.update(obj_to_update)  => returns void
    b) session_obj.merge( obj)  => returns void
    c) session_obj.saveOrUpdate(obj)  => returns void
    
    Note: update() method raise exception, when same object(that we want to update) already exists in session(used to update), because update() method 1st check
          if object exist in session or not, if exist raise exception. Thus, use merge() method in this case, it directly performs operation in database.
    
iii. For delete, method is:
      a) session_obj.delete(obj_to_delete)
          obj_to_delete => not needed to set all fields, works fine if only primary property is only set.
          
iv. For Select, methods are:
    a) session_obj.get(Entity_Class,primaryKey)
    b) session_obj.load(Entity_Class, primaryKey)
          
 
 
 Note: All above operations performed in database only when transaction_obj.commit() is called.
