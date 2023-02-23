public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando escopo");

        int idade = 20;
        int quantidadePessoas = 3;

        //boolean acompanhado = quantidadePessoas >= 2;
        /*
        if(quantidadePessoas >= 2){
            // escopo da variável:
            boolean acompanhado = true; // existe até o fechamento da chave (do bloco if)
        } else{
            boolean acompanhado = false;
        }
        */
        boolean acompanhado;
        //System.out.println(acompanhado); //error: variable acompanhado might not have been initialized
        // é preciso inicializar a variável antes de usá-la
        if(quantidadePessoas >= 2){
            acompanhado = true;
        } else{
            acompanhado = false; // mesmo se não entrar no else,
            // ele é necessário para inicializar a variável
        }

        System.out.println("valor de acompanhado = " + acompanhado);

        if(idade >= 18 && acompanhado){
            System.out.println("seja bem vindo");
        } else{
            System.out.println("infelizmente você não pode entrar");
        }

        boolean foiPromovido = true;
        double salario;

        if(foiPromovido) {
            salario = 4200.0;
        } else {
            salario = 3800.0;
        }

        System.out.println(salario);


    }
}

/*
Escopo:

Declaração da variável
Dessa vez, João fez uma implementação para calcular o salário de um funcionário em caso de promoção.
Ele fez a seguinte implementação:

public class TesteSalario {

    public static void main(String[] args) {

        boolean foiPromovido = true;

        if(foiPromovido) {
            double salario = 4200.0;
        } else {
            double salario = 3800.0;
        }

        System.out.println(salario);
    }
}

Qual será o resultado da compilação/execução?

O código nem compila, pois fora do bloco if/else a variável salario não existe mais.

Correto, a variável salario só é visível dentro do bloco if/else.

 */