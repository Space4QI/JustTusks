import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scan.nextLine();
        if(text.length() <= 0) {
            System.out.println("Ошибка: некорректный ввод строки");
            scan.close();
            return;
        }
        System.out.println("Введите заменяемый символ");
        char symbol1 = scan.next().charAt(0);
        System.out.println("Введите символ для замены");
        char symbol2 = scan.next().charAt(0);
        String str = text.replace(symbol1, symbol2);
        System.out.println("Результат " + str);
    }
}