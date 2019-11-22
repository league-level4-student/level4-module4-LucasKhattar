package _04_hospital;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.internal.runners.statements.Fail;
class DoctorFullException extends Exception {}

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> pats = new ArrayList<Patient>();
	
	public Hospital() {
	}

	public void addDoctor(Doctor dr) {
		docs.add(dr);
	}
	
	public void addPatient(Patient patient) {
		pats.add(patient);
	}

	public ArrayList<Doctor> getDoctors() {
		
		return docs;
	}

	public List<Patient> getPatients() {		
		return pats;
	}

	public void assignPatientsToDoctors() throws DoctorFullException{
		int doc = 0;
		for (int i = 0; i < pats.size(); i++) {
			try {
				docs.get(doc).assignPatient(pats.get(i));
			} catch (DoctorFullException e) {
				doc++;
				i--;
			}
		}
	}
}

class Doctor {
	ArrayList<Patient> docsPats = new ArrayList<Patient>();

	public Doctor() {
		
	}
	
	public void assignPatient(Patient max) throws DoctorFullException {
		if(docsPats.size() < 3) {				
			docsPats.add(max);
			System.out.println(max);
		}
		else {
			throw new DoctorFullException();
		}
	}
	
	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	public void doMedicine() {
		for (int i = 0; i < docsPats.size(); i++) {
			docsPats.get(i).checkPulse();
		}
	}

	public ArrayList<Patient> getPatients() {
		return docsPats;
	}
}

class GeneralPractitioner extends Doctor {
	GeneralPractitioner() {
		super();
	}

	@Override
	public boolean makesHouseCalls() {
		return true;
	}
}

class Surgeon extends Doctor {
	Surgeon(){
		super();
	}
	
	@Override
	public boolean performsSurgery() {
		return true;
	}
}

class Patient{
	boolean caredFor = false;
	
	Patient(){
		
	}
	
	public boolean feelsCaredFor() {
		if(caredFor) {
			return true;
		}
		return false;
	}

	public void checkPulse() {
		caredFor = true;
	}
}