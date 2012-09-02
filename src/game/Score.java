package game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

import coordinate.Coordinate;



public class Score {
	
	public static final int NUMBER_OF_TOP_PLAYERS = 10;
	private PrintWriter writer;
	private BufferedReader reader;
	private Coordinate coordinate;
	private int actualScore;
	private String playersName[];
	private int playersScore[];
	private Color color;
	private UnicodeFont font;
	private String filePath;
	private int rank;
	
	@SuppressWarnings("unchecked")
	public Score(Coordinate c, int fontSize, String fontName, String filePath, Color color) throws SlickException, IOException {
		this.coordinate = c;
		this.font = new UnicodeFont(fontName, fontSize, true, false);
		this.font.getEffects().add(new ColorEffect(java.awt.Color.white));
		this.font.addAsciiGlyphs();
		this.font.loadGlyphs();
		this.color = color;
		this.actualScore = 0;
		this.playersName = new String[10];
		this.playersScore = new int[10];
		this.filePath = filePath;
		this.rank = NUMBER_OF_TOP_PLAYERS + 1;
		//loading the best scores
		reader = new BufferedReader(new FileReader(filePath));
		for (int i = 0; i < NUMBER_OF_TOP_PLAYERS * 2 && reader.ready(); i++) {
			if (i % 2 == 0)
				playersName[i] = reader.readLine();
			else {
				String tmp;
				if ((tmp = reader.readLine()) == "")
					playersScore[i] = 0;
				else
					playersScore[i] = Integer.valueOf(tmp);
			}
		}
		reader.close();
	}
	
	public void save(String playerName) throws IOException {
		int thisScorePosition = -1;
		for (int i = 0; i < NUMBER_OF_TOP_PLAYERS; i++) {
			if (actualScore > playersScore[i]) {
				thisScorePosition = i;
			}
		}
		
		if (thisScorePosition != -1) {
			for (int i = NUMBER_OF_TOP_PLAYERS - 1; i - 1 != thisScorePosition; i--) {
				playersScore[i] = playersScore[i - 1];
				playersName[i] = playersName[i - 1];
			}
			playersScore[thisScorePosition] = actualScore;
			playersName[thisScorePosition] = playerName;
		}
		
		writer = new PrintWriter(new FileWriter(filePath));
		for (int i = 0; i < NUMBER_OF_TOP_PLAYERS; i++) {
			writer.println(playersName[i]);
			writer.println(playersScore[i]);
		}
		writer.close();
		
	}
	
	public void increase(int lineDestroyed) {
		if (lineDestroyed == 1)
			actualScore += 40;
		else if (lineDestroyed == 2)
			actualScore += 100;
		else if (lineDestroyed == 3)
			actualScore += 300;
		else
			actualScore += 1200;
		
		rank = NUMBER_OF_TOP_PLAYERS + 1;
		for (int i = NUMBER_OF_TOP_PLAYERS - 1; actualScore > playersScore[i]; i++)
			rank++;
	}
	

	public int getRank() {
		return rank;
	}
	
	public void render() {
		font.drawString(coordinate.x, coordinate.y, Integer.toString(actualScore), color); 
	}
	

}
