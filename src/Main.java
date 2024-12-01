public class Main {
    public static void main(String[] args) {
        // Create sample clinic
        DentalClinic clinic = new DentalClinic("Smile Dental", "Downtown", 100);

        // Create sample users
        Doctor doctor = new Doctor("doc123", "pass", "John", "Doe", "john@example.com", "1234567890", "Orthodontist");
        Patient patient = new Patient("pat123", "pass", "Jane", "Smith", "jane@example.com", "9876543210", 30, "O+", 70, 160);
        Receptionist receptionist = new Receptionist("rec123", "pass", "Sarah", "Connor", "sarah@example.com", "5555555555", 25, "Female");

        // Add users to the clinic (Using correct methods to add to the clinic arrays)
        clinic.addDoctor(doctor, 0);  // Adds doctor to index 0
        clinic.addPatient(patient, 0); // Adds patient to index 0
        clinic.addReceptionist(receptionist, 0); // Adds receptionist to index 0

        // Create description and display clinic info
        Description description = new Description(clinic);
        description.displayClinicInfo();
        description.displayDoctors();
        description.displayPatients(); // Displays patients (patient added earlier)
        description.displayReceptionists();

        // Create an appointment reservation
        AppointmentReservation appointment = new AppointmentReservation("01/12/2024", "Monday", "Dr. John Doe", "Jane Smith", "10:00 AM");
        appointment.displayAppointmentDetails();

        // Create and display payment method
        PaymentMethod payment = new PaymentMethod("Credit Card", 100, 10);
        System.out.println(payment);
    }
}