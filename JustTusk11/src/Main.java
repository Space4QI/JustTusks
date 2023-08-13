import java.util.Scanner;

import static java.lang.Math.pow;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тип места");
        String type = scan.nextLine().toLowerCase();

        if (type.equals("compartment")) {
            System.out.println("Введите кол-во вагонов");
            int wagon = scan.nextInt();
            System.out.println("Введите кол-во мест");
            int place = scan.nextInt();
            if (wagon > 0 & place > 0) {
                double income = wagon * place * 12;
                System.out.println("Доход = " + formatNumber(income) + "$");
            } else {
                System.out.println("error");
            }
        } else if (type.equals("second-class")) {
            System.out.println("Введите кол-во вагонов");
            int wagon = scan.nextInt();
            System.out.println("Введите кол-во мест");
            int place = scan.nextInt();
            if (wagon > 0 & place > 0) {
                double income = wagon * place * 7.5;
                System.out.println("Доход = " + formatNumber(income) + "$");
            } else {
                System.out.println("error");
            }
        } else if (type.equals("econom-class")) {
            System.out.println("Введите кол-во вагонов");
            int wagon = scan.nextInt();
            System.out.println("Введите кол-во мест");
            int place = scan.nextInt();
            if (wagon > 0 & place > 0) {
                double income = wagon * place * 5;
                System.out.println("Доход = " + formatNumber(income) + "$");
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("Ошибка: неверный тип места");
        }
    }

    private static String formatNumber(double number) {
        return String.format("%.2f", number);
    }
}
