package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Kafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) { // ATALHO CHAMAR A CLASSE JOGADOR E ALT+ENTER OPCAO INTERATE CRIAR VARIAVEL jogador : ArrayJogadores
            jogador.imprime(); // VARIAVEL CRIADA ACIMA EXECUTA O METODO IMPRIME
        }
    }
}
