package br.edu.up.Controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.View.CadastroView;
import br.edu.up.model.Aluno;
import br.edu.up.model.Professor;
import br.edu.up.Prompt;

public class CadastroController {
    private CadastroView view;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public CadastroController(CadastroView view) {
        this.view = view;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    cadastrarAluno();
                    break;
                case 3:
                    view.listarProfessores(professores);
                    break;
                case 4:
                    view.listarAlunos(alunos);
                    break;
                case 5:
                    excluirProfessor();
                    break;
                case 6:
                    excluirAluno();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    Prompt.imprimir("Opção inválida");
                    break;
            }
        } while (opcao != 7);
    }

    private void cadastrarProfessor() {
        Professor professor = view.cadastrarProfessor();
        professores.add(professor);
        Prompt.imprimir("Professor cadastrado com sucesso");
    }

    private void cadastrarAluno() {
        Aluno aluno = view.cadastrarAluno();
        alunos.add(aluno);
        Prompt.imprimir("Aluno cadastrado com sucesso");
    }

    private void excluirProfessor() {
        String nomeProfessorParaExcluir = view.getNomeExcluir("professor");
        boolean removido = false;
        for (Professor professor : professores) {
            if (professor.getNome().equals(nomeProfessorParaExcluir)) {
                professores.remove(professor);
                removido = true;
                break;
            }
        }
        if (removido) {
            Prompt.imprimir("Professor excluído com sucesso");
        } else {
            Prompt.imprimir("Professor não encontrado");
        }
    }

    private void excluirAluno() {
        String nomeAlunoParaExcluir = view.getNomeExcluir("aluno");
        boolean removido = false;
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nomeAlunoParaExcluir)) {
                alunos.remove(aluno);
                removido = true;
                break;
            }
        }
        if (removido) {
            Prompt.imprimir("Aluno excluído com sucesso");
        } else {
            Prompt.imprimir("Aluno não encontrado");
        }
    }
}
