package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 1; // QUANDO ESTA PASSANDO A VARIAVEL DO TIPO PRIMITIVO A VARIAVEL ORIGINAL NUNCA SERA ALTERADA
        int numero2 = 2;
        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro da CalculadoraTest04 definido novos valores");
        System.out.println("numero1 " + numero1); // AO PASSAR UM INT NUMERO1 PODE NAO TEM IMPACTO COM A MESMA DECLARACAO
        System.out.println("numero2 " + numero2); // NA CLASSE CALCULADORA
    }
}

