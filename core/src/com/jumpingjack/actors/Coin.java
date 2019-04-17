package com.jumpingjack.actors;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.framework.BaseActor;

public class Coin extends BaseActor {

	/*------------------------------------------------------------------*\
	|*							Constructors							*|
	\*------------------------------------------------------------------*/

    public Coin(float x, float y, Stage s) {
        super(x, y, s);
        loadAnimationFromSheet("items/coin.png", 1, 6, 0.1f, true);

        Action pulse = Actions.sequence(Actions.scaleTo(1.1f, 1.1f, 0.5f), Actions.scaleTo(1.0f, 1.0f, 0.5f));
        addAction(Actions.forever(pulse));
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
