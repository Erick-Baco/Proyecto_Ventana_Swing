package controlador;

import modelo.Smartphone;
import modelo.ModeloTabla;
import vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorSmartphone extends MouseAdapter {

    private Ventana ventana;
    private ModeloTabla modelo;

    public ControladorSmartphone(Ventana ventana) {

        this.ventana = ventana;
        modelo = new ModeloTabla();

        this.ventana.getTblSmartphone().setModel(modelo);
        this.ventana.getBtnCargar().addMouseListener(this);
        this.ventana.getBtnAgregar().addMouseListener(this);
        this.ventana.getTblSmartphone().addMouseListener(this);
        this.ventana.getBtnEliminar().addMouseListener(this);
        this.ventana.getBtnModificar().addMouseListener(this);
        this.ventana.getBtnBuscar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.ventana.getBtnCargar()){

            modelo.cargar();

            this.ventana.getTblSmartphone().setModel(modelo);
            this.ventana.getTblSmartphone().updateUI();
        }

        if (e.getSource() == this.ventana.getBtnAgregar()){

            Smartphone smartphone = new Smartphone();

            smartphone.setId(0);
            smartphone.setMarca(this.ventana.getTxtMarca().getText());
            smartphone.setModelo(this.ventana.getTxtModelo().getText());
            smartphone.setOs(this.ventana.getTxtOs().getText());
            smartphone.setProcesador(this.ventana.getTxtProcesador().getText());
            smartphone.setUrl(this.ventana.getTxtURL().getText());

            if (modelo.agregar(smartphone)){
                JOptionPane.showMessageDialog(ventana,
                                    "Agregado.",
                                        "Aviso.",
                                            JOptionPane.INFORMATION_MESSAGE);

                this.ventana.getTblSmartphone().updateUI();
            }else {
                JOptionPane.showMessageDialog(ventana,
                                    "No se pudo agregar.",
                                       "Error al insertar.",
                                            JOptionPane.ERROR_MESSAGE);
            }

            this.ventana.Limpiarp1();
        }

        if (e.getSource() == this.ventana.getBtnModificar()){

            Smartphone smartphone = new Smartphone();

            smartphone.setId(Integer.parseInt(this.ventana.getTxtModId().getText()));
            smartphone.setMarca(this.ventana.getTxtModMarca().getText());
            smartphone.setModelo(this.ventana.getTxtModModelo().getText());
            smartphone.setOs(this.ventana.getTxtModOs().getText());
            smartphone.setProcesador(this.ventana.getTxtModProcesador().getText());
            smartphone.setUrl(this.ventana.getTxtModURL().getText());

            if (modelo.modificar(smartphone)){
                JOptionPane.showMessageDialog(ventana,
                                      "Modificado.",
                                         "Aviso.",
                                              JOptionPane.INFORMATION_MESSAGE);

                this.ventana.getTblSmartphone().updateUI();
            }else {
                JOptionPane.showMessageDialog(ventana,
                                     "No se pudo modificar.",
                                        "Error al insertar.",
                                             JOptionPane.ERROR_MESSAGE);
            }

            this.ventana.Limpiarp4();
        }

        if (e.getSource() == this.ventana.getTblSmartphone()){

            int id = this.ventana.getTblSmartphone().getSelectedRow();
            Smartphone foto = modelo.getSmartphoneAtIndex(id);

            try {
                this.ventana.getLblImagen().setIcon(foto.getImagen());
            }catch (MalformedURLException murle){
                System.out.println(murle.toString());
            }
        }

        if (e.getSource() == this.ventana.getBtnEliminar()){

            String id = this.ventana.getTxtModId().getText();

            if (modelo.eliminar(id)){
                JOptionPane.showMessageDialog(ventana,
                                      "Eliminado.",
                                         "Aviso.",
                                              JOptionPane.INFORMATION_MESSAGE);

                this.ventana.getTblSmartphone().updateUI();
            }else {
                JOptionPane.showMessageDialog(ventana,
                                      "No se pudo elimnar.",
                                         "Error al eliminar.",
                                              JOptionPane.ERROR_MESSAGE);
            }

            this.ventana.Limpiarp4();
        }
        if (e.getSource() == this.ventana.getBtnBuscar()){

            Smartphone tmp = null;
            String id = this.ventana.getTxtModId().getText();

            try {
                modelo.buscarId(id);
                    tmp = modelo.copiar(id);
                    this.ventana.getTxtModId().setText(tmp.getId()+"");
                    this.ventana.getTxtModMarca().setText(tmp.getMarca());
                    this.ventana.getTxtModModelo().setText(tmp.getModelo());
                    this.ventana.getTxtModOs().setText(tmp.getOs());
                    this.ventana.getTxtModProcesador().setText(tmp.getProcesador());
                    this.ventana.getTxtModURL().setText(tmp.getUrl());
                    JOptionPane.showMessageDialog(ventana,
                            "Se encontro",
                            "Busqueda exitosa",
                            JOptionPane.INFORMATION_MESSAGE);

            }catch (NullPointerException npe){
                System.out.println(npe.getMessage());
                JOptionPane.showMessageDialog(ventana,
                        "No se encontro",
                        "Error al buscar",
                        JOptionPane.ERROR_MESSAGE);
                this.ventana.Limpiarp4();
            }

        }

    }

}
