package tetrimino;

import ressource.RessourceManager;
import coordinate.Coordinate;

public class LTetrimino extends Tetrimino {

	public LTetrimino() {
		super.texture=RessourceManager.getBlueBlock();
		super.blockList = new Coordinate[4]; //The coordinates correspond to the Next Matrix
		super.dList = new Coordinate[4];
		super.rList = new Coordinate[4];
		super.lList = new Coordinate[4];
		
		super.blockList[0] = new Coordinate(1, 1);
		super.lList[0] = super.blockList[0];
		
		super.blockList[1] = new Coordinate(1, 2);
		super.lList[1] = super.blockList[1];
		
		super.blockList[2] = new Coordinate(1, 3);
		super.lList[2] = super.blockList[2];
		super.dList[0] = super.blockList[2];
		
		super.blockList[3] = new Coordinate(2, 3);
		super.rList[0] = super.blockList[3];
		super.dList[1] = super.blockList[3];
		
		super.rotationLevel = 1;
	}
	
	public void rotate() {
		if (super.rotationLevel==1){
			super.blockList[0].x=super.blockList[0].x+1;
			super.blockList[0].y=super.blockList[0].y+1;
			super.blockList[2].x=super.blockList[2].x-1;
			super.blockList[2].y=super.blockList[2].y-1;
			super.blockList[3].x=super.blockList[3].x-2;
			
			super.dList[0]=super.blockList[3];
			super.dList[1]=null;
			
			super.lList[0]=blockList[2];
			super.lList[1]=blockList[3];
			super.lList[2]=null;
			
			super.rList[0]=blockList[0];
			
			super.rotationLevel=2;
		}
		
		if (super.rotationLevel==2){
			super.blockList[0].x=super.blockList[0].x-1;
			super.blockList[0].y=super.blockList[0].y+1;
			super.blockList[2].x=super.blockList[2].x+1;
			super.blockList[2].y=super.blockList[2].y-1;
			super.blockList[3].y=super.blockList[3].y-2;
			
			super.dList[0]=super.blockList[0];
			
			super.lList[0]=super.blockList[3];
			super.lList[1]=null;
			
			for (int i=0; i<3; i++){
				super.rList[i]=super.blockList[i];
			}
			
			super.rotationLevel=3;
		}
		
		if (super.rotationLevel==3){
			super.blockList[0].x=super.blockList[0].x-1;
			super.blockList[0].y=super.blockList[0].y-1;
			super.blockList[2].x=super.blockList[2].x+1;
			super.blockList[2].y=super.blockList[2].y+1;
			super.blockList[3].x=super.blockList[3].x+2;
			
			for (int i=0; i<3; i++){
				super.dList[i]=super.blockList[i];
			}
			
			super.lList[0]=super.blockList[0];
			
			super.rList[0]=super.blockList[2];
			super.rList[1]=super.blockList[3];
			super.rList[2]=null;
			
			super.rotationLevel=4;
		}
		
		if (super.rotationLevel==4){
			super.blockList[0].x=super.blockList[0].x+1;
			super.blockList[0].y=super.blockList[0].y-1;
			super.blockList[2].x=super.blockList[2].x-1;
			super.blockList[2].y=super.blockList[2].y+1;
			super.blockList[3].y=super.blockList[3].y+2;
			
			super.dList[0]=super.blockList[2];
			super.dList[1]=super.blockList[3];
			super.dList[2]=null;
			
			for (int i=0; i<3; i++){
				super.lList[i]=super.blockList[i];
			}
			
			super.rList[0]=super.blockList[3];
			super.rList[1]=null;
			
			super.rotationLevel=1;
		}
	}

}
