package model;

import controller.action.ActionConnect;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author dcero
 */
public class Aplication {

    private final JFrame view;
    private final JButton connect, btnDir;

    private JTextField host, user, capacity, dir, state;
    private JPasswordField pass;

    private JComboBox dbs;

    ActionListener al;

    public Aplication(
            JFrame view,
            JButton connect,
            JTextField host,
            JTextField user,
            JPasswordField pass,
            JComboBox dbs,
            JTextField capacity,
            JTextField dir,
            JTextField state,
            JButton btnDir
    ) {
        this.view = view;
        this.connect = connect;
        this.host = host;
        this.user = user;
        this.pass = pass;
        this.dbs = dbs;
        this.capacity = capacity;
        this.dir = dir;
        this.state = state;
        this.btnDir = btnDir;
    }

    public void start() {
        setWindow();
        addAction();
        enabledComponents(true);
    }

    private void setWindow() {
        view.setResizable(false);
        view.setBounds(0, 0, 400, 430);
        view.setLocationRelativeTo(null);
        view.setTitle("JBack");
    }

    private void addAction() {
        al = new ActionConnect(host, user, pass, dbs);
        connect.addActionListener(al);
    }

    public void enabledComponents(Boolean b) {
        host.setEditable(b);
        user.setEditable(b);
        pass.setEditable(b);
        connect.setEnabled(b);

        dbs.setEnabled(b);
        capacity.setEditable(b);
        dir.setEditable(b);
        state.setEditable(b);
        btnDir.setEnabled(b);
    }
}
