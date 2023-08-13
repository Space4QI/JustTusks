import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты противоположных углов");
        if(scan.hasNextInt()){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int square = area(x, y, x2, y2);
            System.out.println(square);
        }
        else{
            System.out.println("Ошибка: вы не число типа int");
        }
    }
    public static int area(int x, int y, int x2, int y2) {
        int point = Math.abs(x2 - x);
        int point2 = Math.abs(y2 - y);
        return point * point2;
    }
}