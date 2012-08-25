package collision;

import coordinate.Coordinate;
import arrays.Board;


public class Collision {

	public static boolean detectDown(Board board, Coordinate dList[]){
		for (int i = 0; i < dList.length; i++) {
			if (board.getMatrix()[dList[i].y+1 * board.getWidth() + dList[i].x].getBlank() == false) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean detectRight(Board board, Coordinate rList[]){
		for (int i = 0; i < rList.length; i++) {
			if (board.getMatrix()[rList[i].y * board.getWidth() + rList[i].x+1].getBlank() == false) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean detectLeft(Board board, Coordinate lList[]){
		for (int i = 0; i < lList.length; i++) {
			if (board.getMatrix()[lList[i].y * board.getWidth() + lList[i].x-1].getBlank() == false) {
				return true;
			}
		}
		return false;
	}
}
