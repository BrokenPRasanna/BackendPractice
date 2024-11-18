package day_13112024;

import org.json.JSONArray;
import org.json.JSONObject;

public class PatientJsonExample {
	public static void main(String[] args) {
		JSONObject patientJson = new JSONObject();
		patientJson.put("name", "Prasanna Balaji");
		patientJson.put("age", 19);
		patientJson.put("diagnosis", "Bone Fracture");

		JSONArray medicalRecords = new JSONArray();

		JSONObject record1 = new JSONObject();
		record1.put("condition", "Flu");
		record1.put("prescription", "Rest and hydration");

		JSONObject record2 = new JSONObject();
		record2.put("condition", "Bone Fracture");
		record2.put("prescription", "Physiotherapy");

		medicalRecords.put(record1);
		medicalRecords.put(record2);

		patientJson.put("medicalRecords", medicalRecords);

		System.out.println("Patient JSON Data:");
		System.out.println(patientJson.toString(4));
	}
}
