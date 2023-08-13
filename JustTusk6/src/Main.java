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
            int sum = num + num2 + num3;
            int remainder = sum % 60;
            String minute = String.format("%02d", remainder);
            System.out.println(sum / 60 + ":" + minute);
        }
        else{
            System.out.println("Ошибка: вы ввели не число(-a) типа int");
        }
    }
}