package ipap.dynamiccats;

import ipap.dynamiccats.cats.Group;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloController {

    @FXML
    private VBox boxForCats;

    @FXML
    private TextField inputFName;

    @FXML
    private Button loadBtn;

    @FXML
    private TextArea textArea1;

    @FXML
    Label labelAlert;

    Group group = new Group();

    public void initialize(){

        loadBtn.setOnAction(actionEvent -> {
            try {
                group.loadFromFile(inputFName.getText());
                labelAlert.setVisible(false);
            } catch (IOException e) {
                labelAlert.setVisible(true);
            }
            showTheCats();
        });

    }

    public void showTheCats(){
        /*textArea1.setText("файл загружен");
        textArea1.appendText("\n"+group.getCats());*/

    }

}
