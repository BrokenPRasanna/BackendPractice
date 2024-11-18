package day_13112024;

public class DoctorSpecializationEnumExample {

	enum Specialization {
		CARDIOLOGY, DERMATOLOGY, PEDIATRICS, NEUROLOGY, ORTHOPEDICS
	}

	public static void main(String[] args) {
		Specialization doctorSpecialization = Specialization.CARDIOLOGY;

		System.out.println("Doctor's Specialization: " + doctorSpecialization);

		System.out.println("Available Specializations:");
		for (Specialization specialization : Specialization.values()) {
			System.out.println(specialization);
		}
	}
}
