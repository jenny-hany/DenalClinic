public class Description {
    private DentalClinic clinic;

    // Constructor
    public Description(DentalClinic clinic) {
        this.clinic = clinic;
    }

    // Display all information about the clinic
    public void displayClinicInfo() {
        System.out.println("Clinic Name: " + clinic.getName());
        System.out.println("Location: " + clinic.getLocation());
        System.out.println("Prices: " + clinic.getPrices());
        System.out.println("Services Offered:");
        for (String service : clinic.getServices()) {
            if (service != null) {
                System.out.println("- " + service);
            }
        }
    }

    // Display information about all doctors
    public void displayDoctors() {
        System.out.println("Doctors:");
        for (Doctor doctor : clinic.getDoctors()) {
            if (doctor != null) {
                System.out.println("- Dr. " + doctor.getFirstName() + " " + doctor.getLastName() +
                        " (Specialization: " + doctor.getSpecialization() + ")");
            }
        }
    }}

// Display information ab