//Motocicleta

public class motocicleta {
    public static void main(String[] args) {

        Motocicleta motocicleta = new Motocicleta();

        motocicleta.tipoRoda = "Esportiva";
        motocicleta.cor = "Red";
        motocicleta.marca = "Honda";
        motocicleta.motor = "250cc";

        motocicleta.mostrar();
    }
}

class Motocicleta {

    String tipoRoda;
    String cor;
    String marca;
    String motor;

    void mostrar() {
        if (tipoRoda != null && cor != null && marca != null && motor != null) {
            System.out.println(
                    "Tipo de roda: " + tipoRoda + "\n" +
                            "Cor: " + cor + "\n" +
                            "Marca: " + marca + "\n" +
                            "Motor: " + motor
            );
        } else {
            System.out.println("A motocicleta não possui as informações completas!!");
        }
    }
}

