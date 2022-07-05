package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//      pessoa.nome = "Jiraya";     // Aqui o nome nao é mais acessivel devido a ser um atributo "private"
//      pessoa.idade = -1;          // O Acoplamento é referente ao quanto uma classe sabe de outra classe
//                                  // por exemplo a idade -1 nao um numero invalido para idade e mesmo assim ele imprime
//                                  // Tornando o codigo fragil a erros idade tbm é "private"


        pessoa.setNome("Jiraya");    // o set. serve para incluir valores em atributos private
        pessoa.setIdade(70);        // o set. serve para incluir valores em atributos private

        pessoa.imprime();       // Executa o metodo IMPRIME

        System.out.println(pessoa.getNome());    // o get. serve para pegar um valor em atributos private
        System.out.println(pessoa.getIdade());  // o get. serve para pegar um valor em atributos private
    }
}
