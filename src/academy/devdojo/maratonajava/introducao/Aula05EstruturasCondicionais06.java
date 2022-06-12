package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // EXERCICIO Imprima utilizando o Switch, os valores de 1 a 7, se é dia util ou fim de semana
        //Considerando o 1 como Domingo
        byte dia = 15;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }

    }
}
