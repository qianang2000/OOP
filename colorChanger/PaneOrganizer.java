package colorChanger;

import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;

public class PaneOrganizer {
    private VBox root;
    public PaneOrganizer() {
        this.root = new VBox();
        this.root.setSpacing(10);
        Label label = new Label("CS15 ROCKS!");
        Button btn = new Button("Change Color");
        this.root.getChildren().addAll(label, btn);
        btn.setOnAction((ActionEvent e) -> this.changeColor(label));
    }
    public VBox getRoot() {
        return this.root;
    }
    public void changeColor(Label myLabel) {
        int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        Color color = Color.rgb(red, green, blue);
        myLabel.setTextFill(color);
    }
}
