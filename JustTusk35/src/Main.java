import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[100];
        int accountCount = 0;
        while (true) {
            String command = scan.next();
            if (command.equals("Create")) {
                if (accountCount < 100) {
                    accounts[accountCount] = new BankAccount();
                    System.out.println("Account ID" + accounts[accountCount].getId() + " created");
                    accountCount++;
                } else {
                    System.out.println("Ошибка: вы достигли макс. кол-во аккаунтов.");
                }
            } else if (command.equals("Deposit")) {
                int id = scan.nextInt();
                double amount = scan.nextDouble();
                BankAccount account = getAccountById(accounts, accountCount, id);
                if (account != null) {
                    account.deposit(amount);
                    System.out.println("Deposited " + amount + " to ID" + id);
                } else {
                    System.out.println("Account does not exist");
                }
            } else if (command.equals("SetInterest")) {
                double interestRate = scan.nextDouble();
                for (int i = 0; i < accountCount; i++) {
                    accounts[i].setInterestRate(interestRate);
                }
            } else if (command.equals("GetInterest")) {
                int id = scan.nextInt();
                int years = scan.nextInt();
                BankAccount account = getAccountById(accounts, accountCount, id);
                if (account != null) {
                    double interest = account.calculateInterest(years);
                    System.out.println(interest);
                } else {
                    System.out.println("Account does not exist");
                }
            } else if (command.equals("End")) {
                break;
            }
        }
    }
    private static BankAccount getAccountById(BankAccount[] accounts, int count, int id) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getId() == id) {
                return accounts[i];
            }
        }
        return null;
    }
}
