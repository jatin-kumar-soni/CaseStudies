
public class Appointment {
	private static int appointmentCounter;
	private int appointmentId;
	private Patient patient;
	private Doctor doctor;
	private String appointmentDate;
	private boolean status;
	static {
		appointmentCounter = 500;
	}
	{
		appointmentId = ++appointmentCounter;
	}

	public Appointment(Patient patient, Doctor doctor, String appointmentDate) {
		super();
		this.patient = patient;
		this.doctor = doctor;
		this.appointmentDate = appointmentDate;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Patient getPatient() {
		return patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	boolean isStatus() {
		return this.status;
	}
	public void  setStatus(boolean st)
	{
		this.status=st;
	}

	void cancelAppointment() {
		this.status = false;
	}

	public void details() {

		System.out.println("\n===== APPOINTMENT DETAILS =====");

		System.out.println("Appointment ID: " + appointmentId);

		System.out.println("Patient ID: " + patient.getPatientId());

		System.out.println("Patient Name: " + patient.getName());

		System.out.println("Doctor ID: " + doctor.getDoctorId());

		System.out.println("Doctor Name: " + doctor.getName());

		System.out.println("Specialization: " + doctor.getSpecialization());

		System.out.println("Date: " + appointmentDate);

		System.out.println("Consultation Fee: Rs. " + doctor.getConsultationFee());

		System.out.println("Status: " + (status ? "BOOKED" : "CANCELLED"));

	}

}
