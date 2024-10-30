public class ArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {10, 30, 20, 50, 40};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] > max ) {
                System.out.println("max = "+max+"numbers["+i+"] = "+numbers[i]);
                max = numbers[i];
            }
            System.out.println("max = "+max);  // 배열의 각 요소 출력
        }



    }
}
