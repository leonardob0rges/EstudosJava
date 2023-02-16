public class TiposPrimitivos {
    public static void main(String[] args) {
        System.out.println("Ola novo teste");
        // tipo int
        int idade;
        idade = 37;

        float idadeFloat = (float) idade; // casting
        System.out.println("Idade é: " + idadeFloat);

        System.out.println(idade);
        System.out.print(idade); //  não pula linha, sem o \n

        idade = 30 + 10;
        System.out.println(idade);

        idade = (7 * 5) + 2; // o java tem "precedência", isto é, segue a ordem das operações matemáticas
        System.out.println(idade);

        // tipo double
        // usado para valores com componente fracionário (ponto flutuante)
        double salario = 1250.70;
        System.out.println("Salário é " + salario);

        double idadeDouble = 37;
        System.out.println(idadeDouble);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        int outraDivisao = 5 / 2; // "força" um inteiro como resultado da divisão
        System.out.println(outraDivisao);

        double novaTentativa = 5.0 / 2; // double divido por int
        System.out.println(novaTentativa); // dessa forma, a divisão é feita levando em consideração o ponto flutuante


        // Conversão e outros tipos

        double salario1 = 1270.50;
        // int valor = salario1; // error: incompatible types: possible lossy conversion from double to int
        int valor = (int) salario1;
        System.out.println(valor);

        long numeroGrande = 20000000000L;
        short valorPequeno = 32767;
        byte b = 127;

        float pontoFlutuante = 3.14f;

        double valor1 = 0.2;
        double valor2 = 0.1;
        System.out.println(valor1 + valor2); // 0.30000000000000004

    }
}

/*
* Tipos primitivos

no java, um statement, uma instrução, não funciona
fora dos métodos;

--- Tipo inteiro: int
é 32bits
o tipo int guarda números até aproximadamente 2bilhões

Crie uma variável com nome idade, do tipo int e atribua um valor:
- Podemos fazer de duas formas, criando a variável e depois inicializando-a:
int idade;
idade = 37;

- ou, criando a variável e inicializando-a na mesma linha
int idade = 37;

Perceba que podemos usar operadores aritméticos:

+ para Soma
- para Subtração
* para Multiplicação
/ para Divisão

Podemos concatenar valores no System.out.println usando o sinal +, dessa forma faça:
System.out.println("a idade é "+ idade + ", parabéns!");

---- Tipo flutuante: double
é 64bits
O tipo double é usado para números decimais (ponto flutuante)

double novaTentativa = 5.0 / 2; // double divido por int
// o "maior" tipo é levado em consideração, então o resultado
será double
// 2.5


Operações entre números:
Aprendemos que é possível fazer operações entre números, podemos até fazer operações aritméticas
com variáveis de tipos diferentes como multiplicar um inteiro por um número de ponto flutuante (int e double).

int dia = 4;
int outroDia = 4 + dia;
System.out.println(outroDia);
// Deve imprimir 8

double peso = 4.0;
int quantidade = 10;
System.out.println(peso * quantidade);
// Deve imprimir 40.0

double preco = 5.5;
int ingressos = 4;
System.out.println(preco * ingressos);
// Deve imprimir 22.0

---- Tipo long:
long numeroGrande = 2000000000l;

é 64bits
guarda números grandes, diferente do int, tem a capacidade
de armazenar maior que 2bilhões
é necessário colocar "L" no final, para indicar que é long

---- Tipo short:
é 16bits - 1 (15bit)
guarda valores pequenos, menores que o int, até 32767

short valorPequeno = 2131;


---- Tipo byte:
é 8 bits
guarda valores menores que o short, até 127
byte b = 127;

---- Tipo flutuante: float
float pontoFlutuante = 3.14f;

é 16bits
por padrão, números decimais são double, então precisamos
indicar com um "F" no final o número é um float

Imprimindo texto e números:
Indique as alternativas abaixo que mostrem o resultado "A idade de Marcos é 30!".

int idade = 20;
System.out.println("A idade de Marcos é 30!");
Opção correta! Neste caso não estamos usando a variável idade que recebe 20.

double idade = 30.0;
System.out.println("A idade de Marcos é " + (int) idade + "!");
Opção correta! Estamos fazendo o type cast no double que tem seu valor convertido para int. Desta forma não aparece a casa decimal.

int idade = 30;
System.out.println("A idade de Marcos é " + idade + "!");
Opção correta!

*/