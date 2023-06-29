public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ===== Exercício 1 ===== ");

        int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrixB = { { 7, 8 }, { 9, 10 }, { 11, 12 } };

        int[][] resultMatrix = new int[2][2];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Matriz resultante: ");
        printMatrix(resultMatrix);

        System.out.println(" ===== Exercício 2 ===== ");

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        int[][] transposedMatrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matriz transposta: ");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
