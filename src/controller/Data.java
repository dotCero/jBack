package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DataBase;

/**
 *
 * @author dcero
 */
public class Data {    
    private final DBConnection connection;

    public Data(DBConnection connection) {
        this.connection = connection;
    }
    
    public List<DataBase> getDataBases() throws SQLException{
        String query = "show databases;";
        
        connection.result = connection.selectExecute(query);
        DataBase db;
        List<DataBase> ldb = new ArrayList<>();
        
        while(connection.result.next()){
            db = new DataBase();
            db.setName(connection.result.getString(1));
            ldb.add(db);
        }
        connection.statement.close();
        return ldb;
    }
}
