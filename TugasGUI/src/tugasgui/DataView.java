/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasgui;
import javax.swing.*;
import java.awt.event.ActionListener;

public class DataView {
    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private ActionListener listener;

    public DataView() {
        frame = new JFrame("MVC Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        textField = new JTextField(15);
        button = new JButton("Set Data");

        panel.add(textField);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }

    public String getData() {
        return textField.getText();
    }

    public void setData(String data) {
        textField.setText(data);
    }

    public void addListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}
