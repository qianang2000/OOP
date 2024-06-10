package fruitninja;

import cs15.prj.fruitNinjaSupport.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class Bomb extends CS15Bomb implements Object {
      public Bomb() {
          super();
      }
      public void move() {
            this.moveBomb();
      }
      public void chop() {
            this.explode();
      }
      public int getScore() {
            return 0;
      }
}
