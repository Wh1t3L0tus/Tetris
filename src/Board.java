import java.util.ArrayList;


public class Board {
	
	private ArrayList<Block> matrix;
	private Tetrimino tetrimino;
	private int width;
	private int height;
	
	public Board(int width, int height) {
		this.height = height+5;
		this.width = width+2;
		this.matrix = new ArrayList<Block> (this.width*this.height);
		/*+2 pour les bordure à droite et à gauche de la matrice, +5 pour la bordure en bas et les quatres lignes en haut où apparetront les tetrimino*/
	}
	
	public Board() {
		this(10,22);
	}
	
	public ArrayList<Block> getMatrix() {
		return matrix;
	}
	public void setMatrix(ArrayList<Block> matrix) {
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
	
	
}
