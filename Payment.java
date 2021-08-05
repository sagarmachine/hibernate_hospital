package com.patientmanagement;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="paymentd")
public class Payment {
	@Id
	@GeneratedValue
	private int payment_id;
	private int amount;
	@OneToOne(cascade = CascadeType.PERSIST,mappedBy = "payment")
	private Set<Patient> patient=new HashSet<>();
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	
	public Set<Patient> getPatient() {
		return patient;
	}
	public void setPatient(Set<Patient> patient) {
		this.patient = patient;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private String status;

}
