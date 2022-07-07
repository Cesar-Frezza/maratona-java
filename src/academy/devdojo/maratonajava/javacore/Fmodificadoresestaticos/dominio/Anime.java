package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - O BLOCO DE INICIALIZACAO É EXCUTADO QUANDO A JVM CARREGAR A CLASSE
    // 1 - ALOCADO ESPACO EM MEMORIA
    // 2 - CADA ATRIBUTO DA CLASSE É CRIADO E INICIALIZADO COM VALORES DEFAULT OU O QUE FOR COLOCADO
    // 3 - BLOCO DE INICIALIOZACAO É EXECUTADO
    // 4 - O CONTRUTOR É EXECUTADO

    static {             // AO COLOCAR O STATIC ANTES DO BLOCO DE INICIALIZACAO O BLOCO EXECUTA APENAS UMA VEZ
        System.out.println("Dentro do bloco de inicializacao estatico 1"); // BLOCO DE INICIALIZACAO SEMPRE ENTRE "CHAVES" { }
        episodios = new int[50];                                // VARIAVEL EPISODIOS RECEBE ARRAY DE 100
        for (int i = 0; i < episodios.length; i++) {            // VARIAVEL I RECEBE 0 ENQUANTO FOR MENOR QUE ARRAY INCREMENTA ++ 1
            episodios[i] = i + 1;                               // PRECISO DE COMPREENSAO
        }                                                       // ONDE ELE FUNCIONARA ANTES DO CONSTRUTOR
    }                                                           // O MESMO PODE SER INCLUIDO EM QUALQUER LUGAR DO CODIGO

    // AO COLOCAR O STATIC ANTES DO BLOCO DE INICIALIZACAO O BLOCO EXECUTA APENAS UMA VEZ
    static {System.out.println("Dentro do bloco de inicializacao estatico 2");}
    // AO COLOCAR O STATIC ANTES DO BLOCO DE INICIALIZACAO O BLOCO EXECUTA APENAS UMA VEZ
    static {System.out.println("Dentro do bloco de inicializacao estatico 3");}
    // NAO COLOCAR O STATIC ANTES DO BLOCO DE INICIALIZACAO O BLOCO EXECUTA TODAS AS VEZES
           {System.out.println("Dentro do bloco de inicializacao nao estatico 4");}



    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int ep1 : Anime.episodios) {                         // FOR VARIAVEL EP : this.episodios PUXA TODOS OS VALORES DA ARRAY EPISODIOS
            System.out.print(ep1 + " ");                         // EXECUTADO PRIMEIRO
        }
        System.out.println(); // FAZ PULAR A LINHA PARA APARECER A SEGUNDA OPCAO
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }
}
