public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;
        primeiro = 10;

        // Quanto vale o segundo?
        System.out.println(segundo); // 5
        String saudacao = "Olá, meu nome é ";
        String nome = "Rômulo ";
        String continuacao = "e minha idade é ";
        int idade = 100;

        System.out.println(saudacao+nome+continuacao+idade);
        // Olá, meu nome é Rômulo e minha idade é 100
    }

}