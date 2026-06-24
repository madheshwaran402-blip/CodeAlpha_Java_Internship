import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, grade));
        }

        double total = 0;
        Student highest = students.get(0);
        Student lowest = students.get(0);

        for(Student s : students) {

            total += s.getGrade();

            if(s.getGrade() > highest.getGrade()) {
                highest = s;
            }

            if(s.getGrade() < lowest.getGrade()) {
                lowest = s;
            }
        }

        double average = total / students.size();

        System.out.println("\n===== STUDENT REPORT =====");

        for(Student s : students) {
            System.out.println(
                    "Name: " + s.getName() +
                            " | Grade: " + s.getGrade());
        }

        System.out.println("\nAverage Score: " + average);

        System.out.println(
                "Highest Score: " +
                        highest.getName() +
                        " (" + highest.getGrade() + ")");

        System.out.println(
                "Lowest Score: " +
                        lowest.getName() +
                        " (" + lowest.getGrade() + ")");
    }
}