package com.ngtech.spaceflight.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ngtech.spaceflight.OpenSpaceFlight;

/**
 * Desktop launcher. launches game from module core (Class OpenSpaceFight).
 *
 * @author Nikita S.
 * @version 1.0
 * @since 1.0
 */
public class DesktopLauncher {

	/**
	 * Launch game
	 *
	 * @since 1.0
	 * @param arg - game arguments
	 */
	public static void main (String[] arg) {
		//Create application config
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//Desktop launching config
		config.fullscreen = true; //Set fullscreen mode
		config.height = OpenSpaceFlight.HEIGHT; //Set height to 1080
		config.width = OpenSpaceFlight.WIDTH; // Set width to 1920

		//Launch game
		new LwjglApplication(new OpenSpaceFlight(), config);
	}
}
