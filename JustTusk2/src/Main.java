import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scan.nextLine();
        if(text.length() <= 1) {
            System.out.println("Ошибка: некорректный ввод строки");
            scan.close();
            return;
        }
        System.out.println("Введите 1-ый символ подстроки");
        int symbol1 = scan.nextInt();
        System.out.println("Введите 2-ой символ подстроки");
        int symbol2 = scan.nextInt();
        if(symbol1 <= 0 || symbol2 <= 0 || symbol1 > text.length() || symbol2 > text.length() || symbol1 > symbol2){
            System.out.println("Ошибка: некорректный ввод символа(-ов)");
            scan.close();
            return;
        }
        String subString = text.substring(symbol1, symbol2);
        System.out.println("Результат " + subString);
    }
}