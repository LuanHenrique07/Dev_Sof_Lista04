public class Pessoal extends Contato {

    public String Aniversario;

    public Pessoal(int codigo, String nome, String telefone, String aniversario) {
        super(codigo, nome, telefone);
        Aniversario = aniversario;
    }

    public String getAniversario() {
        return Aniversario;
    }

    public void setAniversario(String aniversario) {
        Aniversario = aniversario;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
