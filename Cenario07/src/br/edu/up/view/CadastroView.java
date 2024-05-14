package br.edu.up.view;

import java.util.List;
import java.util.Scanner;
import br.edu.up.*;
import br.edu.up.model.Aluno;
import br.edu.up.model.Professor;

public class CadastroView {
    private Scanner scanner;

    public CadastroView() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        Prompt.imprimir("1 - Cadastrar professor");
        Prompt.imprimir("2 - Listar professores");
        Prompt.imprimir("3 - Excluir professor");
        Prompt.imprimir("4 - Sair");
        Prompt.imprimir("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Professor cadastrarProfessor() {
        Prompt.imprimir("");
        String nome = Prompt.lerLinha("Nome: ");
        String rg = Prompt.lerLinha("RG: ");
        String matricula = Prompt.lerLinha("Matrícula: ");
        String lattesId = Prompt.lerLinha("Lattes ID: ");
        String titulacao = Prompt.lerLinha("Titulação: ");

        return new Professor(nome, rg, matricula, lattesId, titulacao);
    }

    public void listarProfessores(List<Professor> professores) {
        for (Professor professor : professores) {
            Prompt.imprimir("Nome: " + professor.getNome());
            Prompt.imprimir("RG: " + professor.getRg());
            Prompt.imprimir("Matrícula: " + professor.getMatricula());
            Prompt.imprimir("Lattes ID: " + professor.getLattesId());
            Prompt.imprimir("Titulação: " + professor.getTitulacao());
            Prompt.imprimir("");
        }
    }

    public Aluno cadastrarAluno() {
        String nome = Prompt.lerLinha("Nome do aluno: ");
        String rg = Prompt.lerLinha("RG: ");
        String matricula = Prompt.lerLinha("Matrícula: ");
        int anoIngresso = Prompt.lerInteiro("Ano de ingresso: ");
        String curso = Prompt.lerLinha("Curso: ");
        String turno = Prompt.lerLinha("Turno: ");

        return new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
    }

    public String getNomeExcluir() {
        Prompt.imprimir("Digite o nome do professor que deseja excluir: ");
        return scanner.nextLine();
    }
}
