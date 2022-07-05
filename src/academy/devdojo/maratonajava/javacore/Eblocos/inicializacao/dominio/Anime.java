package academy.devdojo.maratonajava.javacore.Eblocos.inicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - ALOCADO ESPACO EM MEMORIA
    // 2 - CADA ATRIBUTO DA CLASSE É CRIADO E INICIALIZADO COM VALORES DEFAULT OU O QUE FOR COLOCADO
    // 3 - BLOCO DE INICIALIOZACAO É EXECUTADO
    // 4 - O CONTRUTOR É EXECUTADO

    {
        System.out.println("Dentro do bloco de inicializacao"); // BLOCO DE INICIALIZACAO SEMPRE ENTRE "CHAVES" { }
        episodios = new int[50];                               // VARIAVEL EPISODIOS RECEBE ARRAY DE 100
        for (int i = 0; i < episodios.length; i++) {            // VARIAVEL I RECEBE 0 ENQUANTO FOR MENOR QUE ARRAY INCREMENTA ++ 1
            episodios[i] = i + 1;                               // PRECISO DE COMPREENSAO
        }                                                       // ONDE ELE FUNCIONARA ANTES DO CONSTRUTOR
    }                                                           // O MESMO PODE SER INCLUIDO EM QUALQUER LUGAR DO CODIGO


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int ep1 : this.episodios) {                         // FOR VARIAVEL EP : this.episodios PUXA TODOS OS VALORES DA ARRAY EPISODIOS
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
