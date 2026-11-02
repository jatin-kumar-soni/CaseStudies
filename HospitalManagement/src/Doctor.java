
public class Doctor extends Person {
    private static int doctorCounter;

    private int doctorId;

    private String specialization;

    private double consultationFee;
	static {
		doctorCounter=200;
	}
	{
		doctorId=++doctorCounter;
	}
	public Doctor(String name, String phone, String gender, int age, String specialization, double consultationFee) {
		super(name, phone, gender, age);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	public double getConsultationFee() {
		return consultationFee;
	}
	@Override
	public void details()
	{
		System.out.println("\n----- DOCTOR DETAILS -----");

        System.out.println("Doctor ID: " + doctorId);

        System.out.println("Name: " + this.getName());

        System.out.println("Age: " + this.getAge());

        System.out.println("Gender: " + this.getGender());

        System.out.println("Phone: " + this.getPhoneNumber());

        System.out.println("Specialization: " + this.getSpecialization());

        System.out.println("Consultation Fee: Rs. " + this.getConsultationFee());
        
	}
	
	
}
