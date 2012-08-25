package tetrimino;

import org.newdawn.slick.Image;

import arrays.Board;
import coordinate.Coordinate;


public abstract class Tetrimino {
	protected Coordinate blockList[];
	protected Coordinate dList[];
	protected Coordinate lList[];
	protected Coordinate rList[];
	protected int rotationLevel;
	private Image texture;
	
	public Tetrimino(Image texture, int rotationLevel) {
		this.texture = texture;
		this.rotationLevel = rotationLevel;
	}
	
	public void eraseTexture(Board b) {
		for (int i = 0; i < blockList.length; i++) {
			b.getMatrix()[blockList[i].y * b.getWidth() + blockList[i].x].setTexture(null);
			b.getMatrix()[blockList[i].y * b.getWidth() + blockList[i].x].setBlank(true);
		}
	}
	
	public void setTexture(Board b) {
		for (int i = 0; i < blockList.length; i++) {
			b.getMatrix()[blockList[i].y * b.getWidth() + blockList[i].x].setTexture(texture);
			b.getMatrix()[blockList[i].y * b.getWidth() + blockList[i].x].setBlank(false);
		}
	}
	
	public void goToLeft(Board b) {
		this.eraseTexture(b);
		for (int i = 0; i < blockList.length; i++)
			blockList[i].x--;
		this.setTexture(b);
		
	}
	
	public void goToRight(Board b) {
		this.eraseTexture(b);
		for (int i = 0; i < blockList.length; i++)
			blockList[i].x++;
		this.setTexture(b);		
	}
	
	public void goDown(Board b) {
		this.eraseTexture(b);
		for (int i = 0; i < blockList.length; i++)
			blockList[i].y++;
		this.setTexture(b);
	}
	
	public void setBlockList(Coordinate list[]) {
		blockList = list;
	}
	
	public Coordinate[] getBlockList() {
		return blockList;
	}
	
	public void setDlist(Coordinate list[]) {
		dList = list;
	}
	
	public Coordinate[] getDlist() {
		return dList;
	}
	
	public void setLlist(Coordinate list[]) {
		lList = list;
	}
	
	public Coordinate[] getLlist() {
		return lList;
	}
	
	public void setRlist(Coordinate list[]) {
		rList = list;
	}
	
	public Coordinate[] getRlist() {
		return rList;
	}
	
	public abstract void rotate();

}
