import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во ягнят и их имена");
        int numberOfNames = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numberOfNames; i++) {
            String name = scan.nextLine();
            Lamb.createLamb(name);
        }
        Lamb.printCount();
    }
}

