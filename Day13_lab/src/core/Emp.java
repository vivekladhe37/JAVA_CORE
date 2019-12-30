package core;

import java.time.LocalDate;

public class Emp {
private int id;
private String name;
private double salaray;
private LocalDate hiredtae;
public Emp(int id, String name, double salaray, LocalDate hiredtae) {
	super();
	this.id = id;
	this.name = name;
	this.salaray = salaray;
	this.hiredtae = hiredtae;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalaray() {
	return salaray;
}
public void setSalaray(double salaray) {
	this.salaray = salaray;
}
public LocalDate getHiredtae() {
	return hiredtae;
}
public void setHiredtae(LocalDate hiredtae) {
	this.hiredtae = hiredtae;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salaray=" + salaray + ", hiredtae=" + hiredtae + "]";
}

}
