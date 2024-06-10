package andybot;

import cs15.prj.andyBotSupport.CS15MazeSolverSupport;
import cs15.prj.andyBotSupport.CS15Robot;

public class MazeSolver extends CS15MazeSolverSupport {


    public MazeSolver(CS15Robot andyBot) {
        // **Please do not alter this part of the code**
        super();
        this.solve(andyBot);
    }

    public void solve(CS15Robot andyBot) {
        andyBot.moveUp(1);
        andyBot.shuffleLeft(2);
        andyBot.moveUp(2);
        andyBot.shuffleLeft(1);
        andyBot.moveUp(1);
        andyBot.shuffleLeft(1);
        andyBot.moveUp(2);
        andyBot.shuffleRight(3);
        andyBot.moveUp(2);
        andyBot.shuffleRight(2);
        this.solveRoadBlock(this.getHint());
        andyBot.moveUp(2);
    }

    public void solveRoadBlock(int x) {
        this.enterPassword(4 * x - 6);
    }
}
