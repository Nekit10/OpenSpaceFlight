package com.ngtech.spaceflight.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ngtech.spaceflight.openSpaceFlight;

/**
 * Desktop launcher. launches game from module core (Class OpenSpaceFight).
 *
 * @author Nikita S.
 * @version 1.0
 * @since 1.0
 */
public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//Desktop launching config
		config.fullscreen = true;
		config.height = 1080;
		config.width = 1920;

		new LwjglApplication(new openSpaceFlight(), config);
	}
}
