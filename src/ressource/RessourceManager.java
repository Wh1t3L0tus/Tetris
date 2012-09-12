package ressource;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class RessourceManager {

	private static Image emptyBlock;
	private static Image yellowBlock;
	private static Image greenBlock;
	private static Image redBlock;
	private static Image purpleBlock;
	private static Image blueBlock;
	private static Image lightBlueBlock;
	private static Image orangeBlock;
	
	public static void loadRessources() throws SlickException {
			emptyBlock = new Image("empty_block.png");
			yellowBlock = new Image("yellow_block.png");
			greenBlock = new Image("green_block.png");
			redBlock = new Image("red_block.png");
			purpleBlock = new Image("purple_block.png");
			blueBlock = new Image("dark_blue_block.png");
			lightBlueBlock = new Image("light_blue_block.png");
			orangeBlock = new Image("orange_block.png");
	}
	
	public static Image getEmptyBlock() {
		return emptyBlock;
	}

	public static void setEmptyBlock(Image emptyBlock) {
		RessourceManager.emptyBlock = emptyBlock;
	}

	public static Image getYellowBlock() {
		return yellowBlock;
	}

	public static void setYellowBlock(Image yellowBlock) {
		RessourceManager.yellowBlock = yellowBlock;
	}

	public static Image getGreenBlock() {
		return greenBlock;
	}

	public static void setGreenBlock(Image greenBlock) {
		RessourceManager.greenBlock = greenBlock;
	}

	public static Image getRedBlock() {
		return redBlock;
	}

	public static void setRedBlock(Image redBlock) {
		RessourceManager.redBlock = redBlock;
	}

	public static Image getPurpleBlock() {
		return purpleBlock;
	}

	public static void setPurpleBlock(Image purpleBlock) {
		RessourceManager.purpleBlock = purpleBlock;
	}

	public static Image getBlueBlock() {
		return blueBlock;
	}

	public static void setBlueBlock(Image blueBlock) {
		RessourceManager.blueBlock = blueBlock;
	}

	public static Image getLightBlueBlock() {
		return lightBlueBlock;
	}

	public static void setLightBlueBlock(Image lightBlueBlock) {
		RessourceManager.lightBlueBlock = lightBlueBlock;
	}

	public static Image getOrangeBlock() {
		return orangeBlock;
	}

	public static void setOrangeBlock(Image orangeBlock) {
		RessourceManager.orangeBlock = orangeBlock;
	}

}
