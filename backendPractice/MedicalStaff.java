package backendPractice;

public class MedicalStaff {
	String name;

	public MedicalStaff(String name) {
		this.name = name;
	}

	public void performDuties() {
		System.out.println(name + " is performing general medical duties.");
	}
}