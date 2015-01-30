import java.awt.*;


public class RegularPolygon {

	private int numSides;
	private double centralAngle;
	private double r;
	private double rotation;
	private double sideLength;
	private int centerX;
	private int centerY;
	
	public RegularPolygon(int numSides, double radius, int x, int y) {
		
		this.numSides = numSides;
		centralAngle = Math.PI / numSides;
		r = radius;
		sideLength = r * (2* Math.sin(centralAngle));
		rotation = 0;
		x = centerX;
		y = centerY;
		System.out.println(r);
	}
	
	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
	public void setCenter(int x, int y) {
		centerX = x;
		centerY = y;
	}
	
	public void setNumSides(int sides) {
		numSides = sides;
		centralAngle = Math.PI / numSides;
		sideLength = r * (2* Math.sin(centralAngle));
	}
	
	public void draw(Graphics g) {
		int[] xCoords = new int[numSides];
		int[] yCoords = new int[numSides];
	
		double angle = rotation;
		
		for(int i = 0; i < numSides; i++) {
			angle += centralAngle*2;
			int x = (int)Math.round(r * Math.cos(angle)) + centerX;
			int y = (int)Math.round(r * Math.sin(angle)) + centerY;
			//System.out.println(x + " " + y);
			xCoords[i] = x;
			yCoords[i] = y;
			//System.out.println(i);
			
		}
		g.drawPolygon(xCoords, yCoords, numSides);
	}
	
	
		
		
	
	
	
	public static void main(String[] args) {
		//RegularPolygon a = new RegularPolygon(4,2,0,0);
		
		//a.setRotation(Math.PI*2 / 4);
		//a.test();
		//a.setCenter(10,10);
		//a.test();

	}

}
