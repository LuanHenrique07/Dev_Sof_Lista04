package br.edu.up.view;

import java.util.Scanner;

public class AeroportoView {
    private Scanner scanner;

    public AeroportoView() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("Bem-vindo ao sistema do Aeroporto!");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar passageiro");
        System.out.println("2. Cadastrar tripulação");
        System.out.println("3. Agendar voo");
        System.out.println("4. Sair");
        System.out.print("Opção: ");
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public void limparBuffer() {
        scanner.nextLine();
    }
}

