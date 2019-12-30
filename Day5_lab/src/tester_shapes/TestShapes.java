package tester_shapes;

import java.util.Scanner;

import Computable.Computable;
import circle.*;
import rectangle.*;



public class TestShapes 
{
	/*5. Tester --Test using dyn method dispatch.
5.1 Prompt user for how many bounded shapes. Create suitable array.
Options
1. Add Circle
2. Add Rectangle
3. Display area & perimeter of all shapes, using for-each loop.
In the same for-each , invoke drawArc for a circle or diagonals for a rectangle type.
*/

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Shapes?");
		int noOfShapes=sc.nextInt();
		Computable [] cmp=new Computable[noOfShapes];
		boolean exit=false;
		int ch,i=0;
		while(!exit && i < noOfShapes)
		{
			System.out.println("1. Add Circle");
			System.out.println("2. Add Rectangle");
			System.out.println("3. Display area & perimeter of all shapes");
			System.out.println("4.Exit:");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:{
				   System.out.println("Enter Co-ordinates x and y and radius:");
				   cmp[i]=new Circle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				   i++;
			       }break;
			       
			case 2:{
				   
				   System.out.println("Enter Co-ordinates and width and height:");
				   cmp[i]=new Rectangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				    i++;
			       }break;
			case 3:{
				
				     for(Computable c:cmp)
				     {
				      System.out.println("Shape Details");
				      System.out.println(c.toString());
				      if(c instanceof Circle)
				      {
				    	  ((Circle) c).drawArc();
				      }
				      else if(c instanceof Rectangle)
				      {
				    	  ((Rectangle) c).diagonals();
				      }
				     
				     }
				  }break;
			case 4:{
				exit=true;
			}break;
			}
			
		}
	    
		
	}

	
	
	
}
