package br.edu.up.view;
import br.edu.up.*;
import br.edu.up.controllers.*;
import java.util.Scanner;

public class IUsuario {
    private Controlador controlador;

    public IUsuario(Controlador controlador) {
        this.controlador = controlador;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            Prompt.imprimir("----Escolha uma opção:----");
            Prompt.imprimir("1 - Registrar entrada de carro");
            Prompt.imprimir("2 - Registrar saída de carro");
            Prompt.imprimir("3 - Gerar relatório");
            Prompt.imprimir("4 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    Prompt.imprimir("Digite o modelo do carro:");
                    String modelo = scanner.nextLine();
                    Prompt.imprimir("Digite a placa do carro:");
                    String placa = scanner.nextLine();
                    Prompt.imprimir("Digite a cor do carro:");
                    String cor = scanner.nextLine();
                    controlador.registrarEntrada(modelo, placa, cor);
                    break;
                case 2:
                    Prompt.imprimir("Digite a placa do carro que saiu:");
                    placa = scanner.nextLine();
                    controlador.registrarSaida(placa);
                    break;
                case 3:
                    controlador.gerarRelatorio();
                    break;
                case 4:
                    Prompt.imprimir("Saindo do programa...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida!");
            }
        } while (opcao != 4);
        scanner.close();
    }
}
