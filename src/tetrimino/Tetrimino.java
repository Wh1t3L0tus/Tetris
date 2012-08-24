package tetrimino;

import java.util.ArrayList;
import org.newdawn.slick.Image;

import arrays.Board;
import coordinate.Coordinate;


public abstract class Tetrimino {
	protected ArrayList<Coordinate> blockList;
	protected ArrayList<Coordinate> dList;
	protected ArrayList<Coordinate> lList;
	protected ArrayList<Coordinate> rList;
	protected int rotationLevel;
	private Image texture;
	
	public Tetrimino(Image texture, int rotationLevel) {
		this.texture = texture;
		this.rotationLevel = rotationLevel;
	}
	
	public void eraseTexture(Board b) {
		for (int i = 0; i < blockList.size(); i++) {
			b.getMatrix().get(blockList.get(i).y * b.getWidth() + blockList.get(i).x).setTexture(null);
			b.getMatrix().get(blockList.get(i).y * b.getWidth() + blockList.get(i).x).setBlank(true);
		}
	}
	
	public void setTexture(Board b) {
		for (int i = 0; i < blockList.size(); i++) {
			b.getMatrix().get(blockList.get(i).y * b.getWidth() + blockList.get(i).x).setTexture(texture);
			b.getMatrix().get(blockList.get(i).y * b.getWidth() + blockList.get(i).x).setBlank(false);
		}
	}
	
	public void goToLeft(Board b) {
		this.eraseTexture(b);
		for (int i = 0; i < blockList.size(); i++)
			blockList.get(i).x--;
		this.setTexture(b);
		
	}
	
	public void goToRight(Board b) {
		this.eraseTexture(b);
		for (int i = 0; i < blockList.size(); i++)
			blockList.get(i).x++;
		this.setTexture(b);		
	}
	
	public void goDown(Board b) {
		this.eraseTexture(b);
		for (int i = 0; i < blockList.size(); i++)
			blockList.get(i).y++;
		this.setTexture(b);
	}
	
	public void setBlockList(ArrayList<Coordinate> list) {
		blockList = list;
	}
	
	public ArrayList<Coordinate> getBlockList() {
		return blockList;
	}
	
	public void setDlist(ArrayList<Coordinate> list) {
		dList = list;
	}
	
	public ArrayList<Coordinate> getDlist() {
		return dList;
	}
	
	public void setLlist(ArrayList<Coordinate> list) {
		lList = list;
	}
	
	public ArrayList<Coordinate> getLlist() {
		return lList;
	}
	
	public void setRlist(ArrayList<Coordinate> list) {
		rList = list;
	}
	
	public ArrayList<Coordinate> getRlist() {
		return rList;
	}
	
	public abstract void rotate();

}
