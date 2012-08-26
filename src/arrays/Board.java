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
	
	public void render() {
		for (int i = 4; i < height - 1; i++) {
			for (int j = 1; i < width - 1; j++) {
				matrix[i * width + j].render(new Coordinate(coordinate.x + (j * RessourceManager.getBlueBlock().getWidth()), coordinate.y + (i * RessourceManager.getBlueBlock().getHeight())));
			}
		}
	}
	
}
