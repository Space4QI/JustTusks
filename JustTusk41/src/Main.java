import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя, фамилию и номер факультета");
        String firstNameStudent = scan.next();
        String lastNameStudent = scan.next();
        String facultyNumber = scan.next();
        Student student = new Student(firstNameStudent, lastNameStudent, facultyNumber);

        System.out.println("Введите имя, фамилию, недельную зарплату и кол-во часов в день");
        String firstNameWorker = scan.next();
        String lastNameWorker = scan.next();
        double weekSalary = Double.parseDouble(scan.next());
        double workHoursPerDay = Double.parseDouble(scan.next());
        Worker worker = new Worker(firstNameWorker, lastNameWorker, weekSalary, workHoursPerDay);

        System.out.println("Студент:");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Faculty number: " + student.getFacultyNumber());

        System.out.println("Работник:");
        System.out.println("First Name: " + worker.getFirstName());
        System.out.println("Last Name: " + worker.getLastName());
        System.out.println("Week Salary: " + String.format("%.2f", worker.getWeekSalary()));
        System.out.println("Hours per day: " + String.format("%.2f", worker.getWorkHoursPerDay()));
        System.out.println("Salary per hour: " + String.format("%.2f", worker.getSalaryPerHour()));
    }
}