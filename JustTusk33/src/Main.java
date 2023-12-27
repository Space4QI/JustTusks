import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во человек");
        if (scan.hasNextInt()) {
            int N = scan.nextInt();
            scan.nextLine();
            Person[] persons = new Person[N];
            System.out.println("Введите возраст и имя человека");

            for (int i = 0; i < N; i++) {
                String personInfo = scan.nextLine();
                String[] parts = personInfo.split(" ");

                if (parts.length == 2) {
                    try {
                        int age = Integer.parseInt(parts[0]);
                        String name = parts[1];
                        persons[i] = new Person(name, age);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка: некорректный формат возраста.");
                        return;
                    }
                } else {
                    System.out.println("Ошибка: введите данные в формате 'возраст имя'.");
                    return;
                }
            }
            System.out.println("Люди старше 17 лет:");
            for (Person person : persons) {
                if (person != null && person.getAge() > 17) {
                    System.out.println(person.personInfo());
                }
            }
        } else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}