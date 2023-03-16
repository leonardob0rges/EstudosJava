public class MultiplosDeTres {
    public static void main(String[] args){
        System.out.println("Múltiplos de 3:\n");

        for(int multiplos = 0; multiplos < 101; multiplos += 3){
            System.out.print(multiplos);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("Ou:");

        for(int multiplos3 = 0; multiplos3 <= 100; multiplos3++){
            if(multiplos3 % 3 == 0){
                System.out.print(multiplos3);
                System.out.print(" ");
            }
            else {
                continue;
            }
        }

        System.out.println();
        System.out.println("Ou:");

        for(int multiplos3 = 0; multiplos3 <= 100; multiplos3++){
            if(multiplos3 % 3 != 0){
                continue;
            }
            else {
                System.out.print(multiplos3);
                System.out.print(" ");
            }
        }


    }
}







/*
Segue mais um exercício para praticar o laço for!

Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.

Dica: Existem duas maneiras tradicionais de resolver este problema. Uma delas consiste em fazer o for,
e utilizar numero % 3 para descobrir o resto da divisão de um número por 3 (o operador % se chama de módulo).
Se o resto for zero, ele é divisível por 3. Como em:

if(numero % 3 == 0) {
  // faça algo
}

Outra abordagem é fazer um laço um pouco diferente, que pula já direto pelos múltiplos de três.
Existem outras abordagens, escolha a sua e faça a implementação em uma nova classe!
*/