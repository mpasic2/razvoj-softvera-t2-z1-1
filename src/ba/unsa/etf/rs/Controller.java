package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label helloWorld;
    public void zdravo(ActionEvent actionEvent) {
        helloWorld.setText("HelloWorld");
    }
}
