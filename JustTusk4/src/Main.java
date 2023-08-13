import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую подстроку");
        String text = scan.nextLine();
        System.out.println("Введите вторую подстроку");
        String text2 = scan.nextLine();
        if(text.length() <= 0 || text2.length() <= 0) {
            System.out.println("Ошибка: некорректный ввод подстрок(-и)");
            scan.close();
            return;
        }
        text = text.concat(text2);
        System.out.println("Результат " + text.toUpperCase());
    }
}