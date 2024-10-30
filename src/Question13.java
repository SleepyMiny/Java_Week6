public class Question13 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            int rows = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rows += matrix[i][j];
            }
            System.out.println(i+"행의 합: "+rows);
        }

        for (int i = 0; i < matrix.length; i++) {
            int cols = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                cols += matrix[j][i];
            }
            System.out.println(i+"열의 합: "+cols);
        }


    }
}
