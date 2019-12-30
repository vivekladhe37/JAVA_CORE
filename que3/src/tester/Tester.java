package tester;

import java.sql.Date;
import java.util.Scanner;
import dao.StockDaoImpl;
public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=false;
			StockDaoImpl dao=new StockDaoImpl();
			while(!exit)
			{
			  System.out.println("1.Delete stock by Company");
			  System.out.println("2.Add new Stock");
			  System.out.println("3.update the Quantity");
			  System.out.println("4.exit");
			  System.out.println("Enter your choice");
			  switch (sc.nextInt()) {
			case 1: System.out.println("Enter company name to delete stock");
				    System.out.println(dao.deleteStockByCompanyName(sc.next()));
				break;
			case 2: System.out.println("enter the stock details id,nm,cmpny,price,qty,closing dt");
			        System.out.println(dao.insertInStock(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), 
			        		sc.nextInt(), Date.valueOf(sc.next())));
			        break;
			case 3:System.out.println("Enter the price qty and id to update");
			        System.out.println(dao.updateStck(sc.nextInt(), sc.nextInt(), sc.nextInt()));
			 
			case 4:
				exit=true;
				break;
				
			default:
				break;
			}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
