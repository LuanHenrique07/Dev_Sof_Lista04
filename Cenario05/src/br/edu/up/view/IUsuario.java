package br.edu.up.View;

import br.edu.up.*;
import br.edu.up.model.*;;

public class IUsuario {

    public void mostrarMenu() {
        Prompt.imprimir("1. Adicionar evento");
        Prompt.imprimir("2. Listar eventos");
        Prompt.imprimir("3. Adicionar reserva");
        Prompt.imprimir("4. Listar reservas");
        Prompt.imprimir("5. Sair");
    }

    public void mostrarEvento(Evento evento) {
        Prompt.imprimir("Nome: " + evento.getNome());
        Prompt.imprimir("Data: " + evento.getData());
        Prompt.imprimir("Local: " + evento.getLocal());
        Prompt.imprimir("Lotação máxima: " + evento.getLotacaoMaxima());
        Prompt.imprimir("Ingressos vendidos: " + evento.getIngressoVendido());
        Prompt.imprimir("Preço do ingresso: " + evento.getPrecoIngresso());
        Prompt.imprimir("");
    }

    public void mostrarReserva(Reserva reserva) {
        Prompt.imprimir("Evento: " + reserva.getEvento().getNome());
        Prompt.imprimir("Responsável: " + reserva.getResponsavel());
        Prompt.imprimir("Quantidade de pessoas: " + reserva.getQuantidadePessoa());
        Prompt.imprimir("Data da reserva: " + reserva.getDataReserva());
        Prompt.imprimir("Valor total: " + reserva.getValorTotal());
        Prompt.imprimir("");
    }
}
