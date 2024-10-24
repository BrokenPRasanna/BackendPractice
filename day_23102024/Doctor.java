package day_23102024;

public class Doctor extends MedicalStaff {

	public Doctor(String name) {
		super(name);
	}

	@Override
	public void performDuties() {
		System.out.println(name + " is diagnosing and treating patients.");
	}
}