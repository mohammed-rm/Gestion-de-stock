package users;

import management.Stock;
import notification.Observer;

public class Producer implements Observer{

	/*********************************************************************/
	/***************************** ATTRIBUTES ****************************/
	/*********************************************************************/
	
	private int prodID;
	private String prodName;
	private Stock stock;
	
	
	/*********************************************************************/
	/****************************** BUILDERS *****************************/
	/*********************************************************************/
	/**
	 * @param prodName
	 * @param stock
	 */
	public Producer(String prodName, Stock stock) {
		this.prodName = prodName;
		this.stock = stock;
	}
	
	/**
	 * @param prodName
	 * @param stock
	 */
	public Producer(String prodName, int id) {
		this.prodName = prodName;
		this.prodID = id;
	}
	
	/*********************************************************************/
	/***************************** GETS/SETS *****************************/
	/*********************************************************************/
	
	
	/**
	 * @return the prodID
	 */
	public int getProdID() {
		return prodID;
	}

	/**
	 * @param prodID the prodID to set
	 */
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}
	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	/**
	 * @return the stock
	 */
	public Stock getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(Stock stock) {
		this.stock = stock;
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	
}
