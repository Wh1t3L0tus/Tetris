import java.util.ArrayList;

import org.newdawn.slick.Image;


public abstract class Tetrimino {
	private ArrayList<Coordinate> blockList;
	private ArrayList<Coordinate> dList;
	private ArrayList<Coordinate> lList;
	private ArrayList<Coordinate> rList;
	private int rotationLevel;
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
	
	public void setList(ArrayList<Coordinate> list) {
		
	}
	
	public ArrayList<Coordinate> getList() {
		return null;
	}
	
	public abstract void rotate();

}
