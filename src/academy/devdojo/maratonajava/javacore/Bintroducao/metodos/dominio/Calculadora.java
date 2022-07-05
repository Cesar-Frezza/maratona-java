package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio;

public class Calculadora {
    // public // MODIFICADOR DE ACESSO
    // void // RETORNO VAZIO
    // NOME DO METODO

    public void somaDoisNumeros() { //METODO
        System.out.println(10 + 10);
    }

    public void subtraiaDoisNumeros() { // METODO SENDO CRIADO
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

    public void imprimeDivisaoDeDoisNumeros(double num3, double num4) {  // SÓ EXECUTARA ESSE METODO SE(ELSE) A EXPRESSAO
        if (num4 == 0) {                                                // FOR FALSA, SE VERDADEIRA RETORNA 0 E PRINTA
            System.out.println("Nao existe divisao por zero");         // SE FOR FALSA ENTRA NO ELSE E DIVIDE
        } else {                                                      // USADO PARA METODOS VOID
            System.out.println(num3 / num4);
        }
    }

    public void imprimeDivisaoDeDoisNumerosReturn(double num5, double num6) { // SÓ EXECUTARA ESSE METODO SE(ELSE) A EXPRESSAO
        if (num6 == 0) {                                               // FOR FALSA, SE VERDADEIRA RETORNA 0 E PRINTA
            System.out.println("Nao existe divisao por zero");        // SE FOR FALSA ENTRA NO ELSE E DIVIDE
            return;                                                  // USADO PARA METODOS VOID// USADO O RETURN PARA PARAR
        }
        System.out.println(num5 / num6);

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros na Calculadora definido os atributos");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros) { // sintaxe de um array
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros) { // SINTAXE DO VARARGS BASICAMENTE É UM ARRAY MAIS SIMPLIFICADO
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);

    }
}

