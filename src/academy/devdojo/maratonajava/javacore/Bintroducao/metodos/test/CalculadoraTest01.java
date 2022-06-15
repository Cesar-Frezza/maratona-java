package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Calculadora;

public class CalculadoraTest01 {                    // ATE AQUI SEGUE IGUAL AOS CLASSES
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(); // MESMO PRINCIPIO DE CLASSES OU OBJETOS
        calculadora.somaDoisNumeros(); // SEGUE O MESMO PRINCIPIO COM A DIFERENCA QUE O METODO JA FOI DEFINIDO EM OUTRA
                                       // CLASSE SENDO O SOMADOISNUMEROS SOMANDO 10+10 = 20
        System.out.println("Finalizando soma dois numeros");
        // AQUI FOI RESOLVIDO O METODO "SOMODOISNUMEROS" SITUADO NA CALCULADORA E DEPOIS RETORNOU A ESSE PARA PRINTAR
        calculadora.subtraiaDoisNumeros();
        System.out.println("Finalizando subtraia dois numeros");
    }
}
