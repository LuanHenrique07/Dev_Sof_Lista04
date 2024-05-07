package controller;

import br.edu.up.Prompt;
import model.Evento;
import model.Reserva;
import view.IUsuario;

public class Controlador {
    private static final int MAX_EVENTOS = 100;
    private static final int MAX_RESERVAS = 100;
    private Evento[] eventos = new Evento[MAX_EVENTOS];
    private Reserva[] reservas = new Reserva[MAX_RESERVAS];
    private int numEventos = 0;
    private int numReservas = 0;
    private IUsuario view = new IUsuario();

    public void adicionarEvento(Evento evento) {
        if (numEventos < MAX_EVENTOS) {
            eventos[numEventos++] = evento;
        } else {
            Prompt.imprimir("Limite máximo de eventos atingido.");
        }
    }

    public void listarEventos() {
        for (int i = 0; i < numEventos; i++) {
            view.mostrarEvento(eventos[i]);
        }
    }

    public void adicionarReserva(Reserva reserva) {
        if (numReservas < MAX_RESERVAS) {
            reservas[numReservas++] = reserva;
        } else {
            Prompt.imprimir("Limite máximo de reservas atingido.");
        }
    }

    public void listarReservas() {
        for (int i = 0; i < numReservas; i++) {
            view.mostrarReserva(reservas[i]);
        }
    }

    public void iniciar() {
        while (true) {
            view.mostrarMenu();
            Prompt.lerLinha("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    String nome = Prompt.lerLinha("Nome do evento: ");
                    String data = Prompt.lerLinha("Data do evento: ");
                    String local = Prompt.lerLinha("Local do evento: ");
                    int lotacaoMaxima = Prompt.lerInteiro("Lotação máxima do evento: ");
                    int ingressoVendido = Prompt.lerInteiro("Ingressos vendidos: ");
                    double precoIngresso = Prompt.lerDecimal("Preço do ingresso: ");
                    Evento evento = new Evento(nome, data, local, lotacaoMaxima, ingressoVendido, precoIngresso);
                    adicionarEvento(evento);
                    break;

                case "2":
                    listarEventos();
                    break;

                case "3":
                    Prompt.lerLinha("Nome do evento da reserva: ");
                    String nomeEvento = scanner.nextLine();
                    Evento eventoReserva = null;
                    for (int i = 0; i < numEventos; i++) {
                        if (eventos[i].getNome().equals(nomeEvento)) {
                            eventoReserva = eventos[i];
                            break;
                        }
                    }
                    if (eventoReserva != null) {
                        Prompt.lerLinha("Responsável pela reserva: ");
                        String responsavel = scanner.nextLine();
                        Prompt.lerLinha("Quantidade de pessoas: ");
                        int quantidadePessoas = Integer.parseInt(scanner.nextLine());
                        Prompt.lerLinha("Data da reserva: ");
                        String dataReserva = scanner.nextLine();
                        double valorTotal = eventoReserva.getPrecoIngresso() * quantidadePessoas;
                        Reserva reserva = new Reserva(eventoReserva, responsavel, quantidadePessoas, dataReserva, valorTotal);
                        adicionarReserva(reserva);
                    } else {
                        Prompt.imprimir("Evento não encontrado.");
                    }
                    break;

                case "4":
                    listarReservas();
                    break;

                case "5":
                    return;

                default:
                    Prompt.imprimir("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
}
