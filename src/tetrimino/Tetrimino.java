package tetrimino;

import org.newdawn.slick.Image;

import arrays.Board;
import coordinate.Coordinate;


public abstract class Tetrimino {
	protected Coordinate blockList[]; /* list of the blocks which the tetrimino is composed of */ 
	protected Coordinate dList[]; /* list of tetrimino's blocks which are at the bottom of the tetrimino */
	protected Coordinate lList[]; /* list of tetrimino's blocks which are at the left of the tetrimino */
	protected Coordinate rList[]; /* list of tetrimino's blocks which are at the right of the tetrimino */
	protected int rotationLevel;
	protected Image texture;
	
	public Tetrimino() {
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
	
	public Image getTexture() {
		return texture;
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
	
	public int getRotationLevel() {
		return rotationLevel;
	}

	public void setRotationLevel(int rotationLevel) {
		this.rotationLevel = rotationLevel;
	}

	public abstract void rotate();

}
