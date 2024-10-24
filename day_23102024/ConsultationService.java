package day_23102024;

public class ConsultationService extends HealthcareService {

	public ConsultationService() {
		super("Consultation Service");
	}

	@Override
	public void provideService() {
		System.out.println("Providing medical consultation...");
	}
}
