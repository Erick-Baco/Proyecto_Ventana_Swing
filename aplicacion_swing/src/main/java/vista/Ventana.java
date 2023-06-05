package vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private JLabel lblId;
    private JLabel lblURL;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblOs;
    private JLabel lblProcesador;
    private JLabel lblImagen;

    private JLabel lblModId;
    private JLabel lblModURL;
    private JLabel lblModMarca;
    private JLabel lblModModelo;
    private JLabel lblModOs;
    private JLabel lblModProcesador;
    private JLabel lblModImagen;


    private TextField txtId;
    private TextField txtURL;
    private TextField txtMarca;
    private TextField txtModelo;
    private TextField txtOs;
    private TextField txtProcesador;

    private TextField txtModId;
    private TextField txtModURL;
    private TextField txtModMarca;
    private TextField txtModModelo;
    private TextField txtModOs;
    private TextField txtModProcesador;

    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnModificar;
    private JButton btnBuscar;

    private JTable tblSmartphone;

    private JScrollPane scrollPane;

    private GridLayout layout;

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(950,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1

        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(137, 221, 240));

        lblId = new JLabel("ID:");
        lblMarca = new JLabel("Marca:");
        lblModelo = new JLabel("Modelo:");
        lblOs = new JLabel("OS:");
        lblProcesador = new JLabel("Procesador:");
        lblURL = new JLabel("URL:");
        btnAgregar = new JButton("Agregar:");

        txtId = new TextField();
        txtId.setText("ID");
        txtId.setEnabled(false);
        txtMarca = new TextField(10);
        txtModelo = new TextField(20);
        txtOs = new TextField(15);
        txtProcesador = new TextField(20);
        txtURL = new TextField(30);

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblModelo);
        panel1.add(txtModelo);
        panel1.add(lblOs);
        panel1.add(txtOs);
        panel1.add(lblProcesador);
        panel1.add(txtProcesador);
        panel1.add(lblURL);
        panel1.add(txtURL);
        panel1.add(btnAgregar);

        //panel2

        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(161, 224, 121));

        btnCargar = new JButton("Cargar");
        tblSmartphone = new JTable();
        scrollPane = new JScrollPane(tblSmartphone);

        panel2.add(btnCargar);
        panel2.add(scrollPane);

        //panel3

        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(141, 198, 239));

        lblImagen = new JLabel("");

        panel3.add(lblImagen);

        //panel4

        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(140, 174, 222));

        lblModId = new JLabel("ID:");
        lblModMarca = new JLabel("Marca:");
        lblModModelo = new JLabel("Modelo:");
        lblModOs = new JLabel("OS:");
        lblModProcesador = new JLabel("Procesador:");
        lblModURL = new JLabel("URL:");
        btnModificar = new JButton("Modificar");
        btnBuscar = new JButton("Buscar");
        btnEliminar = new JButton("Eliminar");


        txtModId = new TextField(3);
        txtModMarca = new TextField(10);
        txtModModelo = new TextField(20);
        txtModOs = new TextField(15);
        txtModProcesador = new TextField(20);
        txtModURL = new TextField(50);


        panel4.add(lblModId);
        panel4.add(txtModId);
        panel4.add(lblModMarca);
        panel4.add(txtModMarca);
        panel4.add(lblModModelo);
        panel4.add(txtModModelo);
        panel4.add(lblModOs);
        panel4.add(txtModOs);
        panel4.add(lblModProcesador);
        panel4.add(txtModProcesador);
        panel4.add(lblModURL);
        panel4.add(txtModURL);
        panel4.add(btnBuscar);
        panel4.add(btnModificar);
        panel4.add(btnEliminar);


        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblURL() {
        return lblURL;
    }

    public void setLblURL(JLabel lblURL) {
        this.lblURL = lblURL;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JLabel getLblOs() {
        return lblOs;
    }

    public void setLblOs(JLabel lblOs) {
        this.lblOs = lblOs;
    }

    public JLabel getLblProcesador() {
        return lblProcesador;
    }

    public void setLblProcesador(JLabel lblProcesador) {
        this.lblProcesador = lblProcesador;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JLabel getLblModId() {
        return lblModId;
    }

    public void setLblModId(JLabel lblModId) {
        this.lblModId = lblModId;
    }

    public JLabel getLblModURL() {
        return lblModURL;
    }

    public void setLblModURL(JLabel lblModURL) {
        this.lblModURL = lblModURL;
    }

    public JLabel getLblModMarca() {
        return lblModMarca;
    }

    public void setLblModMarca(JLabel lblModMarca) {
        this.lblModMarca = lblModMarca;
    }

    public JLabel getLblModModelo() {
        return lblModModelo;
    }

    public void setLblModModelo(JLabel lblModModelo) {
        this.lblModModelo = lblModModelo;
    }

    public JLabel getLblModOs() {
        return lblModOs;
    }

    public void setLblModOs(JLabel lblModOs) {
        this.lblModOs = lblModOs;
    }

    public JLabel getLblModProcesador() {
        return lblModProcesador;
    }

    public void setLblModProcesador(JLabel lblModProcesador) {
        this.lblModProcesador = lblModProcesador;
    }

    public JLabel getLblModImagen() {
        return lblModImagen;
    }

    public void setLblModImagen(JLabel lblModImagen) {
        this.lblModImagen = lblModImagen;
    }

    public TextField getTxtId() {
        return txtId;
    }

    public void setTxtId(TextField txtId) {
        this.txtId = txtId;
    }

    public TextField getTxtURL() {
        return txtURL;
    }

    public void setTxtURL(TextField txtURL) {
        this.txtURL = txtURL;
    }

    public TextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(TextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public TextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(TextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public TextField getTxtOs() {
        return txtOs;
    }

    public void setTxtOs(TextField txtOs) {
        this.txtOs = txtOs;
    }

    public TextField getTxtProcesador() {
        return txtProcesador;
    }

    public void setTxtProcesador(TextField txtProcesador) {
        this.txtProcesador = txtProcesador;
    }

    public TextField getTxtModId() {
        return txtModId;
    }

    public void setTxtModId(TextField txtModId) {
        this.txtModId = txtModId;
    }

    public TextField getTxtModURL() {
        return txtModURL;
    }

    public void setTxtModURL(TextField txtModURL) {
        this.txtModURL = txtModURL;
    }

    public TextField getTxtModMarca() {
        return txtModMarca;
    }

    public void setTxtModMarca(TextField txtModMarca) {
        this.txtModMarca = txtModMarca;
    }

    public TextField getTxtModModelo() {
        return txtModModelo;
    }

    public void setTxtModModelo(TextField txtModModelo) {
        this.txtModModelo = txtModModelo;
    }

    public TextField getTxtModOs() {
        return txtModOs;
    }

    public void setTxtModOs(TextField txtModOs) {
        this.txtModOs = txtModOs;
    }

    public TextField getTxtModProcesador() {
        return txtModProcesador;
    }

    public void setTxtModProcesador(TextField txtModProcesador) {
        this.txtModProcesador = txtModProcesador;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JTable getTblSmartphone() {
        return tblSmartphone;
    }

    public void setTblSmartphone(JTable tblSmartphone) {
        this.tblSmartphone = tblSmartphone;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public void Limpiarp1(){
        txtMarca.setText("");
        txtModelo.setText("");
        txtOs.setText("");
        txtProcesador.setText("");
        txtURL.setText("");
    }

    public void Limpiarp4(){
        txtModId.setText("");
        txtModMarca.setText("");
        txtModModelo.setText("");
        txtModOs.setText("");
        txtModProcesador.setText("");
        txtModURL.setText("");
    }
}
