package academy.devdojo.maratonajava.javacore.Aintroducao.classes.test;

import academy.devdojo.maratonajava.javacore.Aintroducao.classes.dominio.Professores;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professores professores01 = new Professores();
        professores01.nome = "Mestre Kami";
        professores01.idade = 140;
        professores01.sexo = 'M';

        System.out.println("Nome: " + professores01.nome + " " + "\nIdade: "+ professores01.idade+" Anos"+ " " + "\nSexo: " + professores01.sexo);

    }
}
