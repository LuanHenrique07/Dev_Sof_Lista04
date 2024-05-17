package br.edu.up.view;

import br.edu.up.controller.Controller;
import br.edu.up.model.Seguro;
import br.edu.up.model.SeguroVeiculo;
import br.edu.up.model.SeguroVida;
import br.edu.up.Prompt;

import java.time.LocalDate;

public class View {

    public static void exibirMenu(Controller controller) {
        while (true) {
            Prompt.imprimir("Menu:");
            Prompt.imprimir("1. Incluir seguro");
            Prompt.imprimir("2. Localizar seguro");
            Prompt.imprimir("3. Excluir seguro");
            Prompt.imprimir("4. Excluir todos os seguros");
            Prompt.imprimir("5. Listar todos os seguros");
            Prompt.imprimir("6. Ver quantidade de seguros");
            Prompt.imprimir("7. Sair");
            int opcao = Prompt.lerInteiro("Escolha uma opção:");

            switch (opcao) {
                case 1:
                    incluirSeguro(controller);
                    break;
                case 2:
                    localizarSeguro(controller);
                    break;
                case 3:
                    excluirSeguro(controller);
                    break;
                case 4:
                    controller.excluirTodosSeguros();
                    break;
                case 5:
                    controller.listarTodosSeguros();
                    break;
                case 6:
                    controller.verQuantidadeSeguros();
                    break;
                case 7:
                    System.exit(0);
                default:
                    Prompt.imprimir("Opção inválida.");
            }
        }
    }

    private static void incluirSeguro(Controller controller) {
        String tipo = Prompt.lerLinha("Informe o tipo de seguro (vida/veiculo):");
        Seguro seguro;
        if (tipo.equalsIgnoreCase("vida")) {
            seguro = new SeguroVida();
            ((SeguroVida) seguro).setCobreDoenca(Prompt.lerLinha("Cobre doença? (S/N)").equalsIgnoreCase("S"));
            ((SeguroVida) seguro).setCobreAcidente(Prompt.lerLinha("Cobre acidente? (S/N)").equalsIgnoreCase("S"));
        } else if (tipo.equalsIgnoreCase("veiculo")) {
            seguro = new SeguroVeiculo();
            ((SeguroVeiculo) seguro).setVlrFranquia(Prompt.lerDecimal("Valor da franquia:"));
            ((SeguroVeiculo) seguro)
                    .setTemCarroReserva(Prompt.lerLinha("Tem carro reserva? (S/N)").equalsIgnoreCase("S"));
            ((SeguroVeiculo) seguro).setCobreVidros(Prompt.lerLinha("Cobre vidros? (S/N)").equalsIgnoreCase("S"));
        } else {
            Prompt.imprimir("Tipo de seguro inválido.");
            return;
        }
        seguro.setApolice(Prompt.lerLinha("Número da apólice:"));
        seguro.setVlrApolice(Prompt.lerDecimal("Valor da apólice:"));
        seguro.setDtaInicio(LocalDate.parse(Prompt.lerLinha("Data de início (AAAA-MM-DD):")));
        seguro.setDtaFim(LocalDate.parse(Prompt.lerLinha("Data de fim (AAAA-MM-DD):")));
        controller.incluirSeguro(seguro);
    }

    private static void localizarSeguro(Controller controller) {
        String apolice = Prompt.lerLinha("Informe o número da apólice:");
        Seguro seguro = controller.localizarSeguro(apolice);
        if (seguro != null) {
            Prompt.imprimir("Seguro encontrado: " + seguro.getDados());
        } else {
            Prompt.imprimir("Seguro não encontrado.");
        }
    }

    private static void excluirSeguro(Controller controller) {
        String apolice = Prompt.lerLinha("Informe o número da apólice:");
        controller.excluirSeguro(apolice);
    }
}
