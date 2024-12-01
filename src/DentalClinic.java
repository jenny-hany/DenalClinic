public class DentalClinic {
    private String name;
    private String location;
    private Doctor[] doctors = new Doctor[4];
    private Patient[] patients = new Patient[10];
    private Receptionist[] receptionists = new Receptionist[3];
    private int prices;
    private String[] services = new String[10];

    public DentalClinic(String name, String location, int prices) {
        this.name = name;
        this.location = location;
        this.prices = prices;
    }

    // Method to add a doctor to the clinic
    public void addDoctor(Doctor doctor, int index) {
        if (index >= 0 && index < doctors.length) {
            doctors[index] = doctor;
        } else {
            System.out.println("Invalid index for doctor array.");
        }
    }

    // Method to add a patient to the clinic
    public void addPatient(Patient patient, int index) {
        if (index >= 0 && index < patients.length) {
            patients[index] = patient;
        } else {
            System.out.println("Invalid index for patient array.");
        }
    }

    // Method to add a receptionist to the clinic
    public void addReceptionist(Receptionist receptionist, int index) {
        if (index >= 0 && index < receptionists.length) {
            receptionists[index] = receptionist;
        } else {
            System.out.println("Invalid index for receptionist array.");
        }
    }

    // Getters for the clinic's details
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getPrices() {
        return prices;
    }

    public String[] getServices() {
        return services;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public Receptionist[] getReceptionists() {
        return receptionists;
    }
}