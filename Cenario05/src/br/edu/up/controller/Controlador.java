package br.edu.up.Controller;

import br.edu.up.model.*;
import br.edu.up.View.*;
import br.edu.up.*;

public class Controlador {
    private static final int maxEventos = 100;
    private static final int maxReservas = 100;
    private Evento[] eventos = new Evento[maxEventos];
    private Reserva[] reservas = new Reserva[maxReservas];
    private int numEventos = 0;
    private int numReservas = 0;
    private IUsuario view = new IUsuario();

    public void adicionarEvento(Evento evento) {
        if (numEventos < maxEventos) {
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
        if (numReservas < maxReservas) {
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
            String opcao = Prompt.lerLinha("Escolha uma opção: ");

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
                    String nomeEvento = Prompt.lerLinha("Nome do evento da reserva: ");
                    Evento eventoReserva = null;
                    for (int i = 0; i < numEventos; i++) {
                        if (eventos[i].getNome().equals(nomeEvento)) {
                            eventoReserva = eventos[i];
                            break;
                        }
                    }
                    if (eventoReserva != null) {
                        String responsavel = Prompt.lerLinha("Responsável pela reserva: ");
                        int quantidadePessoas = Prompt.lerInteiro("Quantidade de pessoas: ");
                        String dataReserva = Prompt.lerLinha("Data da reserva: ");
                        double valorTotal = eventoReserva.getPrecoIngresso() * quantidadePessoas;
                        Reserva reserva = new Reserva(eventoReserva, responsavel, quantidadePessoas, dataReserva,
                                valorTotal);
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
