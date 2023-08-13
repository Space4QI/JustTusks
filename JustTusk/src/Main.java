import java.util.Scanner;

class Difference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 символа, разделенных пробелом:");
        String input = scan.nextLine();
        String[] symbols = input.split(" ");

        if (symbols.length == 2 && symbols[0].length() == 1 && symbols[1].length() == 1) {
            char firstSymbol = symbols[0].charAt(0);
            char secondSymbol = symbols[1].charAt(0);
            if (Character.isLetter(firstSymbol) && Character.isLetter(secondSymbol)) {
                int f = firstSymbol;
                int s = secondSymbol;
                System.out.println("Разница: " + Math.abs(f - s));
            } else {
                System.out.println("Ошибка: вы ввели не буквы");
            }
        } else {
            System.out.println("Ошибка: введите 2 символа, разделенных пробелом");
        }
    }
}