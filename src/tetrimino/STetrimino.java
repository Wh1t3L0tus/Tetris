package tetrimino;

import ressource.RessourceManager;
import coordinate.Coordinate;

public class STetrimino extends Tetrimino {

	public STetrimino() {
		super.texture=RessourceManager.getRedBlock();
		super.blockList = new Coordinate[4]; //The coordinates correspond to the Next Matrix
		super.dList = new Coordinate[4];
		super.rList = new Coordinate[4];
		super.lList = new Coordinate[4];
		
		super.blockList[0] = new Coordinate(1, 2);
		
		super.blockList[1] = new Coordinate(2, 2);
		super.rList[0] = super.blockList[1];
		
		super.blockList[2] = new Coordinate(0, 3);
		super.lList[0] = super.blockList[2];
		super.dList[0] = super.blockList[2];
		
		super.blockList[3] = new Coordinate(1, 3);
		super.dList[1] = super.blockList[3];
		
		super.rotationLevel = 1;
	}
	
	public void rotate() {
		if (super.rotationLevel==1){
			super.blockList[1].x=super.blockList[1].x-1;
			super.blockList[1].y=super.blockList[1].y+1;
			super.blockList[2].y=super.blockList[2].y-2;
			super.blockList[3].x=super.blockList[3].x-1;
			super.blockList[3].y=super.blockList[3].y-1;
			
			super.dList[0]=super.blockList[1];
			super.dList[1]=null;
			
			super.lList[0]=super.blockList[2];
			super.lList[1]=super.blockList[3];
			
			super.rList[0]=super.blockList[0];
			super.rList[1]=super.blockList[1];
			
			super.rotationLevel=2;
		}
		
		if (super.rotationLevel==2){
			super.blockList[1].x=super.blockList[1].x+1;
			super.blockList[1].y=super.blockList[1].y-1;
			super.blockList[2].y=super.blockList[2].y+2;
			super.blockList[3].x=super.blockList[3].x+1;
			super.blockList[3].y=super.blockList[3].y+1;
			
			super.dList[0]=super.blockList[2];
			super.dList[1]=super.blockList[3];
			
			super.lList[0]=super.blockList[2];
			super.lList[1]=null;
			
			super.rList[0]=super.blockList[0];
			super.rList[1]=null;
			
			super.rotationLevel=1;
		}

	}

}
