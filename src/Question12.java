import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.print("numbers["+i+"]");
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("No numbers");
        }

    }
}
