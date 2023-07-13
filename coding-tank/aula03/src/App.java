public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ===== Exercício 1 ===== ");

        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println("A soma dos elementos do array é: " + sumArrays(arr));

        System.out.println(" ===== Exercício 2 ===== ");

        System.out.println("O maior número do array é: " + highestNumber(arr));

        System.out.println(" ===== Exercício 3 ===== ");

        String answer = hasNumber(arr, 3) ? "Sim" : "Não";
        System.out.println("O array contém o número 3? " + answer);
    }

    public static int sumArrays(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int highestNumber(int[] array) {
        int highest = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                highest = array[i];
            }
        }

        return highest;
    }

    public static boolean hasNumber(int[] array, int number) {
        boolean hasNumber = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                hasNumber = true;
            }
        }

        return hasNumber;
    }
}
