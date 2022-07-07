package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome()); // RECUPERA OS VALORES COLOCADOS EM TIME DA LINHA 9 CLASSE JogadorTest02
        }
    }

    public Jogador(String nome) {
        this.nome = nome;

    }

    public Time getTime() {
        return this.time;
    }

    public void setTime(final Time time) {
        this.time = time;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
