package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1200, 987.12, 2000}); // SALARIO RECEBE REFERENCIA DE 3 VALORES DE 3 MESES

        funcionario.imprime();
        funcionario.imprimeMediaSalario();
    }
}
