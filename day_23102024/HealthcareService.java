package day_23102024;

public abstract class HealthcareService {
	String serviceName;

	public HealthcareService(String serviceName) {
		this.serviceName = serviceName;
	}

	public abstract void provideService();

	public void displayService() {
		System.out.println("Service: " + serviceName);
	}
}
