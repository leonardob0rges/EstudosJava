public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        // associa o cliente paulo a conta contaDoPaulo (composição do objeto)
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular); // Cliente@7344699f -> referência ao objeto tipo Cliente; faz uma composição dos objetos
        System.out.println(paulo); // contaDoPaulo.titular e paulo são 2 referências ao mesmo objeto
        
        System.out.println(contaDoPaulo.titular.nome); // Paulo Silveira
        System.out.println(contaDoPaulo.titular.cpf);


         
    }
}
