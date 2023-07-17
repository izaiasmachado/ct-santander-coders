# Lógica de Programação - Aula 02

## Atividade 01

Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

```
C = 5 * ((F-32) / 9)
```

## Atividade 02

Maria tem uma frutaria e está com uma promoção para quem comprar mais de 10 frutas (do mesmo item). A tabela de preços das frutas com preços especiais são:

````

pera
laranja
maçã
tomate
caqui

```

Comprando qualquer fruta da promoção e levando acima de 10 frutas o preço da unidade fica em 1.25 cada, caso a pessoa leve uma quantidade inferior ou igual a 10, o preço individual da fruta fica em 1.45.

Faça uma função que recebe a quantidade de frutas que o cliente está levando e calcule o valor final a ser pago. Arredondar o valor final da compra para 2 casas decimais.
```
````

## Atividade 03

Crie uma função que que recebe um conjunto de dados (inteiros), faz a ordenação dos dados de forma crescente e decrescente retorna o conjunto dos dados ordenados. A função deverá ser criada seguindo a estrutura abaixo:

```java
public static void main(String[] args) {
    int[] numbers = { 5, 4, 1, 2, 3 };
    int[] ascendingOrder = sortAscendingOrder(numbers);
    int[] descendingOrder = sortDescendingOrder(numbers);
    int[] oddNumbers = filterOddNumbers(numbers);
    int[] evenNumbers = filterEvenNumbers(numbers);

    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(ascendingOrder));
    System.out.println(Arrays.toString(descendingOrder));
    System.out.println(Arrays.toString(oddNumbers));
    System.out.println(Arrays.toString(evenNumbers));
}
```
