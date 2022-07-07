package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi", 290);

        // AQUI VEMOS A VELOCIDADE LIMITE SENDO ALTERADA NA RAIZ DA CLASSE E ASSIM ALTERANDO DE 250 PARA 180 EM TODOS
        // OS OBJETOS LEMBRANDO QUE DEVE SER PUBLIC DEVIDO A NAO SABERMOS AINDA COMO USAR O PRIVATE
        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
