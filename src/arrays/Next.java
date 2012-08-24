package arrays;

import java.util.ArrayList;
import tetrimino.*;
import block.Block;

public class Next {
	
	private ArrayList<Block> matrix;
	private Tetrimino tetrimino;
	
	public Next() {
		this.matrix = new ArrayList<Block> (4*4);
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
}
