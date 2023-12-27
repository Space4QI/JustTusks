import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя и возраст курицы");
        String name = scan.next();
        if (name.length() >= 3) {
            int age = Integer.parseInt(scan.next());
            if(age > 0 && age < 10) {
                Chicken chicken = new Chicken(age, name);
                System.out.println(chicken.showInfo());
            }
            else {
                System.out.println("Age should be between 0 and 10");
            }
        } else {
            System.out.println("Name cannot be empty or short");
        }
        scan.close();
    }
}

