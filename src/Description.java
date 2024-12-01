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
    }

    // Display information about all patients
    public void displayPatients() {
        System.out.println("Patients:");
        // Loop through the patients array and display information if the patient is not null
        for (Patient patient : clinic.getPatients()) {
            if (patient != null) {
                System.out.println("- " + patient.getFirstName() + " " + patient.getLastName() +
                        " (Age: " + patient.getAge() + ", Blood Type: " + patient.getBloodType() + ")");
            }
        }
    }

    // Display information about all receptionists
    public void displayReceptionists() {
        System.out.println("Receptionists:");
        for (Receptionist receptionist : clinic.getReceptionists()) {
            if (receptionist != null) {
                System.out.println("- " + receptionist.getFirstName() + " " + receptionist.getLastName() +
                        " (Gender: " + receptionist.getGender() + ")");
            }
        }
    }

    @Override
    public String toString() {
        return "Description{" +
                "clinicName=" + clinic.getName() +
                ", location=" + clinic.getLocation() +
                '}';
    }
}