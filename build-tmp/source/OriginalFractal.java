import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup()
{
	size(400, 400);
	noLoop();
}
public void draw()
{
	background(0,255,255);
	drawCircle(200,200, 200);
}
public void drawCircle(int x, int y, int radius)
{
	fill((int)(Math.random()*255));
	ellipse(x,y,radius,radius);
	radius /= 2;
	if(radius >= 1)// base case
	{
		drawCircle(x-(radius), y-(radius), radius);
		drawCircle(x-(radius), y+(radius), radius);
		drawCircle(x+(radius), y-(radius), radius);
		drawCircle(x+(radius), y+(radius), radius);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
