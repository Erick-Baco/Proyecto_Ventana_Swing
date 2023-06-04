package persistencia;

import modelo.Smartphone;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SmartphoneDAO implements InterfazDAO {

    public SmartphoneDAO() {
    }

    @Override
    public boolean agregar(Object obj) throws SQLException {
        String sql = " INSERT INTO smartphone(Marca,Modelo,OS,Procesador,URL) VALUES (?,?,?,?,?);";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("smartphonesDB.db").getConnection().prepareStatement(sql);
        pstm.setString(1,((Smartphone)obj).getMarca());
        pstm.setString(2,((Smartphone)obj).getModelo());
        pstm.setString(3,((Smartphone)obj).getOs());
        pstm.setString(4,((Smartphone)obj).getProcesador());
        pstm.setString(5,((Smartphone)obj).getUrl());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean actualizar(Object obj) throws SQLException {
        String sqlActualizar = "UPDATE smartphone SET Marca = ?, Modelo = ?, OS = ?, Procesador = ?, URL = ?  WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("smartphonesDB.db").getConnection().prepareStatement(sqlActualizar);
        pstm.setString(1,((Smartphone)obj).getMarca());
        pstm.setString(2,((Smartphone)obj).getModelo());
        pstm.setString(3,((Smartphone)obj).getOs());
        pstm.setString(4,((Smartphone)obj).getProcesador());
        pstm.setString(5,((Smartphone)obj).getUrl());
        pstm.setInt(6,((Smartphone)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean eliminar(String id) throws SQLException {
        String sqlEliminar = "DELETE FROM smartphone WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("smartphonesDB.db").getConnection().prepareStatement(sqlEliminar);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM smartphone";
        ArrayList<Smartphone> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("smartphonesDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Smartphone(rst.getInt(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public boolean buscar(String id) throws SQLException {
        boolean resultado = false;
        String sql = "SELECT * FROM smartphone WHERE id = ? ;";
        PreparedStatement pstm = ConexionSingleton.getInstance("smartphonesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            return resultado = true;
        }
        return resultado;
    }

    @Override
    public Smartphone copiar(String id) throws SQLException {
        String sql = "SELECT * FROM smartphone WHERE id = ? ;";
        Smartphone smartphone = null;
        PreparedStatement pstm = ConexionSingleton.getInstance("smartphonesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            smartphone = new Smartphone(rst.getInt(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));
            return smartphone;
        }
        return null;
    }
}
