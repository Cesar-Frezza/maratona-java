package academy.devdojo.maratonajava.javacore.Aintroducao.classes.test;

import academy.devdojo.maratonajava.javacore.Aintroducao.classes.dominio.Estudantes;

public class EstudantesTest02 {
    public static void main(String[] args) {
        Estudantes estudante01 = new Estudantes();
        Estudantes estudante02 = new Estudantes();

        estudante01.nome = "Virgil";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("---------------------------------------");

        estudante02.nome = "Dante";
        estudante02.idade = 21;
        estudante02.sexo = 'M';

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

    }
}
