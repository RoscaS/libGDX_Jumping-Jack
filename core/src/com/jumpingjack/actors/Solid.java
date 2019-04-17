package com.jumpingjack.actors;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.framework.BaseActor;

public class Solid extends BaseActor {

    private boolean enabled;

    /*------------------------------------------------------------------*\
   	|*							Constructors							*|
   	\*------------------------------------------------------------------*/

    public Solid(float x, float y, float width, float height, Stage s) {
        super(x, y, s);
        setSize(width, height);
        setBoundaryRectangle();
        enabled = true;
    }

	/*------------------------------------------------------------------*\
	|*							Public Methods 							*|
	\*------------------------------------------------------------------*/

    /*------------------------------*\
  	|*				Getters			*|
  	\*------------------------------*/

    public boolean isEnabled() {
        return enabled;
    }
    /*------------------------------*\
  	|*				Setters			*|
  	\*------------------------------*/

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /*------------------------------------------------------------------*\
	|*							Private Methods 						*|
	\*------------------------------------------------------------------*/
}
