//Super homem

public class superhomem {
    public static void main(String[] args) {
        Superheroi superhomem = new Superheroi();

        superhomem.nome = "Superman";
        superhomem.poderPrincipal = "Super Força";
        superhomem.voar = true;

        superhomem.mostrar();
    }
}

class Superheroi {
    String nome;
    String poderPrincipal;
    boolean voar;

    void mostrar() {
        if (nome != null && poderPrincipal != null) {
            System.out.println(
                    "Nome: " + nome + "\n" +
                    "Poder Principal: " + poderPrincipal + "\n" +
                    "Pode Voar? " + (voar ? "Sim" : "Não")
            );
        } else {
            System.out.println("Não é um super héroi!!");
        }
    }
}
