import java.util.Scanner;

public class Main {
    static int lastDigit[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8}; //last digit of factorial smaller than 10

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfTests = in.nextInt();
        for (int i = 0; i < numOfTests; i++) {
            int numberToFindLastNonZeroDigitOfFactorial = in.nextInt();
            System.out.println(findLastNonZeroDigit(numberToFindLastNonZeroDigitOfFactorial));
        }
    }

    private static int findLastNonZeroDigit(int numberToFindLastNonZeroDigitOfFactorial) {
        if (numberToFindLastNonZeroDigitOfFactorial < 10){
            return lastDigit[numberToFindLastNonZeroDigitOfFactorial];
        }
        int x = numberToFindLastNonZeroDigitOfFactorial / 5;
        int y = numberToFindLastNonZeroDigitOfFactorial % 5;
        return (int) (Math.pow(2.0, x) * findLastNonZeroDigit(x)%10 * factorial(y)%10);
    }

    private static int factorial(int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * i;
        }
        return result;
    }
}
