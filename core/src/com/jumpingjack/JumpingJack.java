package com.jumpingjack;

import com.framework.BaseGame;
import com.jumpingjack.screens.LevelScreen;

public class JumpingJack extends BaseGame {

	public void create() {
		super.create();
	    setActiveScreen(new LevelScreen());
    }
}
