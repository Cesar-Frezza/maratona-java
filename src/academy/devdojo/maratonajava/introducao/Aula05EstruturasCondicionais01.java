package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebidas = idade >= 18;

        if (isAutorizadoComprarBebidas == false) {
            System.out.println("Voce pode comprar bebidas alcolicas");
        }
        else {
            System.out.println("Nao autorizado comprar bebidas alcolicas");
        }

        //if (!isAutorizadoComprarBebidas) { // ! = Condicao de negacao trazendo o FALSE
            //System.out.println("Nao autorizado comprar bebidas alcoolicas");
        }

    }
