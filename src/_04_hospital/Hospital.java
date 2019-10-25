package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	Patient patients;
	ArrayList<Doctor> doc = new ArrayList();
	Doctor generalPractitioner = new Doctor(patients);
	Doctor surgeon = new Doctor(patients);

	public static void main(String[] args) {
		new Hospital().buildHospital();
	}
	
	void buildHospital() {
		
	}
}
