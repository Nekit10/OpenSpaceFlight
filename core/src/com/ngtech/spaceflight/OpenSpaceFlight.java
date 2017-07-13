package com.ngtech.spaceflight;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

/**
 * Main class of game
 *
 * @author Nikita S.
 * @since 1.0
 * @version 1.0
 */
public class OpenSpaceFlight extends Game {

    //Resolution width
	public static final int WIDTH = 1920;
    //Resolution height
	public static final int HEIGHT = 1080;

	//Russian characters
	public static final String RUSSIAN_CHARACTERS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЪЫЬЭЮЯ"
			+ "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
			+ FreeTypeFontGenerator.DEFAULT_CHARS;
	//Batch
	public SpriteBatch batch;
	//Main font
	public BitmapFont mainfont;

    /**
     * Init batch and fonts
     */
	@Override
	public void create () {
	    //Create batch
		batch = new SpriteBatch();

		//Create font generator
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/IntourisTiqua.ttf"));
        //Create font params
        FreeTypeFontParameter parameter = new FreeTypeFontParameter();
        //Set characters to russian
        parameter.characters = RUSSIAN_CHARACTERS;
        //Generate font
        mainfont = generator.generateFont(parameter);
        //Dispose
        generator.dispose();

        //Change cursor
        Gdx.graphics.setSystemCursor(Cursor.SystemCursor.Crosshair);
	}

    /**
     * Run game rendering
     *
     * @since 1.0
     */
	@Override
	public void render () {
	    //Run super render name
		super.render();
	}

    /**
     * Clean
     *
     * @since 1.0
     */
	@Override
	public void dispose () {
	    //Dispose batch
		batch.dispose();
		//Dispose main font
		mainfont.dispose();
	}
}
