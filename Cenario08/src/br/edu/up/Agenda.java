import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void excluirContato(int codigo) {
        contatos.removeIf(c -> c.getCodigo() == codigo);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            Prompt.imprimir(contato.toString());
        }
    }

}
