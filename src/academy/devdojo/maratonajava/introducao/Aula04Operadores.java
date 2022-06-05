package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Operadores + - * /
        int numero01 = 1;
        int numero02 = 2;
        int numero03 = 3;
        int numero04 = 4;
        double numero05 = 5;

        System.out.println(numero02 - numero01);
        System.out.println(numero03 * numero04);
        System.out.println(numero04 + numero05);
        System.out.println(numero04 / numero05); //a Divisao de numeros inteiro tras o resultado inteiro entao deve ser double
        //% resto divisao
        int resto = 21 % 2; // Sobra 1 entao aparece o 1
        int resto2 = 20 % 2; // fecha a divisao entao aparece 0
        System.out.println(resto);
        System.out.println(resto2);
        /*
        Operadores Logicos
        < Menor que
        > Maior que
        <= Menor ou Igual que
        >= Maior ou Igual que
        == igualmente
        != Diferente
         */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
        boolean isDezMenorOuIgualQueVinte = 10 <= 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);
        System.out.println("isDezMaiorOuIgualQueVinte " + isDezMaiorOuIgualQueVinte);
        System.out.println("isDezMenorOuIgualQueVinte " + isDezMenorOuIgualQueVinte);
        // && = AND Comparacao, || = OR Comparacao, ! = Negacao

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        //Operadores de Atribuicao =. -=, +=, *=, /=, %=
        double bonus = 1800; // 1800
        System.out.println("Bonus = " + bonus);

        bonus += 1000; // 1800 + 1000 = 2800
        System.out.println("Bonus + 1000 = " + bonus);

        bonus -= 800; // 2800 - 800 = 2000
        System.out.println("Bonus - 800 = " + bonus);

        bonus *= 2; // 2000 * 2 = 4000
        System.out.println("Bonus * 2 = " + bonus);

        bonus /= 4; // 4000 / 4 = 1000
        System.out.println("Bonus / 4 = " + bonus);

        bonus %= 10; // 1000 / com resto por 10 = 0.0
        System.out.println("Bonus % Dividido com resto por 10 = " + bonus);

        bonus += 1000; // 0,0 + 1000 = 1000
        System.out.println("Bonus + 1000 = " + bonus);

        bonus %= 3; // 1000 / com resto por 3 = 1.0
        System.out.println("Bonus Dividido com resto por 3 = " + bonus + " devido a divisao dar 9 e sobrar 1");

        // ++, -- Incremento ou decremento de 1
        int contador = 0;
        contador += 1; // Contador 0 + 1 = 1
        contador++; // Contador 1 + 1 = 2
        System.out.println(contador++); //++apos a variavel faz somar depois da solicitacao da linha, devia ser 2+1=3 mas mostra2
        System.out.println(contador); // Mostrando agora sim a soma 3
        contador--; // Contador 3 - 1 = 2
        ++contador; // Contador 2 + 1 = 3
        System.out.println(++contador); // antes da variavel faz somar antes da solicitacao da linha 3+1=4 mostra 4
        System.out.println(contador); // mostra 4 novamente
        --contador; // Contador 4 - 1 = 3
        System.out.println(contador);


    }
}
