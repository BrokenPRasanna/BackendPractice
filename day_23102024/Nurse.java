package day_23102024;

public class Nurse extends MedicalStaff {

	public Nurse(String name) {
		super(name);
	}

	@Override
	public void performDuties() {
		System.out.println(name + " is caring for patients.");
	}
}