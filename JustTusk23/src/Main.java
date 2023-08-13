import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n");
        if (scan.hasNextBigInteger()) {
            BigInteger n = scan.nextBigInteger();
            System.out.println("Введите число k");
            BigInteger k = scan.nextBigInteger();
            BigInteger C = factorial(n).divide(factorial(k).multiply(factorial(n.subtract(k))));
            System.out.println(C);
        } else {
            System.out.println("Ошибка: вы не ввели число типа BigInteger");
        }
    }

    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
