package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import static dbutils.DButil.*;
public class StockDaoImpl implements IStock {

	private Connection cn;
	private PreparedStatement pst1,pst2,pst3;
	
	public StockDaoImpl() throws ClassNotFoundException, SQLException
	{
	  cn=fetchconnection();	
	  pst1=cn.prepareStatement("delete from stocks where company=?");
	  pst2=cn.prepareStatement("insert into stocks values( ?,?,?,?,?,?)");
	  pst3=cn.prepareStatement("update stocks set price=price+?,quantity =quantity+? where id =?");
	}
	public void cleanup() throws SQLException
	{
		if(pst1!=null)
		{
			pst1.close();
		}
		if(pst2!=null)
		{
			pst2.close();
		}
		System.out.println("dao is cleaned up");
	}
	
	
	@Override
	public String deleteStockByCompanyName(String company) throws SQLException {
		
		pst1.setString(1, company);
		int count=pst1.executeUpdate();
		if(count>=1)
		return "stock deleted sucessfully";
		else
		return "Company name not found";
	}
	@Override
	public String insertInStock(int id, String name, String company, int price, int quantity, Date closingDate) throws SQLException {
		pst2.setInt(1, id);
		pst2.setString(2, name);
		pst2.setString(3, company);
		pst2.setInt(4, price);
		pst2.setInt(5, quantity);
		pst2.setDate(6,closingDate);
		int count=pst2.executeUpdate();
		if(count==1)
		return "Record added succesfully";
		else
			return"Error while adding record";
		
	}
	@Override
	public String updateStck(int price, int quantity,int id) throws SQLException {
		pst3.setInt(1,price );
		pst3.setInt(2, quantity);
		pst3.setInt(3, id);
		int count=pst3.executeUpdate();
		if(count==1)
		return "updated succesccfully";
		else
			return "failed to update";
	}
	
  
}
