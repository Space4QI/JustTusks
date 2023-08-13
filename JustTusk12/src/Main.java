import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите название фрукта: ");
        String fruit = scan.nextLine().toLowerCase();

        System.out.print("Введите день недели: ");
        String day = scan.nextLine().toLowerCase();
        System.out.print("Введите количество кг: ");
        double weight = scan.nextDouble();
        scan.close();

        double price;
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (fruit) {
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.20;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                    default:
                        System.out.println("error");
                        return;
                }
                break;
            case "saturday":
            case "sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.70;
                        break;
                    case "apple":
                        price = 1.25;
                        break;
                    case "orange":
                        price = 0.90;
                        break;
                    case "grapefruit":
                        price = 1.60;
                        break;
                    case "kiwi":
                        price = 3.00;
                        break;
                    case "pineapple":
                        price = 5.60;
                        break;
                    case "grapes":
                        price = 4.20;
                        break;
                    default:
                        System.out.println("error");
                        return;
                }
                break;
            default:
                System.out.println("error");
                return;
        }

        double totalCost = price * weight;
        System.out.printf("Стоимость: %.2f%n", totalCost);
    }
}