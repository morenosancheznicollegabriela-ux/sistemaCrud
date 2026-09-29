import controlador.EmpleadoControlador;
import vista.ventanaEmpleados;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            EmpleadoControlador controlador =
                    new EmpleadoControlador();

            ventanaEmpleados ventana =
                    new ventanaEmpleados(controlador);

            ventana.setVisible(true);
        });
    }
}
