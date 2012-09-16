package arrays;

import coordinate.Coordinate;
import ressource.RessourceManager;
import tetrimino.*;
import block.Block;


public class Board {
	
	private Block matrix[];
	private Tetrimino tetrimino;
	private int width;
	private int height;
	private Coordinate coordinate;
	
	public Board(int width, int height) {
		this.coordinate = new Coordinate();
		this.height = height+5;
		this.width = width+2;
		this.matrix = new Block[this.width*this.height];
		/*+2 pour les bordure à droite et à gauche de la matrice, +5 pour la bordure en bas et les quatres lignes en haut où apparetront les tetrimino*/
		/*initialiser les blocks ...*/
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				if (i == height - 1 && (i == 0 || i == this.height - 1))
					this.matrix[i * this.width + j] = new Block(false);
				else if (i == 0 || i == this.height - 1) {
					this.matrix[i * this.width] = new Block(false);
					this.matrix[i * this.width + this.height] = new Block(false);
				}
				else
					this.matrix[i * this.width + j] = new Block(true, RessourceManager.getEmptyBlock());
			}
		}
	}
	
	public Board() {
		this(10,22);
	}
	
	public Block[] getMatrix() {
		return matrix;
	}
	public void setMatrix(Block[] matrix) {
		this.matrix = matrix;
	}
	public Tetrimino getTetrimino() {
		return tetrimino;
	}
	public void setTetrimino(Tetrimino tetrimino) {
		this.tetrimino = tetrimino;
		for (int i = 0; i < this.tetrimino.getBlockList().length; i++) {
			Coordinate c = this.tetrimino.getBlockList()[i];
			matrix[c.y * this.width + (c.x + 4)].setBlank(false);
			matrix[c.y * this.width + (c.x + 4)].setTexture(this.tetrimino.getTexture());
		}
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setCoordinte(Coordinate c) {
		coordinate = c;
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public boolean isEmptyLine(int y) {
		boolean isFilled = true;
		for (int i = 1; i < width - 1 && isFilled; i++) {
			if (matrix[y * width + i].getBlank() == false)
				return false;
		}
		return true;
	}
	
	/** Copy the content of a line in another line
	 * 
	 * @param src the line to copy
	 * @param dest where to copy the line
	 */
	public void copyLine(int src, int dest) {
		for (int i = 1; i < width - 1; i++) {
			matrix[dest * width + i] = matrix[src * width + i]; 
		}
	}
	
	/** Manage the falling of Blocks when lines are empty
	 * 
	 */
	public void managePhysics() { //this function name is bad, any idea ?
		for (int i = height -1; i >= 4; i--) {
			if (isEmptyLine(i)) {
				copyLine(i - 1, i++);
				for (int j = i - 1; j >= 4; j--) 
					copyLine(j - 1, j);
			}
		}
	}
	
	public void eraseLines() {
		for (int i = 4; i < height - 1; i++) {
			boolean isFilled = true;
			for (int j = 1; j < width - 1 && isFilled; j++) {
				if (matrix[j * width + i].getBlank() == false)
					isFilled = false;
			}
			if (isFilled) {
				for (int j = 1; j < width - 1; i++) {
					matrix[j * width + i].setBlank(true);
					matrix[j * width + i].setTexture(null);
				}
			}
		}
		managePhysics();
	}
	
	public void render() {
		for (int i = 4; i < height - 1; i++) {
			for (int j = 1; i < width - 1; j++) {
				matrix[i * width + j].render(new Coordinate(coordinate.x + (j * RessourceManager.getBlueBlock().getWidth()), coordinate.y + (i * RessourceManager.getBlueBlock().getHeight())));
			}
		}
	}
	
}
