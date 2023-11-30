// Classe principal que contém o método main

import java.util.ArrayList;

public class Atividade1 {
    public static void main(String[] args) {
        // Criando uma lista de funcionários
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários à lista
        funcionarios.add(new Funcionario("João", "Desenvolvedor", 5000.0));
        funcionarios.add(new Gerente("Maria", 8000.0, "TI"));

        // Iterando sobre a lista e exibindo informações
        for (Funcionario func : funcionarios) {
            func.exibirInformacoes();
            System.out.println("------------");
        }
    }
}