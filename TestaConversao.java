public class TestaConversao{
    public static void main(String[] args) {
        float pontoFlutuante = 3.14f;

        double salario = 1270.50;
        int valor = (int) salario; // casting
        System.out.println(valor); // 1270

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2; // float seria melhor nesse caso

        System.out.println(total);

    }
}


/* Casting:
Quando fazemos o casting, estamos pedindo ao Java que ache uma forma de
transformar o valor no lado direito do (int), no nosso caso, a variável salario,
em inteiro. Dessa forma o java transformará double para int.


- Type casting:
Quando tentamos colocar um valor inteiro em uma variável do tipo double o Java não mostra erro. Quando tentamos, porém, colocar um double numa variável do tipo inteiro temos um erro de compilação.
Esta propriedade se dá porque o Java faz conversão implícita de um tipo menor para os tipos "maiores". De inteiro para double, por exemplo.
O contrário não é verdade porque existe perda de dados quando é feita a conversão. Acarretando em um "type mismatch" mostrando que esta instrução é de tipos incompatíveis.

Para fazer uma conversão onde pode haver perda de informações é necessário fazer um type casting:
int idade = (int) 30.0;

No caso acima, está explícito que será feito o cast de double para inteiro.
Para comparar cada tipo primitivo de forma mais clara, a tabela abaixo mostra qual o tamanho de cada um.
TIPO	  TAMANHO
boolean	  1 bit
byte	  1 byte
short	  2 bytes
char 	  2 bytes
int	      4 bytes
float	  4 bytes
long	  8 bytes
double	  8 bytes

*/