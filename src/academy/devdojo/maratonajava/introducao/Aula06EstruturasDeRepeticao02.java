package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 a 100
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Imprime numeros pares " + i);
            }
        }
        System.out.println("*********************");
        for (int x = 0; x <= 100; x++) { // Atalho para o FOR é FORI ja preenche os dados
            if (x % 2 != 0) {
                System.out.println("Imprime numeros impares " + x);
            }
        }
    }
}
