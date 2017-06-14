package controller;

/*Clase para poder conectar*/
import java.sql.Connection;
/*Clase para enviar consultas*/
import java.sql.Statement;
/*Clase para recibir resultados*/
import java.sql.ResultSet;
/*Clase para conectar especificamente con MySQL*/
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/**
 *
 * @author DCero
 */
public class DBConnection {

    private final Connection connection;
    public Statement statement;
    public ResultSet result;

    public DBConnection(String server, String bd, String user, String pass) throws SQLException {
        /*Conexión específica*/
        MysqlDataSource mysql = new MysqlDataSource();
        mysql.setServerName(server);
        mysql.setDatabaseName(bd);
        mysql.setUser(user);
        mysql.setPassword(pass);

        connection = mysql.getConnection();
    }
    
    /**
     * Método para ejecutar Insert, Delete o Update
     * @param sql Sentencia insert, delete, update
     */
    public void execute(String sql) throws SQLException{
        statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
    }
    
    /**
     * Método para ejecutar select
     * @param select
     * @return 
     */
    public ResultSet selectExecute(String select) throws SQLException{
        statement = connection.createStatement();
        result = statement.executeQuery(select);
        return result;
    }
}