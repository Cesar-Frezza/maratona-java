package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // ARRAY SEGUE UM PADRAO DE INICIALIZACAO SENDO:
        // PARA: byte, int, short, float e double = 0
        // PARA: char = '\u0000' VAI IMPRIMIR UM ESPACO EM BRANCO = ' '
        // PARA: boolean = false
        // PARA: String = null
        int[] idadesI = new int[3];
        System.out.println("Array Int = " + idadesI[0]); // TRAZ O RESULTADO 0
        System.out.println("Array Int = " + idadesI[1]);
        System.out.println("Array Int = " + idadesI[2]);

        float[] idadesF = new float[3];
        System.out.println("Array Float = " + idadesF[0]); // TRAZ O RESULTADO 0.0
        System.out.println("Array Float = " + idadesF[1]);
        System.out.println("Array Float = " + idadesF[2]);

        boolean[] idadesB = new boolean[3];
        System.out.println("Array Boolean = " + idadesB[0]); // TRAZ O RESULTADO false
        System.out.println("Array Boolean = " + idadesB[1]);
        System.out.println("Array Boolean = " + idadesB[2]);

        String[] idadeS = new String[3];
        System.out.println("Array String = " + idadeS[0]); // TRAZ O RESULTADO Null
        System.out.println("Array String = " + idadeS[1]);
        System.out.println("Array String = " + idadeS[2]);

        char[] idadesC = new char[3];
        System.out.println("Array Char = " + idadesC[0]); // TRAZ O RESULTADO "ZERADO"
        System.out.println("Array Char = " + idadesC[1]);
        System.out.println("Array Char = " + idadesC[2]);

        String[] nomeS = new String[4];
        nomeS[0] = "Goku";
        nomeS[1] = "Kurosaki";
        nomeS[2] = "Luffy";
        nomeS[3] = "Dante";
        //O ARRAY NAO ALTERA SOZINHO SENDO NECESSARIO DEFINIR A QUANTIDADE E COMPILAR NOVAMENTE
        // ENTAO ABAIXO O " nomeS.length " O LENGTH CONFIGURA A QUANTIDADE DEFINIDA ANTERIORMENTE COMO EXEMPLO O 4 da linha 36
        for (int i = 0; i < nomeS.length; i++) {

            System.out.println(nomeS[i]);
        }
    }
}
