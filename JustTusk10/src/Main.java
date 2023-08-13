import java.util.Scanner;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фигуру");
        String figure = scan.nextLine().toLowerCase();

        if (figure.equals("square")) {
            System.out.println("Введите длину квадрата");
            int length = scan.nextInt();
            if (length > 0) {
                double area = pow(length, 2);
                System.out.println("Площадь = " + formatNumber(area));
            } else {
                System.out.println("error");
            }
        } else if (figure.equals("rectangle")) {
            System.out.println("Введите первую сторону прямоугольника");
            int a = scan.nextInt();
            System.out.println("Введите вторую сторону прямоугольника");
            int b = scan.nextInt();
            if (a > 0 & b > 0) {
                double area = a * b;
                System.out.println("Площадь = " + formatNumber(area));
            } else {
                System.out.println("error");
            }
        } else if (figure.equals("circle")) {
            System.out.println("Введите радиус круга");
            int r = scan.nextInt();
            if (r > 0) {
                double area = Math.PI * pow(r, 2);
                System.out.println("Площадь = " + formatNumber(area));
            } else {
                System.out.println("error");
            }
        } else if (figure.equals("triangle")) {
            System.out.println("Введите сторону треугольника");
            int a = scan.nextInt();
            System.out.println("Введите высоту треугольника");
            int h = scan.nextInt();
            if (a > 0 & h > 0) {
                double area = 0.5 * a * h;
                System.out.println("Площадь = " + formatNumber(area));
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("Ошибка: неверный ввод фигуры");
        }
    }

    private static String formatNumber(double number) {
        return String.format("%.3f", number);
    }
}
