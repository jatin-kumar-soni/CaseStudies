
public class Patient extends Person {
	private static int patientCounter;
	private int patientId;
	static {
		patientCounter = 100;
	}
	{
		patientId = ++patientCounter;
	}

	public Patient(String name, String phone, String gender, int age) {
		super(name, phone, gender, age);

	}

	public int getPatientId() {
		return patientId;
	}

	@Override
	public void details() {
		System.out.println("\n----- PATIENT DETAILS -----");

		System.out.println("Patient ID: " + patientId);

		System.out.println("Name: " + getName());

		System.out.println("Age: " + getAge());

		System.out.println("Gender: " + getGender());

		System.out.println("Phone: " + getPhoneNumber());
	}

}
