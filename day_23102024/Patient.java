package day_23102024;

public class Patient {
	String name;

	public Patient(String name) {
		this.name = name;
		System.out.println("Patient " + name + " is registered.");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Patient " + name + " record is removed.");
		super.finalize();
	}
}
