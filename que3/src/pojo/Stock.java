package pojo;

import java.sql.Date;

public class Stock {

	/*
	 * create table stocks(id number (5) primary key , name varchar2(20),company
	 * varchar2(20) ,price number (6,1), quantity number(5),closing_date date);
	 */
	private int id;
	private String name,company;
	private int price,quantity;
	private Date closingDate;
	public Stock(int id, String name, String company, int price, int quantity, Date closingDate) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.closingDate = closingDate;
	}
	public Stock() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public Date getClosingDate() {
		return closingDate;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + ", quantity="
				+ quantity + ", closingDate=" + closingDate + "]";
	}
	
	
	
}
