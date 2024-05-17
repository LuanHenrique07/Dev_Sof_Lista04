package br.edu.up.controller;

import br.edu.up.model.Seguro;
import br.edu.up.Prompt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Controller {
    private List<Seguro> seguros = new ArrayList<>();

    public void incluirSeguro(Seguro seguro) {
        Optional<Seguro> existingSeguro = seguros.stream()
                .filter(s -> s.getApolice().equals(seguro.getApolice()))
                .findFirst();

        if (existingSeguro.isPresent()) {
            Prompt.imprimir("Apólice já existe. Inclusão não realizada.");
        } else {
            seguros.add(seguro);
            Prompt.imprimir("Seguro incluído com sucesso.");
        }
    }

    public Seguro localizarSeguro(String apolice) {
        return seguros.stream()
                .filter(s -> s.getApolice().equals(apolice))
                .findFirst()
                .orElse(null);
    }

    public void excluirSeguro(String apolice) {
        Seguro seguro = localizarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            Prompt.imprimir("Seguro excluído com sucesso.");
        } else {
            Prompt.imprimir("Seguro não encontrado.");
        }
    }

    public void excluirTodosSeguros() {
        Prompt.imprimir("Confirma a exclusão de todos os seguros? (S/N)");
        String resposta = Prompt.lerLinha();
        if (resposta.equalsIgnoreCase("S")) {
            seguros.clear();
            Prompt.imprimir("Todos os seguros foram excluídos.");
        } else {
            Prompt.imprimir("Exclusão cancelada.");
        }
    }

    public void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            Prompt.imprimir("Nenhum seguro cadastrado.");
        } else {
            seguros.forEach(seguro -> Prompt.imprimir(seguro.getDados()));
        }
    }

    public void verQuantidadeSeguros() {
        Prompt.imprimir("Quantidade de seguros: " + seguros.size());
    }
}
