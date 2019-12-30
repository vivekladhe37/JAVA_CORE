package point;

public class Point 
{
	/*Point --- x,y , constructor , toString*/
	private double x,y;
	public Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		
			   return ("X coordinate:"+ x +"Y Coordinate:"+ y);
		  }
	}
