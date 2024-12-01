public class Account extends User {
    private String accountType; // e.g., Dentist, Patient, Receptionist
    private boolean isActive;


    public Account(String username, String password, String firstName, String lastName, String email,
                   String mobileNum, String accountType, boolean isActive) {
        super(username, password, firstName, lastName, email, mobileNum);
        this.accountType = accountType;
        this.isActive = isActive;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountType='" + accountType + '\'' +
                ", isActive=" + isActive +
                ", User Info=" + super.toString() +
                '}';
    }
}