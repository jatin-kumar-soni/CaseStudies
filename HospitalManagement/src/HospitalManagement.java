import java.util.Scanner;

public class HospitalManagement {
	
	private Patient[] patient;
	private Doctor[] doctor;
	private Appointment[] appointment;
	private  int patientCounter;
	private int doctorCounter;
	private int appointmentCounter;
	public HospitalManagement(int pc,int dc,int ac) {
		super();
		patient=new Patient[pc];
		doctor=new Doctor[dc];
		appointment=new Appointment[ac];
		this.patientCounter=0;
		this.doctorCounter=0;
		this.appointmentCounter=0;
		
	}
	void addPatient(Patient patient)
	{
		if(this.patient.length>this.patientCounter)
		{
			this.patient[this.patientCounter++]=patient;
		}
		else {
			System.err.println("patient storage is full");
		}
	}
	void addDoctor(Doctor doctor)
	{
		if(this.doctor.length>this.doctorCounter)
		{
			this.doctor[this.doctorCounter++]=doctor;
		}
		else {
			System.err.println("Doctor storage is full");
		}
	}
	void addAppointment(Appointment appointment)
	{
		if(this.appointment.length>this.appointmentCounter)
		{
			this.appointment[this.appointmentCounter++]=appointment;
		}
		else
		{
			System.err.println("Appointment storage is full");
		}
	}
	void displayPatients()
	{
		if(this.patientCounter==0)
		{
			System.err.println("Patients is not regestiered\n");
			return;
		}
		for(int i=0;i<this.patient.length;i++)
		{
			this.patient[i].details();
		}
	}
	void displayDoctor()
	{
		if(this.doctorCounter==0)
		{
			System.err.println("Doctor is not regestiered\\n");return;
		}
		for(int i=0;i<this.doctorCounter;i++)
		{
			this.doctor[i].details();
		}
	}
	void displayAppointment()
	{
		if(this.appointmentCounter == 0)
		{
			System.err.println("No Appointments Found");
			return;
		}
		for(int i=0;i<this.appointment.length;i++)
		{
			this.appointment[i].details();
		}
	}
	private Doctor findDoctor(int doctorId)
	{
		for(int i=0;i<this.doctor.length;i++)
		{
			if(this.doctor[i].getDoctorId() ==doctorId)
			{
				return this.doctor[i];
			}
		}
		return null;
	}
	private Appointment findAppointment(int appointmentId)
	{
		for(int i=0;i<this.appointment.length;i++)
		{
			if(this.appointment[i].getAppointmentId() ==  appointmentId)
			{
				return this.appointment[i];
			}
		}
		return null;
	}
	
	public void bookAppointment(Scanner sc)
	{
		if(this.patientCounter >= this.patient.length || this.appointmentCounter>=this.appointment.length)
		{
			System.err.println("Patient or Appointment storage is full");
			return ;
		}
		
		System.out.println("\n===== PATIENT REGISTRATION =====");
		System.out.print("Enter Patient Name: ");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Gender: ");
		String gender= sc.nextLine();

		System.out.print("Enter Phone: ");
		String phone= sc.nextLine();
	
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		Patient pat= new Patient(name, phone, gender, age);

        System.out.println("\n===== CONSULTATION TYPE =====");

        System.out.println("1. General Physician");

        System.out.println("2. Cardiologist");

        System.out.println("3. Dermatologist");

        System.out.print("Select consultation type: ");

        int choice = sc.nextInt();

        String specialization;
        switch (choice)
        {
        case 1: specialization="General Physician";
        break;
        case 2: specialization="Cardiologist";
        break;
        case 3: specialization="Dermatologist";
        break;
        default:
        	System.err.println("Not Available right now");
        	return;
        }
        System.out.println("\n===== AVAILABLE DOCTORS =====");
        boolean doctorAvailable=false;
        for(int i=0;i<this.doctorCounter;i++)
        {
        	if(this.doctor[i].getSpecialization().equalsIgnoreCase(specialization))
        	{
        		this.doctor[i].details();
        		doctorAvailable=true;
        	}
        }
        if(!doctorAvailable)
        {
        	System.err.println("No doctor available for this specialization! ");
        	return;
        }
        sc.nextLine();
        System.out.print("Enter doctor ID: ");
        int doctorId=sc.nextInt();
        Doctor doctor= this.findDoctor(doctorId);
        if(doctor == null || !doctor.getSpecialization().equalsIgnoreCase(specialization))
        {
        	System.err.println("Invalid Docotor section");
        	return;
        }
        sc.nextLine();
        System.out.print("Enter appointment date (DD-MM-YYYY): ");

        String date = sc.nextLine();
        Payment pay= new Payment(doctor.getConsultationFee());
        boolean paymentProcess=pay.paymentProcess(sc);
        if(!paymentProcess)
        {
        	 System.out.println("Appointment booking failed due to payment failure!");
             return;
        }
        addPatient(pat);
        Appointment appointment= new Appointment(pat, doctor, date);
        addAppointment(appointment);
        System.out.println("\nAppointment booked successfully!");
        appointment.setStatus(true);
        appointment.details();
	}
	
	// cancel appointment
	public void cancelAppointment(Scanner sc)
	{
		System.out.print("Enter Appointment id:");
		int appointmentId=sc.nextInt();
		Appointment appointment=findAppointment(appointmentId);
		if(appointment == null)
		{
			System.err.println("No Appointment found");
			return;
		}
		if(!appointment.isStatus())
		{
			System.err.println("Appointment is already cancelled");
			return;
		}
		appointment.cancelAppointment();
		System.out.println("Appointment cancelled successfully!");
	}
	

}
