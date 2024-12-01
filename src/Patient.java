public class Patient extends User
{
    private int age;
    private String bloodType;
    private int weight;
    private int height;

    public Patient(String username, String password, String firstName, String lastName, String email,
                   String mobileNum, int age, String bloodType, int weight, int height)
    {
        super(username, password, firstName, lastName, email, mobileNum);
        this.age = age;
        this.bloodType = bloodType;
        this.weight = weight;
        this.height = height;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getBloodType()
    {
        return bloodType;
    }

    public void setBloodType(String bloodType)
    {
        this.bloodType = bloodType;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Patient{" +
                "age=" + age +
                ", bloodType='" + bloodType + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", User Info=" + super.toString() +
                '}';
    }
}