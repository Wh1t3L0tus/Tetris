package tetrimino;


import ressource.RessourceManager;
import coordinate.Coordinate;

public class ITetrimino extends Tetrimino {

	public ITetrimino() {
		super.texture=RessourceManager.getLightBlueBlock();
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
	
	public void rotate() {
		if (super.rotationLevel==1){
			super.blockList[0].x=super.blockList[0].x+2;
			super.blockList[0].y=super.blockList[0].y+2;
			super.blockList[1].x=super.blockList[1].x+1;
			super.blockList[1].y=super.blockList[1].y+1;
			super.blockList[3].x=super.blockList[3].x-1;
			super.blockList[3].y=super.blockList[3].y-1;
			
			for (int i=0; i<4; i++){
				super.dList[i]=super.blockList[i];
			}
			
			super.lList[0]=super.blockList[3];
			super.rList[0]=super.blockList[0];
			for (int i=1; i<4; i++){
				super.lList[i]=null;
				super.rList[i]=null;
			}
			
			super.rotationLevel = 2;
		}
		
		if (super.rotationLevel==2){
			super.blockList[0].x=super.blockList[0].x-2;
			super.blockList[0].y=super.blockList[0].y-2;
			super.blockList[1].x=super.blockList[1].x-1;
			super.blockList[1].y=super.blockList[1].y-1;
			super.blockList[3].x=super.blockList[3].x+1;
			super.blockList[3].y=super.blockList[3].y+1;
			
			super.dList[0]=super.blockList[3];
			for (int i=1; i<4; i++){
				super.dList[i]=null;
			}
			
			for (int i=0; i<4; i++){
				super.lList[i]=super.blockList[i];
				super.rList[i]=super.blockList[i];
			}
			
			super.rotationLevel=1;
		}
	}

}
