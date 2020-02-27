import java.util.Random;
import java.awt.Graphics;
import java.awt.Color;

public class Face{

	private int width;
	private int height;
	private int positionX;
	private int positionY;
	private int smilingStatus;

	public Face(){

		width = 0;
		height = 0;
		positionX = 0;
		positionY = 0;
		smilingStatus = 0;

	}

	public Face(int frameWidth, int frameHeight){

		// Random generation of all face elements
		Random rand = new Random();
		width = rand.nextInt(91) + 30;
		height = rand.nextInt(91) + 30;
		positionX = rand.nextInt((frameWidth - width) + 1);
		positionY = rand.nextInt((frameHeight - height) + 1);
		smilingStatus = rand.nextInt(3);

	}

	public Face(int widthIn, int heightIn, int positionXIn, int positionYIn, int smilingStatusIn){

		width = widthIn;
		height = heightIn;
		positionX = positionXIn;
		positionY = positionYIn;
		smilingStatus = smilingStatusIn;

	}

	public void setWidth(int widthIn){

		width = widthIn;

	}

	public int getWidth(){

		return width;

	}

	public void setHeight(int heightIn){

		height = heightIn;

	}

	public int getHeight(){

		return height;

	}

	public void setPositionX(int positionXIn){

		positionX = positionXIn;

	}

	public int getPositionX(){

		return positionX;

	}

	public void setPositionY(int positionYIn){

		positionY = positionYIn;

	}

	public int getPositionY(){

		return positionY;

	}

	public void setSmilingStatus(int smilingStatusIn){

		smilingStatus = smilingStatusIn;

	}

	public int getSmilingStatus(){

		return smilingStatus;

	}

	// Responsible for drawing of the face
	public void toGraphic(Graphics g){

		// The following if statements determine the expression
		if(smilingStatus == 0){
			
			// Sets the face to green and draw a happy expression
			g.setColor(Color.GREEN);
			g.fillOval(positionX, positionY, width, height);
			g.setColor(Color.BLACK);
			g.drawArc((positionX + (width/4)), positionY + (height / 4), width/2, height/2, 220, 100);

		}

		else if(smilingStatus == 1){

			// Sets the face to yellow and draws a blank expression
			g.setColor(Color.YELLOW);
			g.fillOval(positionX, positionY, width, height);
			g.setColor(Color.BLACK);
			g.drawLine(positionX + (width / 4), positionY + (3 * (height / 4)), positionX + (3 * (width / 4)), positionY + (3 * (height / 4)));

		}

		else if(smilingStatus == 2){

			// Sets the face to red and draws a mad expression
			g.setColor(Color.RED);
			g.fillOval(positionX, positionY, width, height);
			g.setColor(Color.BLACK);
			g.drawArc(positionX + (width / 4), positionY + (3 * (height / 4)), width / 2, height / 2, 40, 100);

		}

		// Draws the eyes and the actual face
		g.drawOval(positionX, positionY, width, height);
		g.drawOval((positionX + (width/4)) - ((width/6)/2), (positionY + (height/4)) - ((height/6)/2), width/6, height/6);
		g.drawOval((positionX + (width/4)) - ((width/6)/2) + width/2, (positionY + (height/4)) - ((height/6)/2), width/6, height/6);

	}

	public String toString(){

		return String.format("positionX=%d, positionY=%d, width=%d, height=%d, smilingStatus=%d", positionX, positionY, width, height, smilingStatus);

	}

}