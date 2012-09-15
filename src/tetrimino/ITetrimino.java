package tetrimino;

import org.newdawn.slick.Image;

import coordinate.Coordinate;

public class ITetrimino extends Tetrimino {

	public ITetrimino(Image img) {
		super(img);
		super.blockList = new Coordinate[4]; //The coordinates correspond to the Next Matrix
		super.dList = new Coordinate[4];
		super.rList = new Coordinate[4];
		super.lList = new Coordinate[4];
		
		super.blockList[0] = new Coordinate(1, 0);
		super.lList[0] = super.blockList[0];
		super.rList[0] = super.blockList[0];
		
		super.blockList[1] = new Coordinate(1, 1);
		super.lList[1] = super.blockList[1];
		super.rList[1] = super.blockList[1];
		
		super.blockList[2] = new Coordinate(1, 2);
		super.lList[2] = super.blockList[2];
		super.rList[2] = super.blockList[2];
		
		super.blockList[3] = new Coordinate(1, 3);
		super.lList[3] = super.blockList[3];
		super.rList[3] = super.blockList[3];
		super.dList[0] = super.blockList[3];
		
		super.rotationLevel = 1;
	}
	
	@Override
	public void rotate() {
		// TODO Auto-generated method stub

	}

}
