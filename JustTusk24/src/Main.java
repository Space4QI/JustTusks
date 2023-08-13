import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество вагонов");
        if(scan.hasNextInt()) {
            int wagon = scan.nextInt();
            if(wagon > 0) {
                int[] array = new int[wagon];
                System.out.println("Введите общее количество мест в каждом вагоне");
                int places = scan.nextInt();
                for (int i = 0; i < array.length; i++) {
                    array[i] = places;
                }
                int passengers = 0;
                System.out.println("Введите количество свободных мест после посадки в каждом вагоне");
                for (int i = 0; i < array.length; i++) {
                    int freePlaces = scan.nextInt();
                    if (freePlaces <= places & freePlaces >= 0) {
                        int occupiedPlaces = places - freePlaces;
                        passengers += occupiedPlaces;
                        array[i] -= occupiedPlaces;
                    } else {
                        System.out.println("Ошибка: недопустимое кол-во свободных мест");
                        return;
                    }
                }
                System.out.print("Пассажиры: ");
                for (int passenger : array) {
                    System.out.print(places - passenger + " ");
                }
                System.out.println("\nСумма пассажиров: " + passengers);
            }
            else {
                System.out.println("Ошибка: недопустимое число вагонов");
            }
        }
        else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}
