package arrays;

import coordinate.Coordinate;
import tetrimino.*;
import block.Block;

public class Next {
	
	private Block matrix[];
	private Tetrimino tetrimino;
	private Coordinate coordinate;
	
	public Next() {
		this.matrix = new Block[4*4];
		this.coordinate = new Coordinate();
		for (int i = 0; i < matrix.length; i++)
			this.matrix[i] = new Block(true);
		generateTetrimino();
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
	
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public Tetrimino generateTetrimino() {
		int n = (int) Math.random() * 7;
		Tetrimino t = null;
		Tetrimino toReturn = tetrimino;
		if (n == 0)
			t = new ITetrimino();
		else if (n == 1)
			t = new JTetrimino();
		else if (n == 2)
			t = new LTetrimino();
		else if (n == 3)
			t = new OTetrimino();
		else if (n == 4)
			t = new STetrimino();
		else if (n == 5)
			t = new TTetrimino();
		else
			t = new ZTetrimino();
		
		tetrimino = t;
		for (int i = 0; i < tetrimino.getBlockList().length; i++) {
			Coordinate c = tetrimino.getBlockList()[i];
			matrix[c.y * 4 + c.x].setTexture(tetrimino.getTexture());
		}
		return toReturn;
		
	}
	
	public void render() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (matrix[i * 4 + j] != null)
					matrix[i * 4 + j].render(new Coordinate(coordinate.x + (j * tetrimino.getTexture().getWidth()), coordinate.y + (i * tetrimino.getTexture().getHeight())));
			}
		}
	}
}
