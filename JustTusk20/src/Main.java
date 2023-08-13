import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scan.nextLine().toLowerCase();
        if(str.length() > 0) {
            if (isPalindrome(str)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        else{
            System.out.println("Ошибка: вы не ввели строку");
        }
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        int i = 0;
        int i2 = str.length() - 1;
        while (i2 > i) {
            if (str.charAt(i) != str.charAt(i2)) {
                return false;
            }
            ++i;
            --i2;
        }
        return true;
    }
}