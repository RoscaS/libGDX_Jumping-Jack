package com.framework.desktop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.mygame.JumpingJack;

public class DesktopLauncher {
	public static void main (String[] arg) {

		Game myGame = new JumpingJack();
		LwjglApplication launcher = new LwjglApplication(myGame, "Jumping Jack", 800, 600);
	}
}
