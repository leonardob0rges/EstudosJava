public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        // Testa Idade
        int idade = 16;
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

        // Testa IR
        double salario = 3300.0;

        if(salario < 2600.0){
            System.out.println("A sua alíquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
        }

        if(salario < 3750.0){
            System.out.println("A sua alíquota é de 22,5%");
            System.out.println("Você pode deduzir até R$ 636");
        }

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