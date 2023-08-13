import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название книги, которую ищите");
        String book = scan.nextLine();
        System.out.println("Введите кол-во книг в каталоге");
        if(scan.hasNextInt()) {
            int quantity = scan.nextInt();
            scan.nextLine();
            System.out.println("Введите названия книг, для поиска");
            for(int i = 0; i < quantity;i++){
                String name = scan.nextLine();
                if(book.equals(name)){
                    System.out.println("You checked " + i + " books and found: " + book);
                    return;
                }
            }
            System.out.println("The book you search is not here! You checked " + quantity + " books");
        }
        else {
            System.out.println("Ошибка: вы ввели число не типа int");
        }

    }
}