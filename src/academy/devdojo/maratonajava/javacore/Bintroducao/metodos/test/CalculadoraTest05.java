package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) { // BASICAMENTE PODE SER TROCADO O ( '[]' POR '...' )
        Calculadora calculadora = new Calculadora();
        int[] numeros  = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
