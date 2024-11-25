public abstract class User
{
  String Username;
     String Password;
     String Firstname;
    String Lastname;
    String Email;
     String Mobilenum;

    public User(String Username, String Password, String FirstName, String LastName,
                String Email, String Mobilenum) {
        this.Username = Username;
        this.Password = Password;
        this.Firstname = FirstName;
        this.Lastname = LastName;
        this.Email = Email;
        this.Mobilenum = Mobilenum;
    }

    public boolean Login(String password) {
        return this.Password.equals(password);
    }

}
