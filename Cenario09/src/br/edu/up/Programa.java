package br.edu.up;

import br.edu.up.controller.Controller;
import br.edu.up.view.View;

public class Programa {
    public static void main(String[] args) throws Exception {
        View view = new View();
        Controller controller = new Controller(view);
        controller.iniciar();
    }
}
