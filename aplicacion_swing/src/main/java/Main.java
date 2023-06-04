import controlador.ControladorSmartphone;
import vista.Ventana;

public class Main {
    public static void main(String[] args) {

        Ventana ventana = new Ventana("SMARTPHONES");

        ControladorSmartphone controlador = new ControladorSmartphone(ventana);

    }
}
