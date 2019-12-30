package manager;
import employee.*;

public class manager extends employee
{
	/*Mgr state  ---id,name,email,basic,dept,perfBonus
     Behaviour ----1. get mgr details(toString)
     2. compute net salary (formula: basic+perfBonus)
     eg : public double computeNetSalary(){...}
     3. get performance bonus.
     public double getPerfBonus() {...}
    */
	
	private String dept;
	private double perfBonus;
	public manager(String name,String email,int deptId,double basic,String dept,double perfBonus)
	{
		super(name,email,deptId,basic);
		this.dept=dept;
		this.perfBonus=perfBonus;
	}
	public double computeNetSalary()
	{
      double netSal=getBasic()+perfBonus;		
	  return netSal;
	}
	public double getPerfBonus()
	{
		return perfBonus;
	}
	@Override
	public String toString()
	{
		System.out.println(super.toString());
        return("Dept:"+dept+"\n"+"PerfBonus:"+perfBonus+"\n");
    }
	
}
