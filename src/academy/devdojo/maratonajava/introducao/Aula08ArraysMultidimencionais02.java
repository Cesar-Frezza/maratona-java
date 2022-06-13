package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {

        int[] array = {10, 20}; // INCLUINDO O VALOR DE 2 ARRAYS DENTRO DA VARIAVEL
        int[][] arrayInt = new int[3][]; // FAZENDO UM ARRAY MULTIDIMENSIONAL DE 3 CAMPOS

        arrayInt[0] = array; // JA INCLUIDO O VALOR DO ARRAY ANTERIORMENTE NA LINHA 6
        arrayInt[1] = new int[]{30, 40, 50}; // INCLUINDO VALOR NA MEMORIA DO ARRAY AQUI
        arrayInt[2] = new int[]{60, 70, 80, 90, 100, 110}; // INCLUINDO VALOR NA MEMORIA DO ARRAY AQUI

        int[][] arrayInt2 =  // JA DECLARANDO NA LINHA O VALOR E A QUANTIDADE DE CAMPOS PARA O ARRAY
                {{1000},        // ARRAY COM [0][1] ESPACO NA MEMORIA 0 COM 1 SLOT PREENCHIDO COM O NUMERO 1000
                {201, 202},      // ARRAY COM [1][2] ESPACO NA MEMORIA 1 COM 2 SLOTS PREENCHIDOS COM O NUMERO 201,202
                {301, 302, 303},   // ARRAY COM [2][3] ESPACO NA MEMORIA 2 COM 3 SLOTS PREENNCHIDOS COM OS NUMEROS 301,302,303
                {4, 4, 4, 4},
                {5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6, 6},
                {7, 7, 7, 7, 7, 7, 7},
                {8, 8, 8, 8, 8, 8, 8, 8},
                {9, 9, 9, 9, 9, 9, 9, 9, 9},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11},
                {12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n---------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
