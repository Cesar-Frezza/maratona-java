package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){ // CRIANDO METODO
        System.out.println(this.nome); // THIS SERVE PARA TRAZER EXATAMENTE ESTA VARIAVEL NESTE MOMENTO
        System.out.println(this.idade); // AQUI NAO FOI COLOCADO O THIS DEVIDO A VARIAVEL ESTAR NO MESMA CLASSE


    }
    public void setNome(String nome) { // Criado um metodo para incluir valor as variaveis
        this.nome = nome;
    }
    public void setIdade(int idade){ // Observe que a ID pode ser diferente de idade mas normalmente é usado o mesmo nome
        if (idade < 0) {
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
