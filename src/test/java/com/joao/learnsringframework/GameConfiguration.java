package com.joao.learnsringframework;

import com.joao.learnsringframework.game.GameRunner;
import com.joao.learnsringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    };
    @Bean GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}


