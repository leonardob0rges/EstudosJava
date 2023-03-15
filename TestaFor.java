public class TestaFor {
    public static void main(String[] args) {
        for(int contador = 0; contador <= 10; contador++){
            System.out.println(contador);
        }

    }
}


/*
sintaxe for:
for(inicializador; condição de parada; incrementador){
    // bloco do loop
}

- o inicializador somente é executado uma vez, no for;
- a variável de inicialização do for, só vale no escopo do for;
- a condição de parada é uma expressão booleana, que determina se executará a próxima
iteração do laço for;
- no incrementador, é inserido o que o for irá incrementar ao inicializador.

o for oferece uma opção de declaração mais enxuta, onde precisamos informar dentro dos parênteses do for
a inicialização da variável que irá servir de auxiliar para a condição de parada, a condição de parada que
deve ser verificada como verdadeira para que o laço seja executado e, por fim, a atualização do valor da
variável auxiliar.


*/