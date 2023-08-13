import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите страну посещения (или 'End' для завершения): ");
        while (true) {
            String country = scan.nextLine();
            if (country.equals("End")) {
                System.out.println("Вы завершили программу. До свидания!");
                break;
            }
            System.out.println("Требуемый бюджет для поездки:");
            if(scan.hasNextInt()) {
                int budget = scan.nextInt();

                int savedMoney = 0;

                while (savedMoney < budget) {
                    System.out.println("Сколько денег вы отложите на путешествие: ");
                    if(scan.hasNextInt()) {
                        int savedAmount = scan.nextInt();

                        savedMoney += savedAmount;
                        System.out.println("Сумма накопленных средств: " + savedMoney);

                        if (savedMoney >= budget) {
                            System.out.println("Поздравляем! Вы накопили достаточно денег для поездки в " + country + ".");
                            break;
                        }
                    }
                    else {
                        System.out.println("Ошибка: вы ввели не число типа int");
                        break;
                    }
                }

                System.out.println("Планируем поехать в " + country + ".");
            }
            else {
                System.out.println("Ошибка: вы ввели не число типа int");
            }
        }
    }
}
