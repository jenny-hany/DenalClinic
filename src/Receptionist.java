public class Receptionist extends User
{
    private int age;
    private String gender;

    public Receptionist(String username, String password, String firstName, String lastName, String email,
                        String mobileNum, int age, String gender)
    {
        super(username, password, firstName, lastName, email, mobileNum);
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", User Info=" + super.toString() +
                '}';
    }
}