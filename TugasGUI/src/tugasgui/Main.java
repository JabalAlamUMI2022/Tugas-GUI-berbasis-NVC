/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasgui;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        DataModel model = new DataModel();
        DataView view = new DataView();
        DataController controller = new DataController(model, view);
    }
}
