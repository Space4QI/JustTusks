import java.util.Scanner;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите лог. операцию");
        String mat = scan.nextLine();

        if (mat.equals("+") || mat.equals("-") || mat.equals("*") || mat.equals("/") || mat.equals("^")) {
            System.out.println("Введите первое число");
            if (scan.hasNextDouble()) {
                double num = scan.nextDouble();

                System.out.println("Введите второе число");
                if (scan.hasNextDouble()) {
                    double num2 = scan.nextDouble();

                    if (mat.equals("+")) {
                        System.out.println("num + num2 = " + (num + num2));
                    } else if (mat.equals("-")) {
                        System.out.println("num - num2 = " + (num - num2));
                    } else if (mat.equals("*")) {
                        System.out.println("num * num2 = " + (num * num2));
                    } else if (mat.equals("/")) {
                        if (num2 != 0) {
                            double result = num / num2;
                            String formattedResult = String.format("%.3f", result);
                            System.out.println("num / num2 = " + formattedResult);
                        } else {
                            System.out.println("division by zero");
                        }
                    } else if (mat.equals("^")) {
                        System.out.println("num^(num2) = " + pow(num, num2));
                    }
                } else {
                    System.out.println("Ошибка: вы ввели не число");
                }
            } else {
                System.out.println("Ошибка: вы ввели не число");
            }
        } else {
            System.out.println("Ошибка: введена неверная логическая операция");
        }
    }
}




