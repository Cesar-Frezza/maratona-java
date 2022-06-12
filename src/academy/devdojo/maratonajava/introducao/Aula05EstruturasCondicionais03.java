package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar se salario > 5000
        double salario = 6000;
        //String mensagemDoar = "Eu vou doar 500,00 para o DevDojo";
        //String mensagemNaoDoar = "Eu nao posso doar no momento!";
        //Operador Ternario segue a sintaxe: (condicao) ? opcao se TRUE : opcao se FALSE
        //importante que as opcoes devem ser iguais ao tipo declarado.

        // String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        String resultado = salario > 5000 ? "Eu vou doar 500,00 para o DevDojo" : "Eu nao posso doar no momento!";

        /*if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        */
        System.out.println(resultado);

    }


}
