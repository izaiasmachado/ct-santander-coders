# Projeto Final - Cálculo de Salário

## Sobre

Este projeto é o exercício final do Coding Tank do programa Santander Coders, em parceria com a Ada. Consiste em um programa que calcula o salário líquido de funcionários com base nos salários brutos, considerando os descontos de Imposto de Renda e INSS. O código foi implementado em três classes: a principal [App](./src/App.java), a do funcionário [Employee](./src/Employee.java), uma classe para funções de utilidade [Utils](./src/Utils.java) e outra classe para funções de entrada [ScannerUtils](./src/ScannerUtils.java).

## Exemplo de Funcionamento

### Entrada

```
Digite o salário bruto do funcionário 1: 1000
Digite o salário bruto do funcionário 2: 2000
Digite o salário bruto do funcionário 3: 3000
Digite o salário bruto do funcionário 4: 4000
Digite o salário bruto do funcionário 5: 5000
```

### Saída

```
===== Relatório de Salário do Funcionário 1 =====
Salário Bruto: R$ 1000,00
INSS (Alíquota 7,50%): R$ 75,00
Imposto de Renda (Alíquota 0,00%): R$ 0,00
Salário Líquido: R$ 925,00

===== Relatório de Salário do Funcionário 2 =====
Salário Bruto: R$ 2000,00
INSS (Alíquota 9,00%): R$ 180,00
Imposto de Renda (Alíquota 7,50%): R$ 150,00
Salário Líquido: R$ 1670,00

===== Relatório de Salário do Funcionário 3 =====
Salário Bruto: R$ 3000,00
INSS (Alíquota 12,00%): R$ 360,00
Imposto de Renda (Alíquota 15,00%): R$ 450,00
Salário Líquido: R$ 2190,00

===== Relatório de Salário do Funcionário 4 =====
Salário Bruto: R$ 4000,00
INSS (Alíquota 14,00%): R$ 560,00
Imposto de Renda (Alíquota 22,50%): R$ 900,00
Salário Líquido: R$ 2540,00

===== Relatório de Salário do Funcionário 5 =====
Salário Bruto: R$ 5000,00
INSS (Alíquota 14,00%): R$ 700,00
Imposto de Renda (Alíquota 27,50%): R$ 1375,00
Salário Líquido: R$ 2925,00
```

## Tratamento de Erros

É comum trocar a vírgula com o ponto na separação de decimais, caso isso acontece, o programa informa ao usuário do erro e como realizar a correção. Veja o exemplo a seguir,

```
Digite o salário bruto do funcionário 1: a
Valor inválido. Digite um número válido, utilizando ponto (.) como separador decimal.
Digite o salário bruto do funcionário 1: 0,2
Valor inválido. Digite um número válido, utilizando ponto (.) como separador decimal.
```

## Enunciado do Projeto

Faça um programa que receba 5 salários brutos de funcionários, sabendo-se que são descontados Imposto de Renda e INSS, calcule e mostre o total do salário líquido no referido mês.

**Obs.:** Salário Bruto - Descontos = Salário Líquido.

A saída do programa deve fornecer as seguintes informações:

- Salário bruto.
- Quanto pagou ao INSS.
- Quanto pagou de Imposto de Renda.
- Salário líquido.

Calcule os descontos e o salário líquido com base nas tabelas abaixo:

**Tabela INSS:**

| Salário                  | % Desconto INSS |
| ------------------------ | --------------- |
| até 1.212,00             | 7,5%            |
| de 1.212,01 até 2.427,35 | 9%              |
| de 2.427,36 até 3.641,03 | 12%             |
| de 3.641,04 até 7.087,22 | 14%             |

**Tabela Imposto de Renda:**

| Salário                  | % Desconto Imposto de Renda |
| ------------------------ | --------------------------- |
| até 1.903,98             | 0%                          |
| de 1.903,99 até 2.826,65 | 7,5%                        |
| de 2.826,66 até 3.751,05 | 15%                         |
| de 3.751,06 até 4.664,68 | 22,50%                      |
| Acima de 4.664,68        | 27,50%                      |
