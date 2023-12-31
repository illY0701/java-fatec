//Polimorfismo
//Compra - Cupom (Dependência)

// Classe Compra
class Compra {
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public void mostrarInformacoes() {
        System.out.println("Produto: " + produto);
        System.out.println("Valor: R$" + valor);
    }
}

// Classe Cupom
class Cupom {
    private int codigo;
    private Compra compra;

    public Cupom(int codigo, Compra compra) {
        this.codigo = codigo;
        this.compra = compra;
    }

    public void mostrarInformacoes() {
        System.out.println("Código do Cupom: " + codigo);
        compra.mostrarInformacoes();
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes
        Compra compra1 = new Compra("Livro", 50.0);
        Cupom cupom1 = new Cupom(12345, compra1);
        cupom1.mostrarInformacoes();
    }
}





