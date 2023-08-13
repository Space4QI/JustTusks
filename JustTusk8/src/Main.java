import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер груза");
        if(scan.hasNextDouble()) {
            Double size = scan.nextDouble();
            Double sm = size * 100;
            Double fut = sm / 30.48;
            if(fut <= 15){
                System.out.println("10");
            }
            if(15 < fut & fut <= 25){
                System.out.println("20");
            }
            if(25 < fut & fut <= 35){
                System.out.println("30");
            }
            if(fut > 35){
                System.out.println("40");
            }

        }
        else{
            System.out.println("Ошибка: вы ввели не число");
        }
    }
}