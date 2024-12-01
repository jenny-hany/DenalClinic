public class Doctor extends User
{
    private String[] availableDays ;
    private float availableHours;
    private String specialization;

    public Doctor(String username, String password, String firstName, String lastName, String email,
                  String mobileNum, String specialization,String [] availableDays)
    {
        super(username, password, firstName, lastName, email, mobileNum);
        this.specialization = specialization;
        this.availableDays=availableDays;
    }

    public String[] getAvailableDays()
    {
        return availableDays;
    }

    public void setAvailableDays(String[] availableDays)
    {
        this.availableDays = availableDays;
    }

    public float getAvailableHours()
    {
        return availableHours;
    }

    public void setAvailableHours(float availableHours)
    {
        this.availableHours = availableHours;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    public void createPrescription(String patientName, String details)
    {
        System.out.println("Prescription for " + patientName + ": " + details);
    }


    @Override
    public String toString()
    {
        return "Doctor{" +
                "specialization='" + specialization + '\'' +
                ", User Info=" + super.toString() +
                '}';
    }
}