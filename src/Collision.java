import java.util.ArrayList;


public class Collision {

	public static boolean detectDown(Board board, ArrayList<Coordinate> dList){
		for (int i = 0; i < dList.size(); i++) {
			if (board.getMatrix().get(dList.get(i).y+1 * board.getWidth() + dList.get(i).x).getBlank() == false) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean detectRight(Board board, ArrayList<Coordinate> rList){
		for (int i = 0; i < rList.size(); i++) {
			if (board.getMatrix().get(rList.get(i).y * board.getWidth() + rList.get(i).x+1).getBlank() == false) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean detectLeft(Board board, ArrayList<Coordinate> lList){
		for (int i = 0; i < lList.size(); i++) {
			if (board.getMatrix().get(lList.get(i).y * board.getWidth() + lList.get(i).x-1).getBlank() == false) {
				return true;
			}
		}
		return false;
	}
}
