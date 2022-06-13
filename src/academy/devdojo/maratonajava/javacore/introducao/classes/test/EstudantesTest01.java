package academy.devdojo.maratonajava.javacore.introducao.classes.test;

import academy.devdojo.maratonajava.javacore.introducao.classes.dominio.Estudantes;
// IMPORT devido a Estudantes ser criado abaixo

public class EstudantesTest01 {
    public static void main(String[] args) {
        Estudantes estudante = new Estudantes();
        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
