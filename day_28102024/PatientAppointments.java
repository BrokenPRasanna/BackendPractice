package day_28102024;

import java.util.ArrayList;
import java.util.HashMap;

public class PatientAppointments {
	public static void main(String[] args) {

		HashMap<Long, ArrayList<String>> appointmentMap = new HashMap<>();

		ArrayList<String> patient1Appointments = new ArrayList<>();
		patient1Appointments.add("Recovery Checkup");
		patient1Appointments.add("X-Ray");

		ArrayList<String> patient2Appointments = new ArrayList<>();
		patient2Appointments.add("Dental Checkup");

		appointmentMap.put(101L, patient1Appointments);
		appointmentMap.put(102L, patient2Appointments);

		Long patientId = 101L;
		ArrayList<String> appointments = appointmentMap.get(patientId);
		System.out.println("Appointments for Patient ID " + patientId + ": " + appointments);
	}
}
