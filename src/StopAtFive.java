import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number");

            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 5) {
                break;
            }
        }
    }
}
