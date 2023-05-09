public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo()); // 0.0

        System.out.println(contaDaMarcela.titular); // null

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular); // Cliente@6b95977
        
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome); // Marcela
        

        
    }
}
