package LORD;

import java.util.Arrays;
import java.util.Scanner;

public class Login {
    String[] users = {"student", "teacher"};
    Scanner scanner = new Scanner(System.in);
    public static Student student;
    public static Teacher teacher;
    public static String role;


    public void menu() {
        System.out.println("lootfan Username Khood ra vared koonid : ");
        String user = findUser(scanner.next());

        switch (user) {
            case "student":
                studentMenu();
                role = "student";
                break;

            case "teacher":
                teacherMenu();
                role = "teacher";
                break;

            default:
                System.out.println("Mooshakhasate shooma eshtebah ast lootfan moojadad emtehan koonid ! ");
        }

    }

    private void teacherMenu() {
        System.out.println("Lootfan firstName   Ravared koonid ");
        String firstName = scanner.next();
        System.out.println("Lootfan  lastName  Ravared koonid ");
        String lastName = scanner.next();
        System.out.println("Lootfan age   Ravared koonid ");
        int age = scanner.nextInt();
        System.out.println("Lootfan  nationalCode  Ravared koonid ");
        String nationalCode = scanner.next();
        System.out.println("Lootfan  phoneNumber  Ravared koonid ");
        String phoneNumber = scanner.next();
        System.out.println("Lootfan  teacherCode  Ravared koonid ");
        String teacherCode = scanner.next();
        System.out.println("Lootfan  sabeghe  Ravared koonid ");
        int sabeghe = scanner.nextInt();

        teacher = new Teacher(firstName,lastName,age,nationalCode
                ,phoneNumber,sabeghe,teacherCode);



    }

    private void studentMenu() {
        System.out.println("Lootfan firstName   Ravared koonid ");
        String firstName = scanner.next();
        System.out.println("Lootfan  lastName  Ravared koonid ");
        String lastName = scanner.next();
        System.out.println("Lootfan age   Ravared koonid ");
        int age = scanner.nextInt();
        System.out.println("Lootfan  nationalCode  Ravared koonid ");
        String nationalCode = scanner.next();
        System.out.println("Lootfan  phoneNumber  Ravared koonid ");
        String phoneNumber = scanner.next();
        System.out.println("Lootfan  studentCode  Ravared koonid ");
        String studentCode = scanner.next();
        System.out.println("Lootfan  term  Ravared koonid ");
        int term = scanner.nextInt();

        student = new Student(firstName,lastName,age,nationalCode
        ,phoneNumber,studentCode,term);
    }


    String findUser(String username) {
        return Arrays.stream(this.users).filter(user -> username.equalsIgnoreCase(user)).findFirst().orElse("notFind");
    }
}
