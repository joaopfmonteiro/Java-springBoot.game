package com.joao.learnsringframework;

import com.joao.learnsringframework.game.GameRunner;
import com.joao.learnsringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GameSpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
