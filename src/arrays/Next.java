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
	
	public void render() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (matrix[i * 4 + j] != null)
					matrix[i * 4 + j].render(new Coordinate(coordinate.x + (j * tetrimino.getTexture().getWidth()), coordinate.y + (i * tetrimino.getTexture().getHeight())));
			}
		}
	}
}
