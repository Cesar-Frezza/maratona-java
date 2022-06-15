package academy.devdojo.maratonajava.javacore.Aintroducao.classes.test;


import academy.devdojo.maratonajava.javacore.Aintroducao.classes.dominio.Carros;

public class CarroTest01 {
    public static void main(String[] args) {

        // PARA CRIAR UM NOVO OBJETO SEGUE O PADRAO CHAMANDO A CLASSE "CARROS" ONDE DETEM OS ATRIBUTOS PARA OS OBJETOS
        // DEPOIS O NOME DE UM OBJETO "CARRO01" E "CARRO02" = NEW "CARROS" CLASSE DOS ATRIBUTOS

        Carros carro01 = new Carros();
        Carros carro02 = new Carros();

        // PARA INCLUIR O VALOR NOS ATRIBUTOS JA DEFINIDOS NA CLASSE CARROS NOME DO OBJETO.ATRIBUTO = VALOR DO ATRIBUIDO

        carro01.nome = "Duster";
        carro01.modelo = "Renault";
        carro01.ano = 2014;

        carro02.nome = "Civic";
        carro02.modelo = "Honda";
        carro02.ano = 2022;

        System.out.println(carro01.nome + " " + carro01.modelo + " " + carro01.ano);
        System.out.println(carro02.nome + " " + carro02.modelo + " " + carro02.ano);

    }
}