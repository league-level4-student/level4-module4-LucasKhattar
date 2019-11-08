package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	List<Doctor> docs = new ArrayList();
	List<Patient> pats = new ArrayList();
	Hospital hospital = new Hospital();
	public Hospital() {
		
	}

	public static void main(String[] args) {
		
	}

	public void addDoctor(GeneralPractitioner generalPractitioner2) {
		docs.add(generalPractitioner2);
	}
	
	public void addDoctor(Surgeon surgeon2) {
		docs.add(surgeon2);
	}

	public void addPatient(Patient patient) {
		pats.add(patient);
	}

	public List<Doctor> getDoctors() {
		return docs;
	}

	public List<Patient> getPatients() {		
		return pats;
	}

	public void assignPatientsToDoctors() {
		for (Patient pat: pats) {
			for (Doctor doc: docs) {
				Doctor docs = (Doctor)hospital;
				if(docs.pats2.size() > 3) {				
					docs.assignPatient(pat);
				}
			}
		}
	}
}

class Doctor extends Hospital{
	List<Patient> pats2 = new ArrayList();
	public Doctor() {
		super();
	}
	
	public void assignPatient(Patient max) {
		
	}

	public Object performsSurgery() {
		return null;
	}

	public Object makesHouseCalls() {
		return null;
	}

	public void doMedicine() {
		
	}
}

class GeneralPractitioner extends Doctor {
	GeneralPractitioner() {
		super();
	}

	public Object makesHouseCalls() {
		return null;
	}
}

class Surgeon extends Doctor {
	Surgeon(){
		super();
	}
}

class Patient extends Hospital{
	Patient(){
		super();
	}

	public Object feelsCaredFor() {
		return null;
	}

	public void checkPulse() {
		
	}
}