package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereco <endereco>,
Confirmo que recebi o salário de <salario>, na data <data>.
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Cesar";
        String endereco = "Av Dr Roberto Amparo Pastana Camara N 7360 JD Europa";
        double salarioDouble = 3000.12;
        String dataRecebimentoSalario = "01/06/2022";

        String relatorio = "Eu "+nome+" morando no endereco "+endereco+" confirmo que recebi o salario de "+salarioDouble+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);
        //System.out.println("Eu "+nome+" morando no endereco "+endereco+" confirmo que recebi o salario de "+salarioDouble+", na data "+dataRecebimentoSalario);
    }
}
