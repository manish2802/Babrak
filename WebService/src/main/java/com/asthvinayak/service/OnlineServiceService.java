
//Businesss/service layer
package com.asthvinayak.service;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asthvinayak.bean.Order;
import com.asthvinayak.dto.OrderDTO;
import com.asthvinayak.repository.OnlineServiceDAOImpl;


//Businesss/service layer

@Service
@Transactional
public class OnlineServiceService {

	@Autowired
	OnlineServiceDAOImpl OnlineServiceDAOImpl;

	public List<Order> getOrder() {

		List<OrderDTO> list = OnlineServiceDAOImpl.findAll();
		List<Order> orderList = new ArrayList<Order>();

		for (OrderDTO od : list) {
			Order order = new Order();

			order.setOrderId(od.getOrderId());
			order.setOrderName(od.getOrderName());
			order.setDate(od.getDate());

			orderList.add(order);
		    }
		    return orderList;
	        }

	/**
	 * 
	 * @param order
	 */
	    public void postOrder(Order order) {

		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setOrderId(order.getOrderId());
		orderDTO.setOrderName(order.getOrderName());
		orderDTO.setDate(order.getDate());
		OnlineServiceDAOImpl.save(orderDTO);

	    }
	
	

	/**
	 * 
	 * @param order
	 */
	    public void deleteOrder(Integer orderId) {
		OnlineServiceDAOImpl.deleteById(orderId);
	    }
        }
