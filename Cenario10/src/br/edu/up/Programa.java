package br.edu.up;

import br.edu.up.controller.Controller;
import br.edu.up.view.View;

public class Programa {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        View.exibirMenu(controller);
    }
}
