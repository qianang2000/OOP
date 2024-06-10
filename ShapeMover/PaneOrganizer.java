package ShapeMover;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;

public class PaneOrganizer {
    private BorderPane root;
    public PaneOrganizer() {
        this.root = new BorderPane();
        Pane shapePane = new Pane();
        this.root.setCenter(shapePane);
        HBox buttonBox = new HBox();
        this.root.setBottom(buttonBox);
        new shapeMover(shapePane, buttonBox);
    }

    public BorderPane getRoot() {
        return this.root;
    }

}
