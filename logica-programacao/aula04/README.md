# Lógica de Programação - Aula 04

## Atividade 01

Maria está olhando o mercado de automóveis para comprar um carro novo. Ela identificou que o preço final do veiculo tem um percentual relacionado ao distribuidor e também um percentual de impostos. Ela deseja identificar qual veículo possui os menores percentuais de imposto e do distribuidor, para fazer a escolha de seu carro novo.

Para ajudar Maria com a sua busca, crie uma função que receba um array com o preço de final, o valor do distribuidor e o valor dos impostos. Ao final, a função deve retornar um array com o percentual do distribuidor e o percentual dos impostos, seguindo essa ordem. Realize o arredondamento para duas casas decimais em relação aos dados de retorno.

```
Ex:
Entrada: [100000.00, 12000.00, 20000.00]
Saída: [12.00, 20.00]

Ex:
Entrada: [115500.00,25000.00, 32500.00]
Saída: [21.65, 28.14]
```

#

A função deverá ser criada seguindo a estrutura abaixo:

```
public class Solution
{
    public static double[] custosCarro(double[] input)
    {
        // Seu código aqui
    }
}
```

## Atividade 02

João é um empresário do ramo de construção civil e decidiu adotar novos critérios para dar reajuste salarial para seus funcionários. Agora, o reajuste vai ser dado seguindo as regras abaixo.

Tempo de serviço:

- menos de 1 ano => somente inflação
- de 1 até 5 anos (menos que 5 anos) => 1% + inflação
- de 5 até 10 anos (menos que 10 anos) => 1.5% + inflação
- 10 ou mais anos => 2% + inflação

O valor total percentual para o reajuste vai ser a soma do percentual de tempo de serviço mais o percentual da inflação.

Para ajudar João a calcular o valor do reajuste salarial de seus funcionários, crie uma função que recebe um array como entrada; onde, a posição 0 do array é o tempo de serviço, a posição 1 é o valor da inflação e a posição 2 é o salário do funcionário. Sua função deve calcular o novo salário e retorna-lo. Considere arredondamento de duas casas decimais para o salário retornado.

#

```
Ex:
Entrada: [1, 5.0, 2000.00]
Saída: 2120.00

Ex:
Entrada: [11,4.5,2500.00]
Saída: 2662.50
```

#

A função deverá ser criada seguindo a estrutura abaixo:

```
public class Solution
{
    public static double calculoSalario(double[] input)
    {
        // Seu código aqui
    }
}
```

## Atividade 03

Uma professora está precisando de ajuda para calcular a nota de seus alunos. Os seus critérios de avaliação usam um sistema de notas ponderadas. Cada aluno possui 3 notas e também uma média de exercícios. Baseados nessas notas é calculado a média de aproveitamento seguindo a formula abaixo:

media*aproveitamento = (N1 + N2 * 2 + N3 \_ 3 + media_exercicios) / 7

Após a obtenção de média de aproveitamento do aluno é determinado o conceito dele, seguindo os seguintes critérios:

#

- média >= 9,0 => conceito A
- média >= 7,5 e < 9,0 => conceito B
- média >= 6,0 e < 7,5 => conceito C
- média < 6,0 => conceito D

#

Para ajudar a professora com a sua turma, crie uma função que receba um array com as notas dos alunos (as três primeiras notas correspondem a N1, N2 e N3 e a última posição, a médias dos exercícios) e calcule a média de aproveitamento e retorne o conceito que o aluno obteve.

#

```
Ex:
Entrada: [8.0, 7.0, 8.0, 8.0]
Saída: B

Ex:
Entrada: [5.0, 4.3, 8.0, 7.0]
Saída: C
```

#

A função deverá ser criada seguindo a estrutura abaixo:

```
public class Solution
{
    public static String mediaAproveitamento(double[] input)
    {
        //Seu código aqui
    }
}
```

## Atividade 04

Um certo dia, Joãozinho chegou em casa e perguntou para sua mãe quantos dias ele tinha de vida. Para ajudar a mãe de Joãozinho, crie uma função que recebe a idade expressa em anos, meses e dias (os dados de entradas estarão contidos em um array) e retorne a idade da pessoa expressa em dias. Considerar o ano como tendo um total de 365 dias, e o mês como tendo um total de 30 dias.

```
Ex:
Entrada: [5, 4, 14]
Saída: 1959

Ex:
Entrada: [10, 8, 16]
Saída: 3906
```

#

A função deverá ser criada seguindo a estrutura abaixo:

```
public class Solution
{
    public static int idadeEmDias(int[] input)
    {
        // Seu código aqui
    }
}
```

## Atividade 05

Crie uma função que recebe uma string e retorna o índice do primeiro caractere não repetido da string. Caso não exista caractere único na palavra em questão, retornar -1.

```
Ex:
Entrada: amor
Saída: 0

Ex:
Entrada: cocada
Saída: 1
```

A função deverá ser criada seguindo a estrutura abaixo:

```
public class Solution
{
    public static int primeiroCaractereUnico(String input)
    {
        /// Seu código aqui
    }
}
```

## Atividade 06

Crie uma função que recebe um array de valores decimais e identifique se dentre o conjunto dos dados existem valores repetidos. Caso os valores sejam todos distintos retorne `false`, senão `true`.

```
Ex:
Entrada: [2.5, 3.2, 4.5, 5, 6]
Saída: false

Ex:
Entrada: [2,2,3.1,4,4.1,4.1]
Saída: true
```

A função deverá ser criada seguindo a estrutura abaixo:

```
public class Solution
{
    public static boolean elementosRepetidos(double[] input)
    {
        /// Seu código aqui
    }
}
```
