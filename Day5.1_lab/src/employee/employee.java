package employee;

public abstract class employee 
{
   
	private static int counter;
	private String name, email;
	int deptId,id;
	double basic;
	static
	{
		counter=100;
		
	}
	public employee(String name,String email,int deptId,double basic)
	{
		this.name=name;
		this.email=email;
		this.deptId=deptId;
		this.basic=basic;
		counter++;
		id=counter;
		
		
	}
	public int getId()
	{
		return id;
	}
	public abstract double computeNetSalary();
	@Override
	public String toString()
	{
	  System.out.println("Employee Details:");
	  return ("Id :"+id+"Name:"+name+"\n"+"Email:"+email+"\n"+"DeptId:"+deptId+"\n"+"Basic:"+basic+"\n");
	}
	public double getBasic()
	{
		return basic;
	}
	public void setBasic(double value)
	{
		basic=value;
	}
}

