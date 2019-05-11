


/////// Persistence layer

package com.asthvinayak.dto;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

///// Entity class 

@Entity
@Table(name="ORDERS")
public class OrderDTO {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="ORDER_ID")
	private Integer  orderId;
	
	@Column(name="ORDER_NAME")
	private String orderName;
	
	@Column(name="ORDER_DATE")
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
	
	
	

}
