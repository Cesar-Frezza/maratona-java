package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(final String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return this.professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}


//    public void imprime(){
//        System.out.println(this.nome);
//        if (professores == null) return;
//        for (Professor professor : professores) {
//            System.out.println(professor.getNome());
//        }
//
//    }
//
//    public Escola(final String nome) {
//        this.nome = nome;
//    }
//
//    public String getNome() {
//        return this.nome;
//    }
//
//    public void setNome(final String nome) {
//        this.nome = nome;
//    }
//
//    public Professor[] getProfessores() {
//        return this.professores;
//    }
//
//    public void setProfessores(final Professor[] professores) {
//        this.professores = professores;
//    }
//}
