package project_product;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable{
	
	private String code;
	private String name;
	private long price;
	private long qty;
	public ProductBean() {
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	

}
