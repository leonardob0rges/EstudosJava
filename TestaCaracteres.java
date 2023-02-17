public class TestaCaracteres {
    public static void main(String[] args){
        char letra = 'a';
        System.out.println(letra);

        char valor = 66;
        System.out.println(valor);

        valor = (char) (valor + 1); // valor += 1
        System.out.println(valor);

        String palavra = "Isso é uma var string";
        System.out.println(palavra);

        palavra += 2020; // converte int em String e concatena ao final de palavra
        System.out.println(palavra);

    }
}


/*
---- Tipo caractere: char
é 16 bits
guarda um único caractere
é equivalente ao short, exceto que não guarda números negativos

char caractere = 'a';
obrigatório aspas simples

---- Tipo texto: String
é um tipo de dado não primitivo
e sim, tipo referência

String texto = "teste";
obrigatório aspas duplas

- Declarando String e char:

String frase = "Estou sempre disposto a aprender novas tecnologias";
char letra = 'a';

Correto. Lembre-se, uma String é declarada com aspas duplas " e pode ter zero ou mais caracteres.
Um char é declarado com aspas simples ' e pode usar apenas um caractere!

- Qual será o resultado?

String parcela1 = "10";
String parcela2 = "20";
System.out.println(parcela1 + parcela2);

O resultado esperado será 30 neste trecho de código?

Não, o resultado será 1020.
Correto. O resultado será a concatenação das duas parcelas.

*/