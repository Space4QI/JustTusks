import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число чисел n");
        if(scan.hasNextInt()) {
            while (true){
                int num = scan.nextInt();
                if(-500 <= num & num <= 500 || 1000 <= num & num <= 1500){
                    System.out.println("Correct number is: " + num);
                    break;
                }
                else{
                    System.out.println("Not yet");
                }
            }
        }
        else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}