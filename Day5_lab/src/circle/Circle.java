package circle;

import Computable.Computable;
import point.*;

public class Circle extends Point implements Computable 
{
	/*Circle --x,y,radius,constructor  , toString, calc area & perimeter +
     public void drawArc()
     { sop("drawing arc"); }*/
   private double radius;
  
   public Circle(double x,double y,double radius) 
   {
		super(x,y);
		this.radius = radius;
	}
   
    @Override
    public String toString() 
    {
    	 super.toString();
	     return "Circle [radius=" + radius + "]";
    }
    public double calArea()
    {
    	System.out.println("Perimeter:");
    	double area=Computable.PI*radius*radius;
    	return area;
    }
    public double calPeri()
    {
    	System.out.println("Perimeter:");
    	double peri=2*Computable.PI*radius;
    	return peri;
    }
    public void drawArc()
    { System.out.println("drawing arc");
    }
 }
