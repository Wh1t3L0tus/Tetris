import game.Tetris;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import ressource.RessourceManager;


public class Main extends BasicGame {
	
	private Tetris ourTetris;
	
	public static void main(String args[]) throws SlickException {
		AppGameContainer tetrisApp = new AppGameContainer(new Main("Work In Progress"));
		tetrisApp.setDisplayMode(800, 600, false);
		tetrisApp.start();
	}

	public Main(String title) {
		super(title);
	}
	
	@Override
	public void init(GameContainer gc) throws SlickException {
			RessourceManager.loadRessources();//let the app crash if we are unable to load the resources ?
			ourTetris = new Tetris(gc.getInput());		
	}

	@Override
	public void update(GameContainer arg0, int delta) throws SlickException {
		//if we want to pause the game we can call the (future) pause() Tetris method if a specified key is pressed
		ourTetris.update(delta);
	}
	
	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
		ourTetris.render();
	}

}
