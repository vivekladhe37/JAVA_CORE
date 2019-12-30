package worker;
import employee.*;

public class worker extends employee 
{

	/*Worker state  ---id,name,email,basic,dept, hoursWorked,hourlyRate
	Behaviour--- 
	1. get worker details(toString)
	2.  compute net salary (formula:  = basic+(hrs*rate)
	3. get hrlyRate of the worker  */
	
	private int hoursWorked;
    private double 	hourlyRate;
    public worker(String name,String email,int deptId,double basic,int hoursWorked,double hourlyRate)
    {
    	super(name,email,deptId,basic);
    	this.hoursWorked=hoursWorked;
    	this.hourlyRate=hourlyRate;
    }
    public String toString()
    {
    	System.out.println(super.toString());
        return("hoursWorked:"+hoursWorked+"\n"+"hourlyRate:"+hourlyRate+"\n");
    }
    public double computeNetSalary()
	{
      double netSal=getBasic()+(hoursWorked*hourlyRate);		
	  return netSal;
	}
    public double getHrlyRate()
    {
    	return hourlyRate;
    }
	
}
