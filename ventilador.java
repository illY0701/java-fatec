//Ventilador

public class ventilador {
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();

        ventilador.material = "Plástico";
        ventilador.marca = "Philips";
        ventilador.potencia = 60;

        ventilador.mostrar();
    }
}
class Ventilador {

    String material;
    String marca;
    int potencia;

    void mostrar() {
      
            System.out.println(
  
                            "Material: " + material + "\n" +
                            "Marca: " + marca + "\n" +
                            "Potência: " + potencia + " watts");
    }
}

