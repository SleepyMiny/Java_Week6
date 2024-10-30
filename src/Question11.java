public class Question11 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] newnum = new int[numbers.length];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < counter; j++) {
                if (numbers[i] == newnum[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                newnum[counter] = numbers[i];
                counter++;
            }
        }
        int[] resultnum = new int[counter];
        for (int i = 0; i < counter; i++) {
            resultnum[i] = newnum[i];
        }

        for (int i = 0; i < resultnum.length; i++) {
            System.out.print(resultnum[i] + " ");
        }
    }
}
