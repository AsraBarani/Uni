package LORD;

public class Main {
    static Work work;
    public static void main(String[] args) {


    Login login = new Login();
    login.menu();

    if ("student".equalsIgnoreCase(Login.role)){
        work = Login.student;
    } else if ("teacher".equalsIgnoreCase(Login.role)) {
        work = Login.teacher;
    }

    if (work != null){
        work.print();
    }


    }
}
