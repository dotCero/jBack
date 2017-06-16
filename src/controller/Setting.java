package controller;

import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class Setting {

    public void stateButton(List<JButton> activateButton, List<JButton> deactivateButton) {
        activateButton.stream().forEach((b) -> {
            b.setEnabled(true);
        });
        deactivateButton.stream().forEach((b) -> {
            b.setEnabled(false);
        });
    }

    public void stateTextField(List<JTextField> activateTField, List<JTextField> deactivateTField) {
        activateTField.stream().forEach((t) -> {
            t.setEditable(true);
        });
        deactivateTField.stream().forEach((t) -> {
            t.setEditable(false);
        });
    }
}
