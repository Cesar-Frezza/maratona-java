package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //DADO O VALOR DE UM CARRO DESCUBRA EM QUANTAS PARCELAS ELE PODE SER COMPRADO
        // CONDICAO VALORDAPARCELA >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
