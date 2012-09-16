package game;

import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import collision.Collision;

import coordinate.Coordinate;

import arrays.*;

public class Tetris {
	private Score score;
	private Board board;
	private Next nextTetrimino;
	private long time;
	private long lastTime;
	private long quantum;
	private Input event;
	
	public Tetris(Input e) {
		time = 0;
		lastTime = 0;
		quantum = 1000;
		event = e;
		board = new Board();
		nextTetrimino = new Next();
		try {
			score = new Score(new Coordinate(500, 200), 20, "font.ttf", "bin/bestscores.txt", Color.white);
		}		
		catch (IOException ie) {
			System.out.println(ie);
		}
		catch (SlickException se) {
			System.out.println(se);
		}
		
	}
	
	public void update(int delta) {
		time += delta;
		if (event.isKeyDown(Input.KEY_LEFT) && !Collision.detectLeft(board, board.getTetrimino())) {
			board.getTetrimino().goToLeft(board);
		}
		else if (event.isKeyDown(Input.KEY_RIGHT) && !Collision.detectRight(board, board.getTetrimino())) {
			board.getTetrimino().goToRight(board);
		}
		else if (event.isKeyDown(Input.KEY_DOWN)) {
			 if (!Collision.detectDown(board, board.getTetrimino())) {
				time = 0;
				board.getTetrimino().goDown(board);
			 }
			 else {
				 score.increase(board.eraseLines());
				 board.setTetrimino(nextTetrimino.generateTetrimino());
			 }
		}
		else if (event.isKeyDown(Input.KEY_UP) && !Collision.detectRotation(board, board.getTetrimino())) {
			board.getTetrimino().rotate();			
		}
		
		if (time - lastTime >= quantum) {
			if (Collision.detectDown(board, board.getTetrimino())) {
				 score.increase(board.eraseLines());
				 board.setTetrimino(nextTetrimino.generateTetrimino());
			}
			else
				board.getTetrimino().goDown(board);
		}
	}
	
	public void render() {
		board.render();
		nextTetrimino.render();
		score.render();
	}
}
