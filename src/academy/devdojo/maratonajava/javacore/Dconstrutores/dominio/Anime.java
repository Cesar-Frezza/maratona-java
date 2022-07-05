package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero) { // PUBLIC ANIME É UM CONSTRUTOR
        this();
        this.nome = nome;                           // OS ATRIBUTOS PODEM SER INCLUIDOS DIRETAMENTE NO CONSTRUTOR
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) { // CRIANDO UMA SOBRECARGA DO CONSTRUTOR ANIME
        this(nome, tipo, episodios, genero);
        this.estudio = estudio; // A SOBRECARGA SEMPRE DEVE OBTER O THIS NA PRIMEIRA LINHA DO METODO
    }

    public Anime() { // ISSO É UM BLOCO DE INICIALIZACAO QUE ACONTECE ANTES DO CONSTRUTOR
        System.out.println("Dentro do construtor sem argumentos");
    }

    //    public void init(String nome, String tipo, int episodios, String genero) {
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//        this.genero = genero;
//    }
//    public void init(String nome, String tipo, int episodios, String genero){ // ESTA SE REPETINDO DEVIDO A POSSIBILIDADE
//        this.init(nome,tipo,episodios);                                       // DE SOBRECARGA DO METODO, USANDO O MESMO
//        this.genero = genero;                                                 // E INCLUINDO O GENERO A MAIS
//    }
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
        System.out.println("----------------------------------");

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

}
