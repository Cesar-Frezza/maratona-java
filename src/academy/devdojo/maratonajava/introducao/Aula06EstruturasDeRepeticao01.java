package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // While, Do While, For - Precisa resultar em um Booleano ( False and True )
        int count = 0;
        do {
            System.out.println("COUNT Dentro do DO-WHILE " + count);
            ++count;
        }
        while (count < 10);
        System.out.println("COUNT Dentro do WHILE apenas " + count);
        //while (count < 10) {
        //    System.out.println(++count); //Adiciona +1 e depois imprime
        for (int i = 0; i <= 10; ++i) {
            System.out.println("FOR " + i);
        }
    }
}
