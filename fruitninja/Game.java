package fruitninja;

import cs15.prj.fruitNinjaSupport.CS15FruitNinjaFrame;
import cs15.prj.fruitNinjaSupport.CS15FruitNinjaGame;
import cs15.prj.fruitNinjaSupport.CS15ScoreController;
import cs15.prj.fruitNinjaSupport.CS15Blade;
import cs15.prj.fruitNinjaSupport.Constants;
import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends CS15FruitNinjaGame {
    private CS15Blade blade;
    private CS15ScoreController scoreController;
    public Game() {
        this.blade = new CS15Blade("myBlade");
        this.scoreController = new CS15ScoreController();
        this.addBlade(this.blade);
        this.updateChoppable(this.launchItem());
    }
    public void updateChoppable(Object object) {
        object.move();
        if (this.blade.checkIntersection(object)) {
            object.chop();
            this.scoreController.addToScore(object.getScore());
        }
    }
    public CS15ScoreController getController() {
        return this.scoreController;
    }
    @Override
    public Object launchItem() {
        int rnd = (int)(Math.random() * 4);
        if (rnd <= 2) {
            Fruit fruit = new Fruit();
            fruit.ripen();
            fruit.wash();
            return fruit;
        }
        else {
            return new Bomb();
        }
    }

    /* Do not modify anything below this line! */
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
