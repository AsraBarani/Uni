package LORD;

public class Student extends Persion implements Work{

    private String studentCode;
    private int term;

    public Student(String firstName, String lastName, int age, String nationalCode, String phoneNumber, String studentCode, int term) {
        super(firstName, lastName, age, nationalCode, phoneNumber);
        this.studentCode = studentCode;
        this.term = term;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public void workTime() {
        System.out.println("Emrroz 7 Saat Sare Class Bode");
    }

    @Override
    public void enzebat() {
        System.out.println("Enzebate DaneshAmooz in Term 18 Shoode");
    }


    @Override
    public void job() {
        System.out.println("Vazife ===> DARSKHOONDAN");
    }

    @Override
    public void exam() {
        System.out.println("sate 9 emtehan Reyazi bayad Bede");
    }

    @Override
    public void esteraht() {
        System.out.println("15 min dar Hayat Zange tafrih dare");
    }

    @Override
    public void print() {
       this.toString();
        job();
        exam();
        enzebat();
    }
}
