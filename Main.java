package com.patientmanagement;
import org.hibernate.Session;import org.hibernate.SessionFactory;
public class Main {
   public static void main(String[] args) {
     Patient patient=new Patient();
     Doctor doctor=new Doctor();
     patient.setPatient_name("John");
     patient.setAge(25);
     patient.setDisease("Asthma");
     patient.setPaymentdetail(1200);
     patient.setPatient_address("UAE");
     doctor.setDoctor_name("Doe");
     doctor.setDoctor_address("Turkey");
     doctor.getPatients().add(patient);
     patient.setDoctor(doctor);
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     Session session = sessionFactory.openSession();
     session.beginTransaction();
     session.save(doctor);
     session.getTransaction().commit();
     session.close();
     sessionFactory.close();
}  }
