package birckbracker;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class GraphicConfiguration {

    public void isPlay(Graphics graphics, int ballPosX, int ballPosY) {
        //ball showing
        graphics.setColor(Color.green);
        graphics.fillOval(ballPosX, ballPosY, 20, 20);
    }
    
    public void notPlay(Graphics graphics, int ballPosX, int ballPosY) {
        graphics.setColor(Color.YELLOW);
        graphics.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));
        
        //graphics.drawString("Press Enter/Left/Right Arrow to start the game!", 90, 350); -- old message
        graphics.drawString("Press Enter to start", 250, 350);
        graphics.setColor(Color.blue);
        graphics.drawString("To move press the Left and Right Arrow", 150, 450);

        //ball hiding
        graphics.setColor(Color.black);
        graphics.fillOval(ballPosX, ballPosY, 20, 20);
	}
}