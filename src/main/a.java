package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * User: hamdan
 * Date: 2013-06-02
 * Time: 12:10 AM
 */
public class a extends BasicGameState {


	public int getID() {
		return 0;
	}

	public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {

	}

	public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
		Image i = new Image("Untitled.png");
		Image i2 = new Image("Untitled2.png");
		Image i3 = new Image("a.png");
		Image i4 = new Image("1.png");
		graphics.scale(3f, 3f);
		i.draw(10, 10);
		i2.draw(120, 10);
		i3.draw(230, 10);
		i4.draw(10, 120);
	}

	public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {

	}

}
