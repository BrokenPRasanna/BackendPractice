package day_28102024;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	private String name;
	private int age;
	private String diagnosis;
	private List<MedicalRecord> medicalRecords = new ArrayList<>();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void addMedicalRecord(MedicalRecord record) {
		medicalRecords.add(record);
	}

	public void displayMedicalRecords() {
		System.out.println("Medical Records for Patient: " + name);
		for (MedicalRecord record : medicalRecords) {
			record.displayRecord(name);
			System.out.println("-----");
		}
	}

	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setName("Prasanna Balaji");
		patient.setAge(19);
		patient.setDiagnosis("Bone Fracture");

		MedicalRecord record1 = new MedicalRecord("Swelling", "Rest and hydration");
		MedicalRecord record2 = new MedicalRecord("Bone Fracture", "Physiotherapy");

		patient.addMedicalRecord(record1);
		patient.addMedicalRecord(record2);

		System.out.println("Patient Name: " + patient.getName());
		System.out.println("Patient Age: " + patient.getAge());
		System.out.println("Diagnosis: " + patient.getDiagnosis());
		patient.displayMedicalRecords();
	}
}
