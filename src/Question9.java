public class Question9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] newnumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newnumbers[i] = numbers[i];
        }
        for (int i = 0; i < newnumbers.length; i++) {
            System.out.print(newnumbers[i] + " ");
        }
    }
}
