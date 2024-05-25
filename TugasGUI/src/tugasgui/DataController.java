/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasgui;

/**
 *
 * @author HP
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataController {
    private DataModel model;
    private DataView view;

    public DataController(DataModel model, DataView view) {
        this.model = model;
        this.view = view;

        view.addListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.setData(view.getData());
            view.setData(model.getData());
        }
    }
}
