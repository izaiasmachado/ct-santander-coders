package sortingarrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] numbers = { 5, 4, 1, 2, 3 };
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);
        int[] evenNumbers = onlyEvenNumbers(ascendingOrder);
        int[] oddNumbers = onlyOddNumbers(ascendingOrder);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));
    }

    public static void swap(int[] numbers, int i, int j) {
        int aux = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = aux;
    }

    public static int[] sortAscendingOrder(int[] numbers) {
        int[] ascendingOrder = numbers.clone();

        for (int i = 0; i < ascendingOrder.length; i++) {
            for (int j = 0; j < ascendingOrder.length - 1; j++) {
                if (ascendingOrder[j] > ascendingOrder[j + 1]) {
                    swap(ascendingOrder, j, j + 1);
                }
            }
        }

        return ascendingOrder;
    }

    public static int[] sortDescendingOrder(int[] numbers) {
        int[] descendingOrder = numbers.clone();

        for (int i = 0; i < descendingOrder.length; i++) {
            for (int j = 0; j < descendingOrder.length - 1; j++) {
                if (descendingOrder[j] < descendingOrder[j + 1]) {
                    swap(descendingOrder, j, j + 1);
                }
            }
        }

        return descendingOrder;
    }

    public static int[] onlyEvenNumbers(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        int evenNumbersCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[evenNumbersCount] = numbers[i];
                evenNumbersCount++;
            }
        }

        return evenNumbers;
    }

    public static int[] onlyOddNumbers(int[] numbers) {
        int[] evenNumbers = new int[numbers.length];
        int evenNumbersCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                evenNumbers[evenNumbersCount] = numbers[i];
                evenNumbersCount++;
            }
        }

        return evenNumbers;
    }
}
