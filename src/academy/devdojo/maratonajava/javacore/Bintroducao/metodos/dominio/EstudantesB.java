package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio;

public class EstudantesB { // CRIADO A CLASSE COM SEUS ATRIBUTOS AQUI DOS OBJETOS CRIADOS POSTERIORMENTE
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){ // Este metodo ja esta dentro do objeto e assim pode seguir sm parametros definidos
        System.out.println(this.nome); // This é o comando para associar exatamente a variavel que deseja chamar
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }
}
