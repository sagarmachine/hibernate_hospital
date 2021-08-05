package com.patientmanagement;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private int patient_id;
    private String Patient_name;
    private String patient_address;
    private String disease;
    private int age;
    private int paymentdetail;

    public int getPaymentdetail() {
        return paymentdetail;
    }

    public void setPaymentdetail(int paymentdetail) {
        this.paymentdetail = paymentdetail;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Doctor doctor;

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return Patient_name;
    }

    public void setPatient_name(String patient_name) {
        Patient_name = patient_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


}
