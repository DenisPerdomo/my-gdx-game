package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	int width, height, imgWidth, imgHeight;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("piano.png");
		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		imgWidth = img.getWidth();
		imgHeight = img.getHeight();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor((float)60/255,(float)181/255,0f,0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.draw(img, width-imgWidth, height-imgHeight);
		batch.draw(img, width-imgWidth, 0);
		batch.draw(img, 0, height-imgHeight);
		batch.draw(img, 200,200,250,250);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
