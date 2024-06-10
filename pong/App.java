package pong;

import cs15.prj.pongSupport.CS15PongFrame;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Welcome to Pong! This is the App class.
 *
 * You should instantiate the top-level class in the start method.
 */
public class App extends Application {

    /**
     * This method starts the program, by setting up the Pong GUI.
     *
     * Instantiate the top-level class to start the game.
     */
    @Override
    public void start(Stage stage) {
        new CS15PongFrame(stage);
        //Don't change the line above! It instantiates the Pong
        //graphical user interface (GUI).

        //TODO Instantiate the top-level class here
        new PongGame();
    }

    /**
     * This is called a mainline.  When you type "java pong.App"
     * this method gets called automatically.  Ignore the "String[] args"
     * for now; you won't need it in CS15.  All this method does is
     * call the launch method, which is a JavaFX method that calls the start
     * method above. So if your code is in that start method then it will be
     * executed and run!
     *
     * DO NOT CHANGE THIS CODE!
     */
    public static void main(String[] args) {
        launch(args);
    }

}

