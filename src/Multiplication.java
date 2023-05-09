import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");

        int input = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            int multiply = input * i;
            System.out.println(input + " x " + i + " = " + multiply);
        }
    }
}
