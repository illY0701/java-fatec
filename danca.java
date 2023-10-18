//Dança

public class danca {
    public static void main(String[] args) {

        Dança dança = new Dança();

        dança.tipo = "Ballet clássico";
        dança.duracaoMin = 5;
        dança.ritmo = "lento";

        dança.mostrar();
    }
}

class Dança {

    String tipo;
    double duracaoMin;
    String ritmo;

    void mostrar() {
            System.out.println(
                    "Tipo de dança: " + tipo + "\n" +
                    "Duração: " + duracaoMin + "\n" +
                    "Ritmo: " + ritmo + "\n");
    }
}