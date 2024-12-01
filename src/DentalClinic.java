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