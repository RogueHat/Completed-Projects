import java.awt.Color;
import java.awt.Graphics;

class GraphicParticle extends DrawableParticle{
	private double xspd, yspd;
	
	public GraphicParticle(double x, double y, double r, Color c){
		super(x,y,r,c);
		xspd = 0;
		yspd = 0;
	}
	
	// takes direction as a radian
	public GraphicParticle(double x, double y, double r, 
			Color c, double xspd, double yspd){
		super(x,y,r,c);
		setSpd(xspd,yspd);
	}

	public void setSpd(double ... spd){
		this.xspd = spd[0];
		this.yspd = spd[1];
	}
	
	public void move(){
		double a[] = next();
		setX(a[0]);
		setY(a[1]);
	}
	
	public double[] next(){
		double a[] = {getX()+xspd, getY()+yspd};
		return a;
	}
	
	public void reverse(){
		revXspd();
		revYspd();
	}
	public void revXspd(){
		xspd*=-1;
	}
	public void revYspd(){
		yspd*=-1;
	}
	
	public double[] getSpd(){
		double a[] = {xspd, yspd};
		return a;
	}
	
}
