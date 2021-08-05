package com.patientmanagement;
import org.hibernate.Session;import org.hibernate.SessionFactory;
public class Main {
   public static void main(String[] args) {
     Patient p1=new Patient();
     Doctor d=new Doctor();
     p1.setPatient_name("John");
     p1.setAge(25);
     p1.setDisease("Asthma");
     p1.setPaymentdetail(1200);
     p1.setPatient_address("UAE");
     d.setDoctor_name("Doe");
     d.setDoctor_address("Turkey");
     d.getPatients().add(p1);
     p1.setDoctor(d);
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session = sessionFactory.openSession();
     session.beginTransaction();
     session.save(d);
     session.getTransaction().commit();
     session.close();
     sessionFactory.close();
}  }