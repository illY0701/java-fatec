//Camera Digital

public class camera {
    public static void main(String[] args) {
        CameraDigital camera = new CameraDigital();

        camera.marca = "Canon";
        camera.resolucaoMP = 24;
        camera.Wifi = true;

        camera.mostrar();
    }
}

class CameraDigital {
    String marca;
    int resolucaoMP;
    boolean Wifi;

    void mostrar() {
        if (marca != null) {
            System.out.println(
                    "Marca: " + marca + "\n" +
                    "Resolucao: " + resolucaoMP + "MP\n" +
                    "WiFi? " + (Wifi ? "Yes" : "No")
            );
        } else {
            System.out.println("A camera digital não existe!!");
        }
    }
} 
