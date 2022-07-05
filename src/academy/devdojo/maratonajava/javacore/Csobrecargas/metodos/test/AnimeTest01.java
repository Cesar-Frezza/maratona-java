package academy.devdojo.maratonajava.javacore.Csobrecargas.metodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargas.metodos.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();



        anime.init("Neon Evangelion","TV",12, "Ficcao"); // OUTRO MODO DE PASSAR VALORES EM MESMA LINHA
//        anime.setNome("Neon Evangelion"); // EX PASSANDO OS VALORES
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();
    }
}
