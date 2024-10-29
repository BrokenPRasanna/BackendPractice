package day_28102024;

class MedicalStaff {
	String name;
	String department;

	public MedicalStaff(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public void work() {
		System.out.println(name + " from " + department + " department is on duty.");
	}
}

class Doctor extends MedicalStaff {

	public Doctor(String name) {
		super(name, "Ortho");
	}

	public void diagnosePatient() {
		System.out.println(name + " is diagnosing a patient in Ortho.");
	}
}

public class HospitalManagement {
	public static void main(String[] args) {
		Doctor doctor = new Doctor("Dr. Prasanna Balaji");
		doctor.work();
		doctor.diagnosePatient();
	}
}
