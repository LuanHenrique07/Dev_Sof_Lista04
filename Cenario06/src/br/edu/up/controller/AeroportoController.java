package br.edu.up.controller;

import br.edu.up.view.AeroportoView;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.models.*;

public class AeroportoController {
    private AeroportoView view;
    private List<Passageiro> passageiros;
    private List<Tripulacao> tripulacao;
    private List<Aeronave> aeronaves;
    private List<Voo> voos;

    public AeroportoController() {
        this.view = new AeroportoView();
        this.passageiros = new ArrayList<>();
        this.tripulacao = new ArrayList<>();
        this.aeronaves = new ArrayList<>();
        this.voos = new ArrayList<>();
    }

    public void iniciarSistema() {
        int opcao;
        do {
            view.exibirMenu();
            opcao = view.lerInteiro("");
            switch (opcao) {
                case 1:
                    cadastrarPassageiro();
                    break;
                case 2:
                    cadastrarTripulacao();
                    break;
                case 3:
                    agendarVoo();
                    break;
                case 4:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
    }

    private void cadastrarPassageiro() {
        String nome = view.lerString("Nome do passageiro: ");
        String rg = view.lerString("RG do passageiro: ");
        String identificadorBagagem = view.lerString("Identificador da bagagem: ");
    
        int numeroAssento = view.lerInteiro("Número do assento: ");
        String classeAssento = view.lerString("Classe do assento: ");
    
        Passagem passagem = new Passagem(numeroAssento, classeAssento);
    
        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem);

        passageiros.add(passageiro);
        System.out.println("Passageiro cadastrado com sucesso.");
    }

    private void cadastrarTripulacao() {
        String nome = view.lerString("Nome do tripulante: ");
        String rg = view.lerString("RG do tripulante: ");
        String identificacaoAeronautica = view.lerString("Identificação aeronáutica: ");
        String matriculaFuncionario = view.lerString("Matrícula do funcionário: ");
        
        Tripulacao tripulante = new Tripulacao(nome, rg, identificacaoAeronautica, matriculaFuncionario);
        

        if (tripulante instanceof Comandante) {
            int totalHorasVoo = view.lerInteiro("Total de horas de voo: ");
            ((Comandante) tripulante).setTotalHorasVoo(totalHorasVoo);
        } else if (tripulante instanceof Comissario) {
            List<String> idiomasFluencia = new ArrayList<>();
            int numIdiomas = view.lerInteiro("Quantidade de idiomas de fluência: ");
            for (int i = 0; i < numIdiomas; i++) {
                String idioma = view.lerString("Idioma " + (i+1) + ": ");
                idiomasFluencia.add(idioma);
            }
            ((Comissario) tripulante).setIdiomasFluencia(idiomasFluencia);
        }

        tripulacao.add(tripulante);
        System.out.println("Tripulante cadastrado com sucesso.");
    }

    private void agendarVoo() {
        String destino = view.lerString("Informe o destino do voo: ");
        String data = view.lerString("Informe a data do voo (formato DD/MM/AAAA): ");
        String horario = view.lerString("Informe o horário do voo (formato HH:MM): ");
        String numeroVoo = view.lerString("Informe o número do voo: ");
        
        Voo voo = new Voo(destino, data, horario, numeroVoo);
        
        voos.add(voo);

        System.out.println("Voo agendado com sucesso.");
    }
    
}
