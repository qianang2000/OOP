package andybot;

import cs15.prj.andyBotSupport.AndyBotHelper;
import cs15.prj.andyBotSupport.CS15Robot;
import cs15.prj.andyBotSupport.RobotFactory;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Welcome to your andybot App class.
 * Please do not modify this file at all.
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        RobotFactory factory = new RobotFactory();
        CS15Robot andybot = factory.makeAndyBot();
        new AndyBotHelper(stage, new MazeSolver(andybot));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
