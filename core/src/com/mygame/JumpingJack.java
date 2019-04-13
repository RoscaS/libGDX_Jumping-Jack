package com.mygame;

import com.framework.BaseGame;
import com.mygame.screens.MainMenuScreen;

public class JumpingJack extends BaseGame {

	public void create() {
		super.create();
	    setActiveScreen(new MainMenuScreen());
    }
}
