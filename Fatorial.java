public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Fatoriais de 1 a 10");

        int fatorial = 1;
        for(int n = 1; n < 11; n++){
            fatorial *= n;
            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

    }
}

/*
Nesse exercício opcional, o seu desafio é imprimir os fatoriais de 1 a 10!
Regras dos fatoriais:

    O fatorial de 0 é 1.
    O fatorial de 1 é (0!) * 1 = 1.
    O fatorial de 2 é (1!) * 2 = 2
    O fatorial de 3 é (2!) * 3 = 6
    O fatorial de 4 é (3!) * 4 = 24
    O fatorial de um número n é n * n-1 * n-2 ... até n = 1.

Ou seja:

    O fatorial de 4! = 1 x 2 x 3 x 4 = 24
    O fatorial de 6! = 1 x 2 x 3 x 4 x 5 x 6 = 720

Agora crie uma nova classe, escreva um for que inicie uma variável n (número atual) como 1 e fatorial (resultado total)
como 1. Faça seu laço entre 1 a 10 e calcule o resultado!

O fatorial é sempre o produto de números consecutivos inteiros de 1 até o próprio número.
Ex: Fatorial de 4 = 4 x 3 x 2 x 1 = 24 ou fatorial de 4 = 4 x 3! = 24. Com essa última lógica
é que essa questão é feita. Pegando sempre o número que a gente quer e multiplicando pelo fatorial do número anterior.
*/