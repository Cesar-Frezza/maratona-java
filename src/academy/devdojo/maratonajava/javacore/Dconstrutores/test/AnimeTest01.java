package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Neon Evangelion","TV",12,"Ficcao Cientifica","TV TOKYO");
//        Anime anime2 = new Anime("One Peace","Manga",900,"Aventura"," STUDIO IG");

//        anime.init("Neon Evangelion","TV",12, "Ficcao"); // OUTRO MODO DE PASSAR VALORES EM MESMA LINHA
//        anime.setNome("Neon Evangelion"); // EX PASSANDO OS VALORES
//        anime.setTipo("TV");
//        anime.setEpisodios(12);

        anime.imprime();

//        anime2.imprime(); // SENDO INICIALIZADO COM OS VALORES ZERADOS
    }
}
