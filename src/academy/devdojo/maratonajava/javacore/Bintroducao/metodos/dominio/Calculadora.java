package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio;

public class Calculadora {
    // public // MODIFICADOR DE ACESSO
    // void // RETORNO VAZIO
    // NOME DO METODO

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiaDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { // NECESSITA DA ENTRADA PARA ESTA VARIAVEL TRABALHAR
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num01, double num02) {
        if (num02 == 0) { // FOI COLOCADO UM IF PARA IMPEDIR A DIVISAO DE RETORNAR INFINITY
            return 0;
        }
        return num01 / num02; // O INT É UM CAST FORCANDO O DOUBLE A VIRAR INT
    }
}
