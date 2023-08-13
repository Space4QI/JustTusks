import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str = scan.nextLine();
        String[] array = str.split(" ");
        System.out.println("Введите вторую строку:");
        String str2 = scan.nextLine();
        if(str.length() != 0 || str2.length() != 0) {
            String[] array2 = str2.split(" ");
            boolean[] printed = new boolean[array.length];
            for (int i = 0; i < array.length; i++) {
                for (String word : array2) {
                    if (array[i].equals(word) && !printed[i]) {
                        System.out.print(array[i] + " ");
                        printed[i] = true;
                        break;
                    }
                    else{
                        System.out.println("Нет совпадений");
                    }
                }
            }
        }
        else{
            System.out.println("Ошибка: вы не ввели строки");
        }
    }
}
