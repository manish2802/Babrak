

////// pjo object /// sample java object  

package com.asthvinayak.bean;
import java.util.Date;
public class Order {
		
	private Integer  orderId;
	private String orderName;
	private Date date;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", date=" + date + "]";
	}
	
	
	
	

}
