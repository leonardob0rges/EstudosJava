public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        
        System.out.println("saldo da primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta); // Conta@251a69d7
        System.out.println("saldo da segunda conta: " + segundaConta.saldo); // 300.0

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo); // 400.0

        System.out.println("saldo da primeira conta: " + primeiraConta.saldo); // 400.0
        
        if(primeiraConta == segundaConta){
            System.out.println("são a mesma conta");
        }

        System.out.println(primeiraConta); // Conta@251a69d7
        System.out.println(segundaConta); // CConta@251a69d7

        System.out.println(primeiraConta.titular); // null



    }
}
