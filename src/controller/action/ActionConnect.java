package controller.action;

import controller.DBConnection;
import controller.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public ActionConnect(JTextField host, JTextField user, JPasswordField pass) {
        this.host = host;
        this.user = user;
        this.pass = pass;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            DBConnection dbc = new DBConnection("127.0.0.1", "mysql", "root", "");

            Data d = new Data(dbc);

            for(DataBase h:d.getDataBases()){
                System.out.println(h.getName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActionConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
