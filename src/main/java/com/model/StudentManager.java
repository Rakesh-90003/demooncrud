package com.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;

public class StudentManager {
  public String insertData(Student S)
  {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    
    session.getTransaction().begin();
    session.persist(S);         //Insert into Table "Student"
    session.getTransaction().commit();
    
    session.close();
    factory.close();
    return "Data Inserted Successfully..";
  }
  
  public String updateData(int id, Student S)
  {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    
    session.getTransaction().begin();
    Student tmp = session.find(Student.class, id);
    tmp.setName(S.getName());
    tmp.setDept(S.getDept());
  
    session.getTransaction().commit();
    
    session.close();
    factory.close();
    return "Data Updated Successfully..";
  }
  
  public String deleteData(int id)
  {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    
    session.getTransaction().begin();
    Student tmp = session.find(Student.class, id);
    session.remove(tmp);
  
    session.getTransaction().commit();
    
    session.close();
    factory.close();
    return "Data Deleted Successfully..";
  }
  
  public List<Student> getData()
  {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    
    session.getTransaction().begin();

    TypedQuery<Student> qry = session.createQuery("select S from Student S",Student.class);
    List<Student> list = new ArrayList<Student>();
    list = qry.getResultList();  
    session.getTransaction().commit();
    
    session.close();
    factory.close();
    return list;
  }
}