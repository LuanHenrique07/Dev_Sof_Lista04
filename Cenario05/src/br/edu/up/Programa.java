import br.edu.up.controller.Controlador;
import br.edu.up.controllers.*;
import br.edu.up.view.*;

public class Programa {
    public static void main(String[] args) throws Exception {

        Controlador controlador = new Controlador();
        IUsuario iUsuario = new IUsuario(controlador);
        iUsuario.exibirMenu();
    }
}
