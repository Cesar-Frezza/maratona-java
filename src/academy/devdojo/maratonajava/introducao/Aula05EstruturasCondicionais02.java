package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Idade < 15 Categoria infantil
        //Idade >= 15 && < 18 Categoria juvenil
        //Idade >= 18 Categoria adulto
        int idade = 45;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");

        }
    }
}