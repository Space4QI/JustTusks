import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите транспортное средство");
        String vehicle = scan.nextLine();
        System.out.println("Введите кол-во пассажиров");
        int passengers = Integer.parseInt(scan.next());
        switch (vehicle){
            case ("Car"):
                Car Car = new Car();
                System.out.println("Введите скорость и модель");
                int horsePower = Integer.parseInt(scan.next());
                String model = scan.next();
                System.out.println(Car.isCar(passengers, horsePower, model));
                break;
            case ("Boat"):
                Boat Boat = new Boat();
                System.out.println("Введите кол-во вёсел");
                int oars = Integer.parseInt(scan.next());
                if(oars >= 2) {
                    System.out.println(Boat.isBoat(passengers, oars));
                    break;
                } else if (oars == 0) {
                    System.out.println("Need oars to swim");
                    break;
                } else {
                    System.out.println("Ошибка: нужно больше вёсел");
                    break;
                }
            case ("Airplane"):
                Airplane Airplane = new Airplane();
                System.out.println("Введите кол-во крыльев и двигателей");
                int wingsCount = Integer.parseInt(scan.next());
                if(wingsCount >= 2) {
                    int enginesNumber = Integer.parseInt(scan.next());
                    if(enginesNumber >= 1) {
                        boolean isHydroplane = scan.nextBoolean();
                        System.out.println(Airplane.isAirplane(passengers, wingsCount, enginesNumber, isHydroplane));
                        break;
                    }
                    else {
                        System.out.println("Ошибка: нужен хотя бы 1 двигатель");
                        break;
                    }
                }
                else if (wingsCount == 0) {
                    System.out.println("Need wings to fly");
                    break;
                } else {
                    System.out.println("Ошибка: нужно больше крыльев");
                    break;
                }
            default:
                System.out.println("Ошибка: такого транспортного средства в нашем списке нет");
        }
    }
}