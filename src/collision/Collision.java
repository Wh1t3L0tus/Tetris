package collision;

import tetrimino.*;
import arrays.Board;


public class Collision {

	public static boolean detectDown(Board board, Tetrimino tetrimino){
		for (int i = 0; i < tetrimino.getDlist().length; i++) {
			if (board.getMatrix()[tetrimino.getDlist()[i].y+1 * board.getWidth() + tetrimino.getDlist()[i].x].getBlank() == false) {
				return true;
			}
		}
		return false;
	}

	public static boolean detectRight(Board board, Tetrimino tetrimino){
		for (int i = 0; i < tetrimino.getRlist().length; i++) {
			if (board.getMatrix()[tetrimino.getRlist()[i].y * board.getWidth() + tetrimino.getRlist()[i].x+1].getBlank() == false) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean detectLeft(Board board, Tetrimino tetrimino){
		for (int i = 0; i < tetrimino.getLlist().length; i++) {
			if (board.getMatrix()[tetrimino.getLlist()[i].y * board.getWidth() + tetrimino.getLlist()[i].x-1].getBlank() == false) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean detectRotation(Board board, Tetrimino tetrimino){
		if (tetrimino instanceof ITetrimino){
			if (tetrimino.getRotationLevel() == 1 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+2 * board.getWidth() + tetrimino.getBlockList()[0].x+2].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[1].y+1 * board.getWidth() + tetrimino.getBlockList()[1].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y-1 * board.getWidth() + tetrimino.getBlockList()[3].x-1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 2 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-2 * board.getWidth() + tetrimino.getBlockList()[0].x-2].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[1].y-1 * board.getWidth() + tetrimino.getBlockList()[1].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y+1 * board.getWidth() + tetrimino.getBlockList()[3].x+1].getBlank() == false))){
				return true;
			}
		}
		if (tetrimino instanceof LTetrimino){
			if (tetrimino.getRotationLevel() == 1 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+1 * board.getWidth() + tetrimino.getBlockList()[0].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y-1 * board.getWidth() + tetrimino.getBlockList()[2].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y * board.getWidth() + tetrimino.getBlockList()[3].x-2].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 2 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+1 * board.getWidth() + tetrimino.getBlockList()[0].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y-1 * board.getWidth() + tetrimino.getBlockList()[2].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y-2 * board.getWidth() + tetrimino.getBlockList()[3].x].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 3 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-1 * board.getWidth() + tetrimino.getBlockList()[0].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y+1 * board.getWidth() + tetrimino.getBlockList()[2].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y * board.getWidth() + tetrimino.getBlockList()[3].x+2].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 4 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-1 * board.getWidth() + tetrimino.getBlockList()[0].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y+1 * board.getWidth() + tetrimino.getBlockList()[2].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y+2 * board.getWidth() + tetrimino.getBlockList()[3].x].getBlank() == false))){
				return true;
			}
		}
		if (tetrimino instanceof JTetrimino){
			if (tetrimino.getRotationLevel() == 1 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+1 * board.getWidth() + tetrimino.getBlockList()[0].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y-2 * board.getWidth() + tetrimino.getBlockList()[2].x].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y-1 * board.getWidth() + tetrimino.getBlockList()[3].x-1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 2 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+1 * board.getWidth() + tetrimino.getBlockList()[0].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y * board.getWidth() + tetrimino.getBlockList()[2].x+2].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y-1 * board.getWidth() + tetrimino.getBlockList()[3].x+1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 3 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-1 * board.getWidth() + tetrimino.getBlockList()[0].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y+2 * board.getWidth() + tetrimino.getBlockList()[2].x].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y+1 * board.getWidth() + tetrimino.getBlockList()[3].x+1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 4 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-1 * board.getWidth() + tetrimino.getBlockList()[0].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y * board.getWidth() + tetrimino.getBlockList()[2].x-2].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y+1 * board.getWidth() + tetrimino.getBlockList()[3].x-1].getBlank() == false))){
				return true;
			}
		}
		if (tetrimino instanceof STetrimino){
			if (tetrimino.getRotationLevel() == 1 && ((board.getMatrix()[tetrimino.getBlockList()[1].y+1 * board.getWidth() + tetrimino.getBlockList()[1].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y-2 * board.getWidth() + tetrimino.getBlockList()[2].x].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y-1 * board.getWidth() + tetrimino.getBlockList()[3].x-1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 2 && ((board.getMatrix()[tetrimino.getBlockList()[1].y-1 * board.getWidth() + tetrimino.getBlockList()[1].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y+2 * board.getWidth() + tetrimino.getBlockList()[2].x].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y+1 * board.getWidth() + tetrimino.getBlockList()[3].x+1].getBlank() == false))){
				return true;
			}
		}
		if (tetrimino instanceof ZTetrimino){
			if (tetrimino.getRotationLevel() == 1 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-1 * board.getWidth() + tetrimino.getBlockList()[0].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y-1 * board.getWidth() + tetrimino.getBlockList()[2].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y * board.getWidth() + tetrimino.getBlockList()[3].x-2].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 2 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+1 * board.getWidth() + tetrimino.getBlockList()[0].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y+1 * board.getWidth() + tetrimino.getBlockList()[2].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y * board.getWidth() + tetrimino.getBlockList()[3].x+2].getBlank() == false))){
				return true;
			}
		}
		if (tetrimino instanceof TTetrimino){
			if (tetrimino.getRotationLevel() == 1 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-1 * board.getWidth() + tetrimino.getBlockList()[0].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y+1 * board.getWidth() + tetrimino.getBlockList()[2].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y-1 * board.getWidth() + tetrimino.getBlockList()[3].x-1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 2 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+1 * board.getWidth() + tetrimino.getBlockList()[0].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y-1 * board.getWidth() + tetrimino.getBlockList()[2].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y-1 * board.getWidth() + tetrimino.getBlockList()[3].x+1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 3 && ((board.getMatrix()[tetrimino.getBlockList()[0].y+1 * board.getWidth() + tetrimino.getBlockList()[0].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y-1 * board.getWidth() + tetrimino.getBlockList()[2].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y+1 * board.getWidth() + tetrimino.getBlockList()[3].x+1].getBlank() == false))){
				return true;
			}
			if (tetrimino.getRotationLevel() == 4 && ((board.getMatrix()[tetrimino.getBlockList()[0].y-1 * board.getWidth() + tetrimino.getBlockList()[0].x-1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[2].y+1 * board.getWidth() + tetrimino.getBlockList()[2].x+1].getBlank() == false) || (board.getMatrix()[tetrimino.getBlockList()[3].y+1 * board.getWidth() + tetrimino.getBlockList()[3].x-1].getBlank() == false))){
				return true;
			}
		}
		return false;
	}
}