package com.yaxu.learnspringframework;

import com.yaxu.learnspringframework.game.GameRunner;
import com.yaxu.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
