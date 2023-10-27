package ipap.dynamiccats;

import ipap.dynamiccats.cats.Cat;
import ipap.dynamiccats.cats.Group;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
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
        boxForCats.getChildren().clear();                   //вытряхнем из контейнера дочерние элементы (если они там были)
        for (Cat cat: group.getCats()){
            Label lab = new Label(cat.getName());           //создаем новые объекты граф интерфейса
            Button bt = new Button(cat.getSpeech());        //и сразу задаем надписи на них
            HBox box = new HBox();                          //объединяем надпись и кнопку в горизонтальный контейнер
            box.getChildren().addAll(lab, bt);
            boxForCats.getChildren().add(box);              //добавляем элементы в имеющийся на форме контейнер
            //Описываем, что произойдет при нажатии данной конкретной кнопки (созданной выше)
            bt.setOnAction(xx -> textArea1.appendText("\n"+cat.say()));
        }

    }

}
