import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        try {
            double sideA = Double.parseDouble(scan.next());
            double sideB = Double.parseDouble(scan.next());
            double sideC = Double.parseDouble(scan.next());
            Triangle triangle = new Triangle(sideA, sideB, sideC);
            if(triangle.isValid() && triangle.isTriangle()) {
                double perimeter = triangle.calculatePerimeter();
                double area = triangle.calculateArea();
                System.out.println("Perimeter – " + triangle.calculatePerimeter() + "\n" + "Area - " +
                        triangle.calculateArea());
            }
             else if (sideA < 0 && sideB < 0 && sideC > 0) {
                System.out.println("A and B cannot be zero or negative");
            } else if (sideA < 0 && sideC < 0 && sideB > 0) {
                System.out.println("A and C cannot be zero or negative");
            } else if (sideB < 0 && sideC < 0 && sideA > 0) {
                System.out.println("B and C cannot be zero or negative");
            } else if (sideA < 0 && sideB > 0 && sideC > 0) {
                System.out.println("A cannot be zero or negative");
            } else if (sideB < 0 && sideA > 0 && sideC > 0) {
                System.out.println("B cannot be zero or negative");
            } else if (sideC < 0 && sideA > 0 && sideB > 0) {
                System.out.println("C cannot be zero or negative");
            } else if (sideC < 0 && sideA < 0 && sideB < 0) {
                System.out.println("Value's cannot be zero or negative");
            }
             else {
                 System.out.println("Triangle cann`t have sum of two \n" +
                         "sides less than third side\n");
            }
        }
        catch (NumberFormatException exception) {
            System.out.println("Ошибка: вы ввели не число");
        }
    }
}


