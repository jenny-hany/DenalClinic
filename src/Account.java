public abstract class Account extends User
{

    public Account(String Username, String Password, String Email)
    {
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
    }

    // Getters and setters
    public String getUsername()
    {
        return Username;
    }

    public void setUsername(String username)
    {
        this.Username = Username;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String Password)
    {
        this.Password=Password;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email=Email;
    }

    // Abstract methods for role-specific functionalities
    public abstract void displayRole();


}
