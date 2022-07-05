package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.training;

public class Maquininha {

    // dentro do método / dentro da função
    // 1º modificador de acesso (public no caso)
    // 2º tipo de retorno (void)
    // 3ª nome do método ou nome da função
    // 4º parâmetros que ela vai receber
    // 4.1º Tipo da variável (no caso Compras e Cartão)
    // 4.2º Nome da variável (no caso compra e cartaoDaPessoa)
    public void passandoACompra(Compras compra, Cartao cartaoDaPessoa) {
        double saldoAtual = cartaoDaPessoa.saldo - compra.valorDaCompra;
        if (compra.valorDaCompra > cartaoDaPessoa.saldo) {
            // variável faltante só existe no escopo do if
            double faltante = compra.valorDaCompra - cartaoDaPessoa.saldo;
            System.out.println("Sr." + cartaoDaPessoa.nomeDoTitular + " Sua compra do valor de: R$" +
                    compra.valorDaCompra + " no foi aceita, seu saldo eh: R$" + cartaoDaPessoa.saldo + " faltam R$" + faltante);
        } else {
            System.out.println("Sr." + cartaoDaPessoa.nomeDoTitular + " Sua compra foi aprovada, seu saldo eh de: R$" + saldoAtual);
        }
    }
}
