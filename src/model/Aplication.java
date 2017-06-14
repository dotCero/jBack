package model;

import controller.action.ActionConnect;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author dcero
 */
public class Aplication {

    private final JFrame view;
    private final JButton connect;
    
    private JTextField host, user;
    private JPasswordField pass;
    
    ActionListener al = new ActionConnect(host, user, pass);

    public Aplication(JFrame view, JButton connect, JTextField host, JTextField user, JPasswordField pass) {
        this.view = view;
        this.connect = connect;
        this.host = host;
        this.user = user;
        this.pass = pass;
    }

    public void start() {
        setWindow();
        addAction();
    }

    private void setWindow() {
        view.setResizable(false);
        view.setBounds(0, 0, 400, 430);
        view.setLocationRelativeTo(null);
        view.setTitle("JBack");
    }
    
    private void addAction(){
        connect.addActionListener(al);
    }
}