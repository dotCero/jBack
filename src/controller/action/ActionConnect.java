package controller.action;

import controller.DBConnection;
import controller.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.DataBase;

/**
 *
 * @author dcero
 */
public class ActionConnect implements ActionListener {

    private final JTextField host, user;
    private final JPasswordField pass;
    private JComboBox databases;

    public ActionConnect(JTextField host, JTextField user, JPasswordField pass, JComboBox databases) {
        this.host = host;
        this.user = user;
        this.pass = pass;
        this.databases = databases;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            DBConnection dbc = new DBConnection(host.getText().trim(), "mysql", user.getText().trim(), pass.getText().trim());

            Data d = new Data(dbc);

            databases.removeAllItems();

            for (DataBase h : d.getDataBases()) {
                databases.addItem(h);
            }

        } catch (SQLException ex) {
//            Logger.getLogger(ActionConnect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al conectar con la Base de Datos");
        }
    }

}
