package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {

        //ARRAY MULTIDIMENCIONAIS SAO ARRAYS DENTRO DE ARRAY
        // POR EXEMPLO: UM PARA OS MESES 1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12.
        // E UM PARA OS DIAS:            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31.

        int[][] dias = new int[3][3]; // PUXA O VALOR DO SEGUNDO ARRAY
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[0][2] = 3;

        dias[1][0] = 10;
        dias[1][1] = 20;
        dias[1][2] = 30;

        dias[2][0] = 100;
        dias[2][1] = 200;
        dias[2][2] = 300;

        for (int i = 0; i < dias.length; i++) { // TRAS O VALOR DO PRIMEIRO ARRAY MAS ZERADO
            for (int j = 0; j < dias[i].length; j++) { // NECESSITA DO SEGUNDO FOR PARA TRAZER O VALOR DO SEGUNDO ARRAY
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------------------------------------");


        for (int[] arrayBase : dias) { // AGORA O FOREACH ESTA OBSERVANDO UM ARRAY DE INTs ENTAO MUDA A EXPRESSAO
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
