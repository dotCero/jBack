package controller.action;

import controller.DBConnection;
import controller.Data;
import controller.Setting;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.DataBase;

/**
 *
 * @author dcero
 */
public class ActionConnect implements ActionListener {

    private final JFrame app;

    private final JTextField host, user;
    private final JPasswordField pass;
    private final JComboBox databases;

    public ActionConnect(JFrame app, JTextField host, JTextField user, JPasswordField pass, JComboBox databases) {
        this.app = app;
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
            JOptionPane.showMessageDialog(
                    app,
                    "Error al cargar las bases de datos, reescriba los parámetros",
                    "Error al loguear",
                    JOptionPane.ERROR_MESSAGE
            );
            databases.removeAllItems();
        }
    }

}
