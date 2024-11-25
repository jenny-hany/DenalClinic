public abstract class User
{
     String Username;
     String Password;
     String Firstname;
    String Lastname;
    String Email;
     String Mobilenum;

    public User(String Username, String Password, String FirstName, String LastName,
                String Email, String Mobilenum)
    {
        this.Username = Username;
        this.Password = Password;
        this.Firstname = FirstName;
        this.Lastname = LastName;
        this.Email = Email;
        this.Mobilenum = Mobilenum;
    }

    // Getters and Setters
    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }

    public String getFirstName()
    {
        return Firstname;
    }

    public void setFirstName(String Firstname)
    {
        this.Firstname = Firstname;
    }

    public String getLastName()
    {
        return Lastname;
    }

    public void setLastName(String Lastname)
    {
        this.Lastname = Lastname;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "email='" + Email + '\'' +
                ", firstName='" + Firstname + '\'' +
                ", lastName='" + Lastname + '\'' +
                '}';
    }

}
