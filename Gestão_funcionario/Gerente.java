// Classe para representar um gerente (herda de Funcionario)
class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, "Gerente", salario);
        this.departamento = departamento;
    }

    // Getter para o departamento
    public String getDepartamento() {
        return departamento;
    }

    // Método para exibir informações específicas de um gerente
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe pai
        System.out.println("Departamento: " + departamento);
    }
}
