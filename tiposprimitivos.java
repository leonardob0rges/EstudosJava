class tiposprimitivos{
	public static void main(String[] args){
		int idade; // variável do tipo inteiro atribuida a nome idade
		idade = 18;
		System.out.println(idade);

		double salario = 1400.99; // tipo double
		System.out.println(salario);

		float dinheiro = 999.98f;
		System.out.println(dinheiro);

		long quantidade = 10000L;
		System.out.println(quantidade);

		int quantidadeDoProduto = 100;
		double valorDoProduto = 3.65;
		System.out.println("Quantidade: " + quantidadeDoProduto);
		System.out.println("Valor: " + valorDoProduto);

		double resultado = quantidadeDoProduto * valorDoProduto; 
		/* o java sempre guarda o resultado de uma 
		operação no maior tipo, nesse caso, o tipo 
		double */

		System.out.println("Resultado: " + resultado);

		boolean permitido = true; // ou false
		System.out.println("É permitido? " + permitido);

		char letra = 'a';
		System.out.println("Letra: " + letra);

		int tipoInteiro = 10;
		float tipoFloat = 15.6f;

		tipoInteiro = (int)tipoFloat; //casting

		System.out.println("Valor float: " + tipoFloat);
		System.out.println("Valor inteiro: " + tipoInteiro);
		

		double valorDouble = 14.78;
		float valorFloat = 15.3f;

		valorFloat = (float)valorDouble; //casting

		System.out.println("Float: " + valorFloat);
		System.out.println(valorDouble);
	}

}

// VARIAVEIS E TIPOS PRIMITIVOS EM JAVA
/* para criar variáveis é preciso informar o TIPO DE DADO 
e atribuir um NOME à ela

*/

/* 

- tipo int (inteiro)
dados numéricos inteiros
int idade = 18;

- tipo double (ponto flutuante, decimais)
dados numéricos decimais,
double salario = 1400.99;

- tipo float (ponto flututante)
mas diferente do double, este tem capacidade de 
armazenamento menor que o double:

float dinheiro = 999.98;

obs: por padrão, o java identifica valores numéricos 
decimais como double, e ao tentar atribuir uma variável
decimal como float, ao fazer isso poderá perder
precisão na conversão. o javac acusará erro na compilação:

error: incompatible types: possible lossy conversion from
double to float
float dinheiro = 999.98;

dizendo que há uma possível perda (de precisão do ponto
flutuante) na conversão de double para float
por isso é preciso indicar que a variável deve se 
comportar como float, e não como double, dessa forma, 
inserindo 'f' ao final do valor:

float dinheiro = 999.98f;

- tipo long:
números inteiros, assim como o int, mas de maior
capacidade de armazenamento

long quantidade = 100;

- tipo boolean:
tem dois valores, true ou false

boolean permitido = true;

- tipo char
armazena apenas um caractere, e deve ser colocado entre
aspas simples:

char letra = 'a';

operação casting

int tipoInteiro = 10;
float tipoFloat = 15.6f;

tipoInteiro = tipoFloat; - essa atribuição não é possível
pois o tipo inteiro não tem capacidade de armazenar 
números com casas decimais

O Java não permite que a variável tipoInteiro seja 
atribuída à tipoFloat, alertando sobre a perda de precisão
que pode ocorrer na conversão do float para int, ex:
a (10) = b (15.6f); // a = 15

Por isso, é necessário a operação de casting, para tornar 
possível atribuir o valor do tipo inteiro ao valor do tipo
float:

tipoInteiro = (int)tipoFloat;

Obs: Ao realizar o casting haverá um risco de perder 
precisão das casas decimais/valores durante a operação.

System.out.prinln(tipoFloat); // 15.6
System.out.prinln(tipoInteiro); // 15

Na atribuição de float para double também é necessário a
operação de casting, pois o java alertará que o valor 
armazenado na variável do tipo double pode ser maior do 
que a quantidade de casas decimais que o tipo float pode 
armazenar:

double valorDouble = 14.78;
float valorFloat = 15.3f;

valorFloat = (float) valorDouble; //casting

System.out.println("Float: " + valorFloat); // 14.78

Nesse caso não há perda de precisão de casas decimais.

padrão de nome de variável
em java usamos camelCase:
int diaDoMeuAniversario = 23;

obs: sobre int x long, float x double:
- muitas vezes faz diferença, por ter menos consumo de 
memória, quanto maior o tipo de dado, maior consumo de 
memória;

casting: Casting ou conversão de tipos é uma operação 
feita com o objetivo de alterar o tipo de um determinado 
valor. Dessa forma, a parte fracionária será 
desconsiderada e teremos apenas a parte inteira. Essa 
operação pode ser utilizada em diversas situações. 
Imagine, por exemplo, uma divisão entre dois números 
inteiros.

Na linguagem Java, é possível se atribuir o valor de um 
tipo de variável a outro tipo de variável, porém para 
tal é necessário que esta operação seja apontada ao 
compilador. A este apontamento damos o nome de casting.
*/