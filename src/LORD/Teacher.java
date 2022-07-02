package LORD;

public class Teacher extends Persion implements Work {

    private int sabeghe;
    private String teacherCode;

    public Teacher(String firstName, String lastName, int age, String nationalCode, String phoneNumber, int sabeghe, String teacherCode) {
        super(firstName, lastName, age, nationalCode, phoneNumber);
        this.sabeghe = sabeghe;
        this.teacherCode = teacherCode;
    }

    public int getSabeghe() {
        return sabeghe;
    }

    public void setSabeghe(int sabeghe) {
        this.sabeghe = sabeghe;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    @Override
    public void workTime() {
        System.out.println("Emrooz 10 Saat Tadris Karde");
    }

    @Override
    public void enzebat() {
        System.out.println("Rezayat mandi Olia az Ostad 19 Mibashad");
    }

    @Override
    public void job() {
        System.out.println("Moooalem Bayad Tadriis Koone !");
    }

    @Override
    public void exam() {
        System.out.println("saate 15 Bayad Emtehane Andishe Begire");
    }

    @Override
    public void esteraht() {
        System.out.println("15 otaghe moodir esterahat dare ");
    }
    @Override
    public void print() {
        this.toString();
        job();
        exam();
        enzebat();
    }
}
