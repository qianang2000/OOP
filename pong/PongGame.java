package pong;

import cs15.prj.pongSupport.CS15Ball;
import cs15.prj.pongSupport.CS15Paddle;
import cs15.prj.pongSupport.CS15PongGameSupport;

/**
 * This is the PongGame class. You should read the JavaDocs for this class, before
 * coding here.
 *
 * Remember to use the support methods for this class, which you can find in
 * the Javadocs.
 */
public class PongGame extends CS15PongGameSupport {

    //TODO Declare all instance variables here
    private int leftScore;
    private int rightScore;
    private boolean isLeftPaddle;
    private CS15Paddle lpaddle;
    private CS15Paddle rpaddle;
    private CS15Ball ball;
    private boolean startMovingLeft;
    public PongGame() {
        super();
        // Don't remove the line above!
        //TODO Initialize all instance variables here to setup the game
        this.leftScore = 0;
        this.rightScore = 0;
        this.updateScoreLabels(this.leftScore, this.rightScore);
        this.isLeftPaddle = true;
        this.lpaddle = new CS15Paddle(this.isLeftPaddle);
        this.rpaddle = new CS15Paddle(!this.isLeftPaddle);
        this.startMovingLeft = true;
        this.ball = new CS15Ball(this.startMovingLeft);
    }

    //TODO Fill in all the methods below

    /**
     * This method is called automatically when the "w" key is pressed and
     * triggers the left paddle to move up.
     */
    @Override
    public void onWPressed() {
        this.lpaddle.moveUp();
    }

    @Override
    public void onSPressed() {
        this.lpaddle.moveDown();
    }

    @Override
    public void onUpPressed() {
        this.rpaddle.moveUp();
    }

    @Override
    public void onDownPressed() {
        this.rpaddle.moveDown();
    }

    @Override
    public void eachSecond() {
        this.ball.updatePosition();
        this.lpaddle.checkCollision(this.ball);
        this.rpaddle.checkCollision(this.ball);
    }

    /*
    All the methods in this class are called AUTOMATICALLY in specific situations.
    That means you DON'T need to check *when* the ball moves off screen, just fill in
    what should happen once it *does* move off screen.

    Read the Javadocs for more information about how to implement the method
    definitions.

    You can remove this comment before submitting!
    */

    @Override
    public void ballOffScreenLeft() {
        this.rightScore += 1;
        this.updateScoreLabels(this.leftScore, this.rightScore);
        this.checkWinner(this.leftScore, this.rightScore);
        this.ball = new CS15Ball(!this.startMovingLeft);
    }

    @Override
    public void ballOffScreenRight() {
        this.leftScore += 1;
        this.updateScoreLabels(this.leftScore, this.rightScore);
        this.checkWinner(this.leftScore, this.rightScore);
        this.ball = new CS15Ball(this.startMovingLeft);
    }

    //TODO Write your own helper method for starting the next round
}
