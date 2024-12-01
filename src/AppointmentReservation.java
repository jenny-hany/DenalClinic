public class AppointmentReservation {
  private String day;  // Day of the week
  private String doctorName;
  private String patientName;
  private String timeSlot; // Format: HH:MM

  // Constructor
  public AppointmentReservation(String date, String day, String doctorName, String patientName, String timeSlot) {
    this.date = date;
    this.day = day;
    this.doctorName = doctorName;
    this.patientName = patientName;
    this.timeSlot = timeSlot;
  }

  // Default Constructor
  public AppointmentReservation() {
    this.date = "";
    this.day = "";
    this.doctorName = "";
    this.patientName = "";
    this.timeSlot = "";
  }

  // Getters and Setters
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public String getTimeSlot() {
    return timeSlot;
  }

  public void setTimeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
  }

  // Display Appointment Details
  public void displayAppointmentDetails()
  {
    System.out.println("Appointment Details:");
    System.out.println("Date: " + date);
    System.out.println("Day: " + day);
    System.out.println("Time Slot: " + timeSlot);
    System.out.println("Doctor: " + doctorName);
    System.out.println("Patient: " + patientName);
  }
  public void setappointmentdetails(Doctor d ,String day,String timeSlot)
  {

  }
  @Override
  public String toString() {
    return "AppointmentReservation{" +
            "date='" + date + '\'' +
            ", day='" + day + '\'' +
            ", doctorName='" + doctorName + '\'' +
            ", patientName='" + patientName + '\'' +
            ", timeSlot='" + timeSlot + '\'' +
            '}';
  }
}