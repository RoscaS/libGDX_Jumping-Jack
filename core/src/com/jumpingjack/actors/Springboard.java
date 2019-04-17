package com.jumpingjack.actors;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.framework.BaseActor;

public class Springboard extends BaseActor {

	/*------------------------------------------------------------------*\
	|*							Constructors							*|
	\*------------------------------------------------------------------*/

    public Springboard(float x, float y, Stage s) {
        super(x, y, s);
        loadAnimationFromSheet("items/springboard.png", 1, 3, 0.2f, true);
    }

	/*------------------------------------------------------------------*\
	|*							Public Methods 							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Getters			*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Setters			*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Private Methods 						*|
	\*------------------------------------------------------------------*/
}
