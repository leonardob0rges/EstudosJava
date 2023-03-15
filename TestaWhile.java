public class TestaWhile {
    public static void main(String[] args) {
        // baixar plugin intellisense

        int contador = 0;
        while(contador <= 10){
            System.out.println(contador);
            // contador = contador + 1;
            // contador += 1;
            contador++;
        }

        System.out.println(contador);



    }
}

/*

Fernando decidiu praticar seu conhecimento sobre a estrutura de repetição while. Ele escreveu o seguinte programa:

package projeto;

public class Programa {

    public static void main(String[] args) {

        int contador = 1;

        while(contador <= 10) {

            System.out.println(contador);
        }
    }
}

Todavia, seu programa só imprime no console 1 infinitamente.

Consegue enxergar o problema no código de Fernando? Depois de formar uma opinião compare seu achado com a resposta do instrutor logo em seguida.

Opinião do instrutor:
O while aceita receber dois valores, true e false. O valor true mantém o loop em execução, já o false o finaliza. Esses valores podem ser resultados de uma expressão como contador <= 10. Todavia, no código de Fernando, ele não incrementou a variável contador a cada iteração do while. Devido a esse esquecimento, a variável contador sempre mantinha o valor 1 fazendo com que o programa caísse em um loop infinito.


Quais as afirmações abaixo são verdadeiras em relação ao while?
Na expressão condicional do while é possível utilizar qualquer operador de comparação (< [menor], > [maior], <= [menor ou igual], >= [maior ou igual], == [igual a] e != [diferente de]) e qualquer operador lógico (&& [and], || [ou]).

Isso aí, aluno! Todos os operadores de comparação e lógicos são válidos na expressão condicional do while! Use-os com sabedoria!
Alternativa correta

O while sempre precisará de uma expressão condicional que definirá quando o laço deve ser interrompido.

Muito bem! Lembre-se, essa expressão condicional precisará ser informada dentro dos parênteses do while e pode ainda utilizar qualquer um dos operadores de comparação e operadores lógicos aprendidos no capítulo 6.

*/