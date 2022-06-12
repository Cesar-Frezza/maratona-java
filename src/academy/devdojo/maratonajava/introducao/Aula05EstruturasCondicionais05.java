package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana considerando o 1 como domingo
        byte dia = 5; // Seria a entrada do usuario
        //Para usar Switch: char, int, byte, short, enum, String
        //deve ter o "break" e deve ter o "default"
        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }
        char sexo = 'M'; // Simulando a entrada de M
        switch (sexo){
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            case 'F':
                System.out.println("Sexo Feminino");
                break;
        }
    }
}
