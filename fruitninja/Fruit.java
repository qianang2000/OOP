package fruitninja;

import cs15.prj.fruitNinjaSupport.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Fruit extends CS15Fruit implements Object{
    private int score;
    public Fruit() {
        super();
    }
    @Override
    public String getImage() {
        String result = "";
        int rnd = (int)(Math.random() * 4);
        if (rnd == 0) {
            result = Constants.APPLE_PATH;
            this.score = 5;
        }
        else if (rnd == 1) {
            result = Constants.LEMON_PATH;
            this.score = 2;
        }
        else if (rnd == 2) {
            result = Constants.PEAR_PATH;
            this.score = 10;
        }
        else if (rnd == 3) {
            result = Constants.PEACH_PATH;
            this.score = 8;
        }
        return result;
    }
    public void move() {
        this.moveFruit();
    }
    public void chop() {
        this.chopGraphically();
        this.splash();
    }
    public int getScore() {
        return this.score;
    }
}
