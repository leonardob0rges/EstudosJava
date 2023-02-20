public class TestaCaracteres {
    public static void main(String[] args){
        char letra = 'a';
        System.out.println(letra);

        char valor = 66;
        System.out.println(valor); // B

        valor = (char) (valor + 1); // valor += 1
        System.out.println(valor); // C

        String palavra = "Isso é uma var string";
        System.out.println(palavra);

        palavra += 2020; // converte int em String e concatena ao final de palavra
        System.out.println(palavra);

        char letra1 = 'a';

        char valor1 = 65;
        System.out.println(valor1); // A

        valor1 = (char) (valor1 + 1);
        System.out.println(valor1); // B
    }
}


/*
---- Tipo caractere: char
é 16 bits
guarda um único caractere
é equivalente ao short, exceto que não guarda números negativos

char caractere = 'a';
obrigatório aspas simples

o tipo char guarda apenas um caractere da tabela unicode, por isso, quando passamos um valor numérico,
teremos como saída o caractere correspondente ao número na tabela unicode.

---- Tipo texto: String
é um tipo de dado não primitivo,
tipo referência

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