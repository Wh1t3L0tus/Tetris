import org.newdawn.slick.Image;


public class Block {

	private Image texture;
	private boolean blank;
	
	public Block(boolean blank, Image texture) {
		this.blank = blank;
		this.texture = texture;
	}
	
	public Block(boolean blank) {
		this.texture = null;
		this.blank = blank;
	}
	
	public boolean isBlank() {
		return blank;
	}
	
	public void setTexture(Image texture) {
		this.texture = texture;
	}
	
	public void render(float x, float y) {
		texture.draw(x, y);
	}
	
	
}
