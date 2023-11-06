import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        System.out.println("Is it true that " + answer + " is odd? " + isEven(answer));
    }
    public static boolean isEven(int input) {
        int remainder = input%2;
        boolean result = true;
        if (remainder == 0) {
            return false;
        } else {
            return true;
        }
    }
}
