import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        String elements = scan.nextLine();

        if (elements.length() != 0 && !elements.equals("")) {
            String[] array = elements.split(" ");
            int[] numericArray = new int[array.length];
            boolean validInput = true;

            for (int i = 0; i < array.length; i++) {
                if (!array[i].matches("-?\\d+")) {
                    System.out.println("Ошибка: введите только числа.");
                    validInput = false;
                    break;
                }
                numericArray[i] = Integer.parseInt(array[i]);
            }

            if (validInput) {
                System.out.println("Введите количество вращений");
                int rotations = scan.nextInt();
                int n = array.length;
                rotations = rotations % n;

                for (int i = 0; i < rotations; i++) {
                    int temp = numericArray[n - 1];
                    for (int j = n - 1; j > 0; j--) {
                        numericArray[j] = numericArray[j - 1];
                    }
                    numericArray[0] = temp;
                }
                for (int num : numericArray) {
                    System.out.print(num + " ");
                }
            }
        } else {
            System.out.println("Ошибка: вы не ввели элементы");
        }
    }
}
