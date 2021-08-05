package com.patientmanagement;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
public class Doctor {
	@Id
	@GeneratedValue
	private int Doctor_Id;
	private String Doctor_name;
	private String Doctor_address;
	private int age;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private Set<Patient> patients = new HashSet<Patient>(0);
	
	public int getDoctor_Id() {
		return Doctor_Id;
	}
	public void setDoctor_Id(int doctor_Id) {
		Doctor_Id = doctor_Id;
	}
	public String getDoctor_name() {
		return Doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		Doctor_name = doctor_name;
	}
	public String getDoctor_address() {
		return Doctor_address;
	}
	public void setDoctor_address(String doctor_address) {
		Doctor_address = doctor_address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}

	

}
