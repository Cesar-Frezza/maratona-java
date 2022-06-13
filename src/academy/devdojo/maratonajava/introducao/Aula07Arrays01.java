package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        /* ARRAYS: É UMA REFERENCIA PARA INCLUIR VARIOS VALORES EM UMA UNICA VARIAVEL
        COMO POR EXEMPLO = INT [ ] IDADES
         */
        int[] idades = new int[3]; // SOMENTE TIPOS DE REFERENCIA PODEM SER INICIADOS COM O VALOR DE NULL (String nome = null;)
        idades[0] = 18;// ARRAYS SEMPRE COMECAM DE 0 SENDO ASSIM 0, 1, 2.
        idades[1] = 19;
        idades[2] = 20;
        System.out.println(idades[0]); // ARRAY IMPRIMINDO A POSICAO DE NUMERO 0 SENDO 18
        System.out.println(idades[1]); // ARRAY IMPRIMINDO A POSICAO DE NUMERO 1 SENDO 19
        System.out.println(idades[2]); // ARRAY IMPRIMINDO A POSICAO DE NUMERO 2 SENDO 20
    }
}
