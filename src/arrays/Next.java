package arrays;

import tetrimino.*;
import block.Block;

public class Next {
	
	private Block matrix[];
	private Tetrimino tetrimino;
	
	public Next() {
		this.matrix = new Block[4*4];
	}
	
	public Block[] getMatrix() {
		return matrix;
	}
	public void setMatrix(Block matrix[]) {
		this.matrix = matrix;
	}
	public Tetrimino getTetrimino() {
		return tetrimino;
	}
	public void setTetrimino(Tetrimino tetrimino) {
		this.tetrimino = tetrimino;
	}
}
