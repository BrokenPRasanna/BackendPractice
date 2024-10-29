package day_28102024;

public class MedicalRecord {
	private String condition;
	private String prescription;

	public MedicalRecord(String condition, String prescription) {
		this.condition = condition;
		this.prescription = prescription;
	}

	public void displayRecord(String patientName) {
		System.out.println("Patient: " + patientName);
		System.out.println("Condition: " + condition);
		System.out.println("Prescription: " + prescription);
	}
}
