package persistencia;
import modelo.Smartphone;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDAO {
    public abstract boolean agregar(Object obj) throws SQLException;
    public abstract boolean actualizar (Object obj) throws SQLException;
    public abstract boolean eliminar (String id) throws SQLException;
    public abstract ArrayList obtenerTodo () throws SQLException;
    public abstract boolean buscar (String id) throws SQLException;
    public abstract Smartphone copiar (String id) throws SQLException;
}
