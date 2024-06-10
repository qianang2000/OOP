package clock;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;



public class App extends Application{
    @Override
    public void start(Stage stage) {
        PaneOrganizer organizer = new PaneOrganizer();
        Scene scene = new Scene(organizer.getRoot(), 400, 300);
        stage.setScene(scene);
        stage.setTitle("Clock");
        stage.show();
    }
}
