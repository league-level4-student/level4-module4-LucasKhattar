package _04_hospital;

import java.util.ArrayList;
import java.util.List;
class DoctorFullException extends Exception {}

public class Hospital {
	List<Doctor> docs = new ArrayList();
	List<Patient> pats = new ArrayList();
	Hospital hospital = new Hospital();
	public Hospital() {
		
	}

	public static void main(String[] args) {
		
	}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		docs.add(generalPractitioner);
	}
	
	public void addDoctor(Surgeon surgeon) {
		docs.add(surgeon);
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

	public void assignPatientsToDoctors() throws DoctorFullException{
		for (Patient pat: pats) {
			for (Doctor doc: docs) {
				Doctor docs = (Doctor)hospital;
				docs.assignPatient(pat);
			}
		}
	}
}

class Doctor extends Hospital{
	List<Patient> docsPats = new ArrayList();
	List<Patient> caredFor = new ArrayList();
	public Doctor() {
		super();
	}
	
	public void assignPatient(Patient max) throws DoctorFullException {
		if(docsPats.size() < 3) {				
			docsPats.add(max);
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
			caredFor.add(docsPats.get(i));
		}
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

class Patient extends Hospital{
	Patient(){
		super();
	}
	
	Doctor docs = (Doctor)hospital;
	
	public boolean feelsCaredFor() {
		for (int i = 0; i < docs.caredFor.size(); i++) {
			if(docs.caredFor.contains(docs.docsPats.get(i))) {
				return true;
			}
		}
		return false;
	}

	public void checkPulse() {
		for (int i = 0; i < docs.docsPats.size(); i++) {
			docs.caredFor.add(docs.docsPats.get(i));
		}
	}
}