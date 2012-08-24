import java.util.ArrayList;

import org.newdawn.slick.Image;


public class OTetrimino extends Tetrimino {
	
	public OTetrimino(Image img) {
			super(img, 1);
			super.blockList = new ArrayList<Coordinate>();
			super.dList = new ArrayList<Coordinate>();
			super.rList = new ArrayList<Coordinate>();
			super.lList = new ArrayList<Coordinate>();
			
			super.blockList.add(new Coordinate());
			super.lList.add(super.blockList.get(0));
			
			super.blockList.add(new Coordinate(0, 1));
			super.rList.add(super.dList.get(1));
			
			super.blockList.add(new Coordinate(1, 0));
			super.lList.add(super.blockList.get(2));
			super.dList.add(super.blockList.get(2));
			
			super.blockList.add(new Coordinate(1, 1));
			super.rList.add(super.blockList.get(3));
			super.dList.add(super.blockList.get(3));
	}

	@Override
	public void rotate() {		
	}

}
