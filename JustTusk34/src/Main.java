import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину, ширину и высоту");
        if (scan.hasNextDouble()) {
            double length = scan.nextDouble();
            double width = scan.nextDouble();
            double height = scan.nextDouble();
            if(length > 0 & width > 0 & height > 0) {
                Box box = new Box((int) length, (int) width, (int) height);
                System.out.println("Surface Area – " + box.calculateSurfaceArea() + "\n" + "Lateral Surface Area - " +
                        box.calculateLateralSurfaceArea() + "\n" + "Volume - " + box.calculateVolume());
            }
            else {
                System.out.println("Ошибка: измереняемые(-ая) величины(-а) должны(-а) быть больше 0");
            }
        } else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}