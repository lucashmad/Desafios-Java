import Application.Student;

import java.util.Locale;
import java.util.Scanner;

public final class ChallengeTree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.name = scanner.nextLine();
        student.noteOne = scanner.nextDouble();
        student.noteTwo = scanner.nextDouble();
        student.noteTree = scanner.nextDouble();

        System.out.printf("Final Grade %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n", student.missingPoints());
        }
            else {
            System.out.println("PASS!");
        }
        scanner.close();
    }

}
