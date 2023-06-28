import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ===== Exercício 1 ===== ");
        Scanner input = new Scanner(System.in);

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

        int i = 0;

        while (i <= countToWhile) {
            System.out.println(i);
            i++;
        }

        System.out.println(" ===== Exercício 4 ===== ");

        int luckyNumber = 7;
        int userNumber = 0;

        do {
            System.out.println("Digite um número entre 1 e 10: ");
            userNumber = input.nextInt();
        } while (userNumber != luckyNumber);

        System.out.println("Você acertou!");

        input.close();
    }
}
