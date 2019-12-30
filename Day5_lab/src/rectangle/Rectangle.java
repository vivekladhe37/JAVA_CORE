package rectangle;

import Computable.Computable;
import point.Point;

public class Rectangle extends Point implements Computable 
{


	/*Rectangle --x,y,width,height,constructor  , toString, calc area & perimeter +
*/
	private double width,height;
	
	public Rectangle(double x, double y,double  width,double height) {
		super(x, y);
		this.width=width;
		this.height=height;
	}

	@Override
	public String toString() 
	{
		return "Rectangle [width=" + width + ", height=" + height + ", toString()=" + 
	    super.toString()+"]";
	}
	public double calArea()
	{
		double area=width*height;
		return area;
	}
	public double calPeri()
	{
		double peri=2*(width+height);
		return peri;
	}
	public void diagonals()
	{
	 System.out.println("diagonals of rectangle are equal in lenth");
	}
}
