
public class Account extends User
{
    private String accountType; // e.g., Dentist, Patient, Receptionist
    private boolean isActive; // Account status

    // Constructor
    public Account(String Username, String Password, String Firstname, String Lastname,String Email,
                   String Mobilenum,String accountType, boolean isActive)
    {
        super(Username, Password, Firstname, Lastname,Email,Mobilenum);
        this.accountType = accountType;
        this.isActive = isActive;
    }

    // Getters and Setters
    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public boolean isActive()
    {
        return isActive;
    }

    public void setActive(boolean active)
    {
        isActive = active;
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "accountType='" + accountType + '\'' +
                ", isActive=" + isActive +
                ", User Info=" + super.toString() +
                '}';
    }
}