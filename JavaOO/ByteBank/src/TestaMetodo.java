public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaUm = new Conta();
        contaUm.saldo = 100; 

        contaUm.deposita(50);
        System.out.println(contaUm.saldo); // 150.0

        boolean conseguiuRetirar = contaUm.saca(20);
        System.out.println(contaUm.saldo); // 130.0

        System.out.println(conseguiuRetirar); // true
        
        Conta contaDois = new Conta();
        contaDois.deposita(1000);

        boolean sucessoTransferencia = contaDois.transfere(300, contaUm); 
        
        if(sucessoTransferencia){
            System.out.println("transferência feita com sucesso");           
        } else{
            System.out.println("não tem saldo suficiente");
        }

        System.out.println(contaDois.saldo); // 700.0
        System.out.println(contaUm.saldo); // 430.0

        // System.out.println(sucessoTransferencia); // true
        
        contaUm.titular = "Paulo Silveira";
        System.out.println(contaUm.titular);

    }   
    
}
