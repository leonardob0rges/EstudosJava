public class TestaLacos {
    public static void main(String[] args) {
        for(int tabuada = 1; tabuada <= 10; tabuada++){
            for(int unidades = 1; unidades <= 10; unidades++){
                System.out.println(tabuada + " x " + unidades + " = " + tabuada * unidades);
            }
        }
        System.out.println("=============");

        for(int multiplicador = 1; multiplicador <= 10; multiplicador++){
            for(int contador = 0; contador <= 10; contador++){
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}