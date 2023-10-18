//Smartphone
public class smartphone {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        smartphone.modelo = "Galaxy S21";
        smartphone.marca = "Samsung";
        smartphone.armazenamentoGB = 128;
        smartphone.temBluetooth = true;

        smartphone.mostrar();
    }
}

class Smartphone {
    String modelo;
    String marca;
    int armazenamentoGB;
    boolean temBluetooth;

    void mostrar() {
        if (modelo != null && marca != null) {
            System.out.println(
                    "Modelo: " + modelo + "\n" +
                    "Marca: " + marca + "\n" +
                    "Armazenamento: " + armazenamentoGB + "GB\n" +
                    "Tem Bluetooth? " + (temBluetooth ? "Sim" : "Não")
            );
        } else {
            System.out.println("Este smartphone não existe!!");
        }
    }
}

















