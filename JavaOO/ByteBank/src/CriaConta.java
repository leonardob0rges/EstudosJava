public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); // instanciação do objeto tipo Conta
        primeiraConta.saldo = 200; // atribuindo 200 ao atributo "saldo" do objeto
        System.out.println(primeiraConta.saldo);
        
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta(); // instância de novo objeto tipo Conta
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);
        
        System.out.println(primeiraConta.agencia); // atributos não definidos = 0
        System.out.println(primeiraConta.numero); // 0

        System.out.println(segundaConta.agencia);
        
        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta está"
        + " na agência " + segundaConta.agencia);
        
        if(primeiraConta == segundaConta){
            System.out.println("são a mesma conta");
        } else{
            System.out.println("contas diferentes");
        }
        
        System.out.println(primeiraConta); // Conta@251a69d7      
        System.out.println(segundaConta); // Conta@7344699f 

        

    }
}
