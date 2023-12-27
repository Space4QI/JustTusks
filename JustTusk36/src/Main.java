import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину, ширину и высоту");
        try {
            double length = Double.parseDouble(scan.next());
            double width = Double.parseDouble(scan.next());
            double height = Double.parseDouble(scan.next());
            Box box = new Box(length, width, height);
            if (length > 0 && width > 0 && height > 0) {
                System.out.println("Surface Area – " + box.calculateSurfaceArea() + "\n" + "Lateral Surface Area - " +
                        box.calculateLateralSurfaceArea() + "\n" + "Volume - " + box.calculateVolume());
            } else if (length < 0 && width < 0 && height > 0) {
                System.out.println("Length and width cannot be zero or negative");
            } else if (length < 0 && height < 0 && width > 0) {
                System.out.println("Length and height cannot be zero or negative");
            } else if (width < 0 && height < 0 && length > 0) {
                System.out.println("Width and height cannot be zero or negative");
            } else if (length < 0 && width > 0 && height > 0) {
                System.out.println("Length cannot be zero or negative");
            } else if (width < 0 && length > 0 && height > 0) {
                System.out.println("Width cannot be zero or negative");
            } else if (height < 0 && length > 0 && width > 0) {
                System.out.println("Height cannot be zero or negative");
            } else {
                System.out.println("Value's cannot be zero or negative");
            }
        }
        catch (NumberFormatException exception) {
            System.out.println("Ошибка: вы ввели не число");
        }
    }
}


