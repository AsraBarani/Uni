package LORD;

public abstract class Persion {

    private String firstName;
    private String lastName;
    private int age;
    private String nationalCode;
    private String phoneNumber;

    public Persion(String firstName, String lastName, int age, String nationalCode, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
    }

    public abstract void workTime();
    public abstract void enzebat();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "LORD.Persion{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nationalCode='" + nationalCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
