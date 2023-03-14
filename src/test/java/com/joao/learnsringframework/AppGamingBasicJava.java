package com.joao.learnsringframework;

import com.joao.learnsringframework.game.GameRunner;
import com.joao.learnsringframework.game.MarioGame;
import com.joao.learnsringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
