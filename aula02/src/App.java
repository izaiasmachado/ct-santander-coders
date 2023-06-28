import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println(" ===== Exercício 1 ===== ");
        System.out.println("Digite um número: ");
        int number = input.nextInt();

        boolean isZero = number == 0;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;

        if (isZero) {
            System.out.println("O número é zero");
        } else if (isPositive) {
            System.out.println("O número é positivo");
        } else if (isNegative) {
            System.out.println("O número é negativo");
        }

        System.out.println(" ===== Exercício 2 ===== ");

        System.out.println("Digite um número inteiro e positivo: ");
        int countToFor = input.nextInt();

        for (int i = 0; i <= countToFor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println(" ===== Exercício 3 ===== ");

        System.out.println("Digite um número inteiro e positivo: ");
        int countToWhile = input.nextInt();

        int count = 0;

        while (count <= countToWhile) {
            System.out.println(count);
            count++;
        }

        System.out.println(" ===== Exercício 4 ===== ");

        int luckyNumber = 7;
        int userNumber = 0;

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            userNumber = input.nextInt();
        } while (userNumber != luckyNumber);

        System.out.println("Você acertou!");

        System.out.println(" ===== Exercício 5 ===== ");

        System.out.println("Digite um número inteiro e positivo: ");
        int n = input.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i += 2) {
            int spaces = n - i;

            for (int j = 0; j < spaces / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < spaces / 2; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        input.close();

    }
}
