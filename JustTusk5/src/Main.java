import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        if(scan.hasNextInt()) {
            int num = scan.nextInt();
            System.out.println("Введите второе число");
            int num2 = scan.nextInt();
            System.out.println("Введите третье число");
            int num3 = scan.nextInt();
            if(num == num2 & num == num3 & num2 == num3) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
        else{
            System.out.println("Ошибка: вы ввели не число(-a) типа int");
        }
    }
}