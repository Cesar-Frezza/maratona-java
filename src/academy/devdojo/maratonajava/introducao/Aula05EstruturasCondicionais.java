package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebidas = idade >= 18;

        if (isAutorizadoComprarBebidas) {
            System.out.println("Voce pode comprar bebidas alcoolicas");
        }
        else {
            System.out.println("Nao autorizado comprar bebidas alcoolicas");
        }

        //if (!isAutorizadoComprarBebidas) { // ! = Condicao de negacao trazendo o FALSE
            //System.out.println("Nao autorizado comprar bebidas alcoolicas");
        }

    }
