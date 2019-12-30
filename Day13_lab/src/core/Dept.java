package core;

import java.util.List;

public class Dept {
private String deptId,location;
private List<Emp> emps;
public Dept(String deptId, String location,List<Emp>emps) {
	super();
	this.deptId = deptId;
	this.location = location;
	this.emps=emps;
	
}
public String getDeptId() {
	return deptId;
}
public void setDeptId(String deptId) {
	this.deptId = deptId;
}
public String getLocation() {
	return location;
}
public List<Emp> getEmps() {
	return emps;
}
@Override
public String toString() {
	return "Dept [deptId=" + deptId + ", location=" + location + ", emps=" + emps + "]";
}


}
