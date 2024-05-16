package br.edu.up.view;

import br.edu.up.Prompt;

public class View {

    public int exibirMenu() {
        Prompt.imprimir("Menu:");
        Prompt.imprimir("1. Incluir um contato pessoal");
        Prompt.imprimir("2. Incluir um contato comercial");
        Prompt.imprimir("3. Excluir um contato pelo código");
        Prompt.imprimir("4. Consultar um contato pelo código");
        Prompt.imprimir("5. Listar todos os contatos");
        Prompt.imprimir("6. Sair do programa");
        return Prompt.lerInteiro("Escolha uma das opçoes para prosseguir: ");
    }

    public int lerCodigo() {
        return Prompt.lerInteiro("Digite o código do contato: ");
    }

    public String lerNome() {
        return Prompt.lerLinha("Digite o nome do contato: ");
    }

    public String lerTelefone() {
        return Prompt.lerLinha("Digite o telefone do contato: ");
    }

    public String lerAniversario() {
        return Prompt.lerLinha("Digite o aniversário (DD/MM/YYYY): ");
    }

    public String lerCnpj() {
        return Prompt.lerLinha("Digite o CNPJ do contato comercial: ");
    }
}
