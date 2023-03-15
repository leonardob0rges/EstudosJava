public class TestaLacos2 {
    public static void main(String[] args) {
        for(int linha = 0; linha < 10; linha++){
            for(int coluna = 0; coluna < 10; coluna++){
                // impede de imprimir colunas com valor maior que linhas, ex: coluna 1 na linha 0 não imprime
                if (coluna > linha) {
                    break; // "quebra" a execução (iteração) atual, e executa o próximo for, a linha
                }
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Ou:
        for(int linha = 0; linha < 10; linha++){
            for(int coluna = 0; coluna <= linha; coluna++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}