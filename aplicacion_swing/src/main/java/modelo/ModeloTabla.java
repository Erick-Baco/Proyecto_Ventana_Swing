package modelo;

import persistencia.SmartphoneDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;


public class ModeloTabla implements TableModel {

    public static final int COLUMNAS = 6;
    private ArrayList <Smartphone> datos;
    private SmartphoneDAO smartphoneDAO;

    public ModeloTabla() {
        smartphoneDAO = new SmartphoneDAO();
        datos = new ArrayList<>();
    }

    public ModeloTabla(ArrayList<Smartphone> datos) {
        this.datos = datos;
        smartphoneDAO = new SmartphoneDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "Id";
            case 1:
                return "Marca";
            case 2:
                return "Modelo";
            case 3:
                return "OS";
            case 4:
                return "Procesador";
            case 5:
                return "Foto";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Smartphone tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getMarca();
            case 2:
                return tmp.getModelo();
            case 3:
                return tmp.getOs();
            case 4:
                return tmp.getProcesador();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                break;
            case 1:
                datos.get(rowIndex).setMarca((String)aValue);
                break;
            case 2:
                datos.get(rowIndex).setModelo((String)aValue);
                break;
            case 3:
                datos.get(rowIndex).setOs((String)aValue);
                break;
            case 4:
                datos.get(rowIndex).setProcesador((String)aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl((String)aValue);
                break;
            default:
                System.out.println("xxx");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public void cargar(){
        try {
            datos = smartphoneDAO.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregar(Smartphone smartphone){
        boolean resultado = false;
        try {
            if(smartphoneDAO.agregar(smartphone)){
                datos.add(smartphone);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean eliminar(String id){
        boolean resultado = false;
        try {
            if (smartphoneDAO.eliminar(id)){
                resultado = true;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean modificar ( Smartphone smartphone){
        boolean resultado = false;
        try {
            if (smartphoneDAO.actualizar(smartphone)){
                resultado = true;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    public boolean buscarId (String id){
        boolean resultado = false;
        try {
            smartphoneDAO.buscar(id );
            return resultado = true;
        }catch (SQLException sqle ){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Smartphone copiar (String id){
        Smartphone smartphone = null;
        try {
            smartphone = smartphoneDAO.copiar(id);
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return smartphone;
    }

    public Smartphone getSmartphoneAtIndex(int index){
        return datos.get(index);
    }
}
