package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

// INCLUINDO O MODIFICADOR DE ACESSO PARA STATIC SEMPRE ANTES DO TIPO NO CASO DOUBLE, COM O VALOR DE 250
// O STATIC IRA INCLUIR OS VALORES PARA A CLASSE CARRO E NAO PARA OS OBJETOS SENDO ASSIM A INCLUSAO CORRETA SENDO CLASSE
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){ // ATRIBUTO QUE PERTENCE A CLASSE
        Carro.velocidadeLimite = velocidadeLimite;

    }
    public  static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
