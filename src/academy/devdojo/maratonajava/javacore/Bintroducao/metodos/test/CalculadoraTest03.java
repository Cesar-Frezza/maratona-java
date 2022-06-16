package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = (int) calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);                                 // IMPRIME COM A VARIAVEL RESULT
        System.out.println((int) calculadora.divideDoisNumeros(20, 2));   // IMPRIME DIRETO NO CONSOLE PRINTLN
        // FUNCIONA O CAST DE INT AQUI TAMBEM NO PRINT

        calculadora.imprimeDivisaoDeDoisNumeros(50, 2); // RESULTA EM DIVISAO PELA EXPRESSAO SER FALSA
        calculadora.imprimeDivisaoDeDoisNumeros(50, 0); // RESULTA NO PRINT PELA EXPRESSAO VERDADEIRA
        calculadora.imprimeDivisaoDeDoisNumerosReturn(50, 2); // RESULTA NO PRINT PELA EXPRESSAO VERDADEIRA
        calculadora.imprimeDivisaoDeDoisNumerosReturn(50, 0); // RESULTA NO PRINT PELA EXPRESSAO VERDADEIRA
    }
}
