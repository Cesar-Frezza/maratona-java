package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.EstudantesB;

public class EstudanteBTest02 {

    public static void main(String[] args) {
        EstudantesB estudantesB01 = new EstudantesB(); // FORAM CRIADOS DOIS OBJETOS COM AS CARACTERISTICAS DE ESTUDANTESB
        EstudantesB estudantesB02 = new EstudantesB(); // OBJETO ESTUDANTEB02 E ESTUDANTESB01


        estudantesB01.nome = "Midorya"; // INCLUINDO VALORES AO OBJETO JA CRIADO ACIMA
        estudantesB01.idade = 18;
        estudantesB01.sexo = 'M';

        estudantesB02.nome = "Sakura";
        estudantesB02.idade = 17;
        estudantesB02.sexo = 'F';

        estudantesB01.imprime();
        System.out.println("--------------------------------");
        estudantesB02.imprime();
    }
}
