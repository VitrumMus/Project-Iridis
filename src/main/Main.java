package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * User: hamdan
 * Date: 2013-05-29
 * Time: 9:26 PM
 */
public class Main extends StateBasedGame {

	private static final String  GAME_TITLE                     = "Project Iridis";
	private static final boolean IS_MOUSE_GRABBED_INITIALLY     = false;
	private static final int     GAME_SCREEN_WIDTH_IN_PIXELS    = 1280;
	private static final int     GAME_SCREEN_HEIGHT_IN_PIXELS   = 720;
	private static final boolean IS_GAME_FULL_SCREEN            = false;
	private static final int     GAME_TARGET_FRAME_RATE         = 60;
	private static final boolean IS_GAME_WINDOW_RESIZEABLE      = false;
	private static final boolean IS_VERTICAL_SYNCHRONISATION_ON = true;

	public static void main(String[] args) throws SlickException {
		// can throw SlickException
		AppGameContainer appGameContainer = new AppGameContainer(new Main(GAME_TITLE));

		// set appGameContainer's properties
		appGameContainer.setTitle(GAME_TITLE);
		appGameContainer.setMouseGrabbed(IS_MOUSE_GRABBED_INITIALLY);
		appGameContainer.setVSync(IS_VERTICAL_SYNCHRONISATION_ON);
		appGameContainer.setDisplayMode(GAME_SCREEN_WIDTH_IN_PIXELS, GAME_SCREEN_HEIGHT_IN_PIXELS, IS_GAME_FULL_SCREEN);
		appGameContainer.setTargetFrameRate(GAME_TARGET_FRAME_RATE);
		appGameContainer.setResizable(IS_GAME_WINDOW_RESIZEABLE);
		appGameContainer.start();
	}

	public Main(String title) {
		super(title);
	}

	public void initStatesList(GameContainer gameContainer) throws SlickException {
		addState(new a());
	}

}
