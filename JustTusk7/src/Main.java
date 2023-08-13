import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите скорость");
        if(scan.hasNextInt()) {
            int speed = scan.nextInt();
            if(speed <= 40){
                System.out.println("Слишком медленно");
            }
            if(40 < speed & speed <= 80){
                System.out.println("Медленно");
            }
            if(80 < speed & speed <= 120){
                System.out.println("Оптимально");
            }
            if(speed > 120){
                System.out.println("Слишком быстро");
            }

        }
        else{
            System.out.println("Ошибка: вы ввели не число(-a) типа int");
        }
    }
}