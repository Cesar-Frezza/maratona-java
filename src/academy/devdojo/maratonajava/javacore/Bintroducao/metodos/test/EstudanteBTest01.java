package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.EstudantesB;
import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.ImpressoraEstudantesB;


public class EstudanteBTest01 {
    public static void main(String[] args) {
        EstudantesB estudantesB01 = new EstudantesB(); // FORAM CRIADOS DOIS OBJETOS COM AS CARACTERISTICAS DE ESTUDANTESB
        EstudantesB estudantesB02 = new EstudantesB(); // OBJETO ESTUDANTEB02 E ESTUDANTESB01
        ImpressoraEstudantesB impressora = new ImpressoraEstudantesB(); // CRIADO OBJETO IMPRESSORA COM AS CARACTERISTICAS
                                                                        // DE IMPRESSORAESTUDANTESB

        estudantesB01.nome = "Midorya"; // INCLUINDO VALORES AO OBJETO JA CRIADO ACIMA
        estudantesB01.idade = 18;
        estudantesB01.sexo = 'M';

        estudantesB02.nome = "Sakura";
        estudantesB02.idade = 17;
        estudantesB02.sexo = 'F';

        impressora.imprime(estudantesB01); //IMPRIME É O NOME DO METODO CRIADO
        impressora.imprime(estudantesB02); // IMPRESSORA É O OBJETO CRIADO COM AS CARACTERISTICAS DE IMPRESSORAESTUDANTEB
    }                                      // FAZENDO A ASSOCIACAO DOS VALORES DOS OBJETOS ESTUDANTESB01 E ESTUDANTESB02
}
