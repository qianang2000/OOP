package ShapeMover;

import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.shape.Ellipse;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;

public class shapeMover {
    private Ellipse ellipse;
    public shapeMover(Pane shapePane, HBox buttonBox) {
        this.ellipse = new Ellipse(50, 50);
        shapePane.getChildren().add(this.ellipse);
        this.setShape();
        this.setButton(buttonBox);
    }
    private void setShape() {
        this.ellipse.setFill(Color.RED);
        this.ellipse.setCenterX(100);
        this.ellipse.setCenterY(50);
    }
    private void setButton(HBox buttonBox) {
        Button btn1 = new Button("Move Left");
        Button btn2 = new Button("Move Right");
        buttonBox.getChildren().addAll(btn1, btn2);
        buttonBox.setSpacing(30);
        btn1.setOnAction((ActionEvent e) -> this.move(-10));
        btn2.setOnAction((ActionEvent e) -> this.move(10));
    }
    private void move(double xChange) {
        double newXLocation = this.ellipse.getCenterX();
        newXLocation += xChange;
        this.ellipse.setCenterX(newXLocation);
    }
}
