package tetrimino;

import ressource.RessourceManager;
import coordinate.Coordinate;


public class OTetrimino extends Tetrimino {
	
	public OTetrimino() {
			super.texture=RessourceManager.getYellowBlock();
			super.blockList = new Coordinate[4]; //The coordinates correspond to the Next Matrix
			super.dList = new Coordinate[4];
			super.rList = new Coordinate[4];
			super.lList = new Coordinate[4];
			
			super.blockList[0] = new Coordinate(1, 2);
			super.lList[0] = super.blockList[0];//is on the top left hand corner
			
			super.blockList[1] = new Coordinate(2, 2);
			super.rList[0] = super.blockList[1];//is on the top right hand corner
			
			super.blockList[2] = new Coordinate(1, 3);
			super.lList[1] = super.blockList[2];//is on the bottom left hand corner
			super.dList[0] = super.blockList[2];
			
			super.blockList[3] = new Coordinate(2, 3);
			super.rList[1] = super.blockList[3];//is on the bottom right hand corner
			super.dList[1] = super.blockList[3];
			
			super.rotationLevel = 1;
	}

	@Override
	public void rotate() {		
	}

}
