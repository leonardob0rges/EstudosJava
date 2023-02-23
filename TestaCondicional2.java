public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        // Testa Idade
        int idade = 18;
        int quantidadePessoas = 3;

        /* Complexidade ciclomática
        if(idade >= 18){
            System.out.println("você tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("você não tem 18, mas pode entrar, " +
                        "pois está acompanhado");
            } else {
                System.out.println("infelizmente você não pode entrar");
            }
        }*/

        if(idade >= 18 || quantidadePessoas >= 2){
            System.out.println("seja bem vindo");
        } else{
            System.out.println("infelizmente você não pode entrar");
        }

        // boolean condicionais
        boolean acompanhado = true;

        System.out.println("valor de acompanhado = " + acompanhado);

        if(idade >= 18 && acompanhado){
            System.out.println("seja bem vindo");
        } else{
            System.out.println("infelizmente você não pode entrar");
        }

        int idade1 = 18;
        int quantidadePessoas1 = 3;
        boolean acompanhado1 = quantidadePessoas1 >= 2;

        if(idade >= 18 && acompanhado1){
            System.out.println("seja bem vindo");
        } else{
            System.out.println("infelizmente você não pode entrar");
        }

        /*
        int quantidadePessoas1 = 1;
        boolean acompanhado1 = false;

        if(quantidadePessoas1 >= 2){
            acompanhado1 = true;
        } else if(quantidadePessoas1 == 1){
            acompanhado1 = false;
        }

        if(idade >= 18 && acompanhado1){
            System.out.println("seja bem vindo");
        } else{
            System.out.println("infelizmente você não pode entrar");
        }
        */




    }
}

/*
Operador OR - ||:
pelo menos uma condição precisa ser true,
para passar no if por ex.

Operador AND - &&:
todas as condições precisam ser true,
para passar no if por ex.

*/

/*
boolean expression:

int idade1 = 68;
boolean ehIdoso = idade1 >= 65;
System.out.println(ehIdoso); // true

*/

/*
operador lógico:
Abaixo há afirmações referentes às operações lógicas na linguagem Java.

- Os operadores lógicos devem ter no lado esquerdo e direito uma expressão booleana.
Correto, por exemplo:

if (idade > 18 && idade < 65) {
}
// Repare que temos duas expressões booleanas, na esquerda e na direita do operador lógico &&.

- O operador lógico AND é representado pelos caracteres && e o OR pelo ||.
Correto.

*/