# Lógica de Programação - Aula 03

## Atividade 01

Maria tem uma frutaria e está com uma promoção para quem comprar mais de 10 frutas (do mesmo item).

Comprando qualquer fruta da promoção e levando acima de 10 frutas o preço da unidade fica em 1.25 cada, caso a pessoa leve uma quantidade inferior ou igual a 10 o preço individual da fruta fica em 1.45.

Faça uma função que recebe a quantidade de frutas que o cliente está levando e calcule o valor final a ser pago. Arredondar o valor final da compra para 2 casas decimais.

### Exemplos

```
Ex:
Entrada: 2
Saída: 2.90

Ex:
Entrada: 12
Saída: 15.00
```

### Instruções

A função deverá ser criada seguindo a estrutura abaixo:

```java
public class Solution {
    public static double custoCompra(double input) {
        // Seu código aqui
    }
}

```

## Atividade 02

Maria está olhando o mercado de automóveis para comprar um carro novo. Ela identificou que o preço final do veiculo tem um percentual relacionado ao distribuidor e também um percentual de impostos. Ela deseja identificar qual veículo possui os menores percentuais de imposto e do distribuidor, para fazer a escolha de seu carro novo.

Para ajudar Maria com a sua busca, crie uma função que receba um array com o preço de final de fábrica, o valor do custo com o distribuidor e o valor do preço dos impostos. Ao final, a função deve retornar um array com o percentual do custo do distribuidor e o percentual do custo com os impostos, seguindo essa ordem. Realize o arredondamento para duas casas decimais em relação aos dados de retorno.

### Exemplos

```
Ex:
Entrada: [100000.00, 12000.00, 20000.00]
Saída: [12.00, 20.00]

Ex:
Entrada: [115500.00,25000.00, 32500.00]
Saída: [21.64, 28.14]
```

### Instruções

A função deverá ser criada seguindo a estrutura abaixo:

```java
public class Solution {
    public static double[] custosCarro(double[] input) {
        // Seu código aqui
    }
}

```

## Atividade 03

João é um empresário do ramo de construção civil e decidiu adotar novos critérios para dar reajuste salarial para seus funcionários. Agora, o reajuste vai ser dado seguindo as regras abaixo.

Tempo de serviço:

- de 1 até 5 anos => 1%
- de 5 até 10 anos => 1.5%
- 10 ou mais anos => 2% valor da inflação (IPCA)

O valor total percentual para o reajuste vai ser a soma do percentual de tempo de serviço mais o percentual da inflação.

Para ajudar João a calcular o valor do reajuste salarial de seus funcionários, crie uma função que recebe um array como entrada; onde, a posição 0 do array é o tempo de serviço, a posição 1 é o valor da inflação e a posição 3 é o salário do funcionário. Sua função deve calcular o novo salário e retorna-lo. Considere arredondamento de duas casas decimais para o salário retornado.

### Exemplos

```
Ex:
Entrada: [1, 5.0, 2000.00]
Saída: 2120.00

Ex:
Entrada: [11,4.5,2500.00]
Saída: 2662.50
```

### Instruções

```java
public class Solution {
    public static double calculoSalario(double[] input) {
        // Seu código aqui
    }
}
```

## Atividade 04

Crie uma função que recebe uma string e retorna o índice do primeiro caractere não repetido da string. Caso não exista caractere único na palavra em questão, retornar -1.

```
Ex:
Entrada: amor
Saída: 0

Ex:
Entrada: cocada
Saída: 1
```

```java
public class Solution {
    public static int primeiroCaractereUnico(String input) {
        // Seu código aqui
    }
}

```

## Atividade 05

Crie uma função que recebe um array de valores decimais e identifique se dentre o conjunto dos dados existem valores repetidos. Caso os valores sejam todos distintos retorne false, senão true.

### Exemplos

```
Ex:
Entrada: [2.5, 3.2, 4.5, 5, 6]
Saída: false

Ex:
Entrada: [2,2,3.1,4,4.1,4.1]
Saída: true
```

### Instruções

A função deverá ser criada seguindo a estrutura abaixo:

```java
public class Solution {
    public static boolean elementosRepetidos(double[] input) {
        /// Seu código aqui
    }
}
```

## Atividade 06

Utilize a [fórmula de Heron](https://mundoeducacao.uol.com.br/matematica/formula-heron.htm) para calcular a área do Triângulo.

```java
    public double calcularArea() {
        // Seu código aqui
    }
```
