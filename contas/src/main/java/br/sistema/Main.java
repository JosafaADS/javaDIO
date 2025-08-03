package br.sistema;



import java.io.Console;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    static Console console = System.console();
    public static void main(String[] args) {
        
        int opcao;
        do {
            exibirMenu();
            opcao = Integer.parseInt(console.readLine());
            switch (opcao) {
                case 0 -> salvarProduto();
                case 1 -> buscarTodosProdutos();
                case 2 -> buscarProdutoPorId();
                case 3 -> atualizarProduto();
                case 4 -> excluirProduto();
                case 5 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
    }

    private static void exibirMenu() {
        System.out.println("\n### Menu de Operações ###");
        System.out.println("0. Salvar novo produto");
        System.out.println("1. Buscar todos produtos");
        System.out.println("2. Buscar produto por ID");
        System.out.println("3. Atualizar produto");
        System.out.println("4. Excluir produto");
        System.out.println("5. Sair do programa");
        System.out.print("Escolha uma opção: ");
    }

    private static void salvarProduto() {
        //todo sallva
        

        try (var con = Conexao.conectaBD()) {
            System.out.println("banco conectado");

            var sql = "insert into produtos (nome, quantidade, valor) values ('macarrao', 10, 2.50)";
            try (Statement stmt = con.createStatement()){
                stmt.executeUpdate(sql);
                System.out.println("produto inserido com sucesso");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    private static void buscarTodosProdutos() {
        
    }

    private static void buscarProdutoPorId() {
        
    }

    private static void atualizarProduto() {
        
    }

    private static void excluirProduto() {
        
    }
}