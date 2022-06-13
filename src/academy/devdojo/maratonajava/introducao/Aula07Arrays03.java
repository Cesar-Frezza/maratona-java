package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros1 = new int[5];                // maneira de alocar a memora sem valores apenas com o padrão sendo 0
        int[] numeros2 = {1, 2, 3, 4, 5};           // OUTRA MANEIRA DE INICIALIZAR JA DECLARANDO OS VALORES
        int[] numeros3 = new int[]{6, 7, 8, 9, 10}; // OUTRA MANEIRA DE INICIALIZAR JA DECLARANDO OS VALORES
        int[] numeros4 = new int[]{11, 12, 13, 14, 15}; // OUTRA MANEIRA DE INICIALIZAR JA DECLARANDO OS VALORES

        for (int y = 0; y < numeros1.length; y++) {
            System.out.println("FOR sem Valor declarado " + numeros1[y]);
        }

        for (int x = 0; x < numeros2.length; x++) {
            System.out.println("FOR "+numeros2[x]);
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println("FOR "+numeros3[i]);
        }
        //FOREACH SINTAXE: for ( tipodavariavel "INT"    variaveldofor "W"  : nomedavariavelcomosvalores "NUMEROS4" ){}
        // IMPORTANTE QUE O TIPO DEVE SER IDENTICO AO DECLARADO NA VARIAVEL COM OS VALORES
        for (int w : numeros4) {
            System.out.println("Utilizando o FOREACH " + w);
        }
    }
}
