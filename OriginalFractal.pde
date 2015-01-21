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