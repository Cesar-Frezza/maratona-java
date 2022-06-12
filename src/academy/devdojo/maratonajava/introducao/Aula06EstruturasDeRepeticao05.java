package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        //DADO O VALOR DE UM CARRO DESCUBRA EM QUANTAS PARCELAS ELE PODE SER COMPRADO
        // CONDICAO VALORDAPARCELA >= 1000

        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) { // (INT) é um CAST forçando ser um INT
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
