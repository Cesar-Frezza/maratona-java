package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) { // OBSERVE QUE SE FOR DIFERENTE != DE NULL RETORNA O RESULTADO DO METODO
            System.out.println("Dentro do igual == de NULL e return o resultado do metodo devido a nao ter valores alocados");
            return;
        }
        /* ABAIXO FUNCIONA MAS NAO É ESCALAVEL
        System.out.println("Salario mes 01 = " + this.salario[0]);
        System.out.println("Salario mes 02 = " + this.salario[1]);
        System.out.println("Salario mes 03 = " + this.salario[2]);
        */
        for (double salario : salarios) {
            System.out.println(salario + " ");

        }
    }

    public void imprimeMediaSalario() { // NOME DO METODO

        if (salarios == null) {
            System.out.println("Dentro do igual == de NULL e return o resultado do metodo devido a nao ter valores alocados");
            return;
        }

        // CRIACAO DA VARIAVEL MEDIA TIPO DOUBLE

        for (double salario : salarios) { // FOR
            media += salario;
        }

        media /= salarios.length; // POR CHAMAR   ".length"  OBSERVA O TAMANHO DO ARRAY QUE É DE 3 DENTRO DO FUNCIONARIO TEST01
        System.out.println("Media Salarial = " + media);
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public double[] getSalarios() {
        return this.salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }


    public double getMedia() {
        return this.media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
