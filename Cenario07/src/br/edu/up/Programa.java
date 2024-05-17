package br.edu.up;

import br.edu.up.Controller.CadastroController;
import br.edu.up.View.CadastroView;

public class Programa {
    public static void main(String[] args) {
        CadastroView view = new CadastroView();
        CadastroController controller = new CadastroController(view);
        controller.iniciar();
    }
}
