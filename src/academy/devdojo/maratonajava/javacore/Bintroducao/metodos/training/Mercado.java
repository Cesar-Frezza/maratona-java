package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.training;

public class Mercado {
    public static void main(String[] args) {
        // estrutura
        // Tipo da variável --- Nome da variável --- Atribuição de valor da variável

        // pessoas
        Cartao cesarCartao = new Cartao();
        Cartao emersonCartao = new Cartao();

        // compra de cada um
        Compras cesarCompras = new Compras();
        Compras emersonCompras = new Compras();

        // Maquininha do mercado
        Maquininha cielo = new Maquininha();

        // Informações do cartão preenchida
        cesarCartao.saldo = 100;
        cesarCartao.nomeDoTitular = "Cesar";

        emersonCartao.saldo = 80;
        emersonCartao.nomeDoTitular = "Emerson";

        // Compra de cada um
        cesarCompras.valorDaCompra = 50;
        emersonCompras.valorDaCompra = 100;

        // passando no caixa
        cielo.passandoACompra(emersonCompras, emersonCartao);
        cielo.passandoACompra(cesarCompras, cesarCartao);

    }
}
