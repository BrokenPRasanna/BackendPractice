package backendPractice;

import java.io.IOException;

public class HealthcareManagementSystem {
	public static void main(String[] args) {
		HealthcareService consultation = new ConsultationService();
		consultation.displayService();
		consultation.provideService();

		Patient patient1 = new Patient("Prasanna Balaji");
		patient1 = null;
		System.gc();

		HealthcareFileManager fileManager = new HealthcareFileManager();
		String fileName = "patient_record.txt";
		try {
			fileManager.writeFile(fileName, "Patient: Prasanna Balaji\nDiagnosis: Bone Fracture");
			System.out.println("Reading from file:");
			fileManager.readFile(fileName);
			fileManager.deleteFile(fileName);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		AppointmentBooking booking1 = new AppointmentBooking("Prasanna");
		AppointmentBooking booking2 = new AppointmentBooking("Balaji");
		booking1.start();
		booking2.start();

		MedicalStaff doctor = new Doctor("Dr. Prasanna");
		MedicalStaff nurse = new Nurse("Nurse Clara");

		doctor.performDuties();
		nurse.performDuties();
	}
}
