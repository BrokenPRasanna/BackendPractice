package backendPractice;

public class AppointmentBooking extends Thread {
	private String patientName;

	public AppointmentBooking(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public void run() {
		System.out.println("Booking appointment for " + patientName + "...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted: " + e.getMessage());
		}
		System.out.println("Appointment booked for " + patientName + ".");
	}
}