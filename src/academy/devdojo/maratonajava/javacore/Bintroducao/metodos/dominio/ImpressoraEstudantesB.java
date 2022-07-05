package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio;


public class ImpressoraEstudantesB {
    public void imprime(EstudantesB estudante) { // METODO/FUNÇÃO CRIADO COM O OBJETIVO DE ASSOCIAR A CLASSE ESTUDANTEB A VARIAVEL ESTUDANTE


        System.out.println("-------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
