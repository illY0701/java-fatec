//Carro

public class carro {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.cor = "Azul";
        carro.placa = "ABC123";
        carro.marca = "Toyota";
        carro.tipo = "Sedan";

        carro.mostrar();
    }
}

class Carro {

    String cor;
    String placa;
    String marca;
    String tipo;

    void mostrar() {
            System.out.println(
                    "Cor: " + cor + "\n" +
                    "Placa: " + placa + "\n" +
                    "Marca: " + marca + "\n" +
                    "Tipo: " + tipo
            );
        
    }
}


