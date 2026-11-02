import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HospitalManagement hospital= new HospitalManagement(10,5,10);
		
		// Register Doctors
		hospital.addDoctor(
				new Doctor("Dr. Sharma", "9876543210", "Male",45, "General Physician", 500));
		hospital.addDoctor(
				new Doctor("Dr. Aman", "9876543211", "Male",50, "Cardiologist", 4000 )
				);
		hospital.addDoctor(
				new Doctor("Dr. Jatin", "23443211", "Male",50, "Dermatologist", 590 )
				);
		int choice;


        do {

            System.out.println("\n================================");

            System.out.println(" HOSPITAL MANAGEMENT SYSTEM");

            System.out.println("================================");

            System.out.println("1. Book Appointment");

            System.out.println("2. Cancel Appointment");

            System.out.println("3. View Appointments");

            System.out.println("4. View Patients");

            System.out.println("5. View Doctors");

            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    hospital.bookAppointment(sc);

                    break;

                case 2:

                    hospital.cancelAppointment(sc);

                    break;

                case 3:

                    hospital.displayAppointment();

                    break;

                case 4:

                    hospital.displayPatients();

                    break;

                case 5:

                    hospital.displayDoctor();

                    break;

                case 6:

                    System.out.println("Thank you for using our system!");

                    break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 6);

        sc.close();
		

	}

}
