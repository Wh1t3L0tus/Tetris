package tetrimino;

import org.newdawn.slick.Image;

import coordinate.Coordinate;

public class TTetrimino extends Tetrimino {

	public TTetrimino(Image img) {
		super(img);
		super.blockList = new Coordinate[4]; //The coordinates correspond to the Next Matrix
		super.dList = new Coordinate[4];
		super.rList = new Coordinate[4];
		super.lList = new Coordinate[4];
		
		super.blockList[0] = new Coordinate(0, 2);
		super.lList[0] = super.blockList[0];
		
		super.blockList[1] = new Coordinate(1, 2);
		
		super.blockList[2] = new Coordinate(2, 2);
		super.rList[0] = super.blockList[2];
		
		super.blockList[3] = new Coordinate(1, 3);
		super.dList[0] = super.blockList[3];
		
		super.rotationLevel = 1;
	}
	
	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

}
