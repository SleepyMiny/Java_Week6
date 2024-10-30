import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.print("존재합니다");
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("존재하지 않습니다.");
        }
    }
}
