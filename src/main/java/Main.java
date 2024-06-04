import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new FizzBuzzImpl();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            String result = fizzbuzz.checkFizzBuzz(i);
            System.out.println(result);
        }
    }
}
