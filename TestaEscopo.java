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


    }
}