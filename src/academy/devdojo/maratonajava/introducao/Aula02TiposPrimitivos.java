package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    //PSVM + TAB = Atalho para o **** public static void main(String[] args) {} ****
    public static void main(String[] args) {
        //TIPOS PRIMITIVOS: int, double, char, byte, short, long, boolean
        int idade = 10;
        //SOUT + TAB = Atalho para **** System.out.println() ****
        //SOUT sem aspas "" consegue imprimir o valor das variaveis
        System.out.println(idade);
        // texto e variavel deve ser colocado o ("texto" + variavel)
        System.out.println("A idade é: "+idade+" anos.");
        int idadeInt = 20;               // (4 BYTES)
        long salarioLong = 10000;        // (8 BYTES)
        double salarioDouble = 2000;     // (8 BYTES)
        float salarioFloat = 2500;       // (4 BYTES)
        byte idadeByte = 127;            // (1 BYTE) Maximo até 127 devido a quantidade de byte se for negativo pode (-128)
        short idadeShort = 10;           // (2 BYTES)
        boolean verdadeiro = true;       // (1 BIT SENDO 8 BIT = 1 BYTE)
        boolean falso = false;           // (1 BIT = 8 BYTES)
        char caractere = 'M';            // (2 BYTES) Indicado para colocar uma LETRA tipo Sexo M ou F

        String nome = "Goku"; //Letra Maiuscula por ser uma classe

        System.out.println(verdadeiro);
        System.out.println("Oi meu nome e "+nome);

    }
}
