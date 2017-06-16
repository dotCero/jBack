package controller.action;

import com.google.gson.Gson;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class ActionOpenDir implements ActionListener{
    
    private JTextField dir;

    public ActionOpenDir(JTextField dir) {
        this.dir = dir;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fc.showOpenDialog(fc);
        
        if(option == JFileChooser.APPROVE_OPTION){
            dir.setText(fc.getSelectedFile().getAbsolutePath());
            
//            Gson g = new Gson();
//            
//            String datos = "Hola";
//            String jsonstring = g.toJson(datos);
//            System.out.println("JSON: "+jsonstring);
//            
//            try {
//                FileWriter w = new FileWriter("C:\\Users\\Alumno\\Downloads\\hola.json");
//                w.write(jsonstring);
//                w.flush();
//                w.close();
//            } catch (IOException ex) {
//                Logger.getLogger(ActionOpenDir.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }   
}