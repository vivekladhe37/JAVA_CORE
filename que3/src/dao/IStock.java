package dao;

import java.sql.Date;
import java.sql.SQLException;
public interface IStock {
	String deleteStockByCompanyName(String company) throws SQLException;
	String insertInStock(int id, String name, String company, int price, int quantity, Date closingDate ) throws SQLException;
	String updateStck(int price,int quantity,int id) throws SQLException;
}
