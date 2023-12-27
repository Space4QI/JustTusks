import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во машин");
        if(scan.hasNextInt()) {
            int N = scan.nextInt();
            scan.nextLine();
            Car[] cars = new Car[N];
            System.out.println("Введите машины");
            for (int i = 0; i < N; i++) {
                String[] carInfo = scan.nextLine().split(" ");
                String make = carInfo[0];
                String model = carInfo[1];
                int horsePower = Integer.parseInt(carInfo[2]);
                cars[i] = new Car(make, model, horsePower);
            }
            for (Car car : cars) {
                System.out.println(car.getInfo());
            }
        }
        else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}