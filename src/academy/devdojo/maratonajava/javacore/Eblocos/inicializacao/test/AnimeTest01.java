package academy.devdojo.maratonajava.javacore.Eblocos.inicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocos.inicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime();
//        Anime anime2 = new Anime("One Piece");
//        Anime anime3 = new Anime("One Piece");
//        Anime anime4 = new Anime("One Piece");
//        Anime anime5 = new Anime("One Piece");
//        Anime anime6 = new Anime("One Piece");
//        Anime anime7 = new Anime("One Piece");
        for (int ep2 : anime1.getEpisodios()) { //UTILIZADO ATALHO COM ALT+ENTER OPCAO INTERATE
            System.out.print(ep2 + " ");        // EXECUTADO EM SEGUNDO
        }


    }
}
