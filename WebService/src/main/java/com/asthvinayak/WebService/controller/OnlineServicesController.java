
/////////Prensentation layer 
package com.asthvinayak.WebService.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.asthvinayak.bean.Order;
import com.asthvinayak.service.OnlineServiceService;

/////////Prensentation layer 

@RestController
public class OnlineServicesController {

	@Autowired(required = true)
	OnlineServiceService onlineServiceService;

	// Get method
	@GetMapping("/get_order")
	public List<Order> getOrder() {

		List<Order> list = onlineServiceService.getOrder();
		return list;
	}
	

	// post method
	@PostMapping("/post_order")
	public ResponseEntity<String> getOrder1(@RequestBody Order order) {
		onlineServiceService.postOrder(order);
		return ResponseEntity.status(HttpStatus.CREATED).build();

	}
	

	/// delete method
	@DeleteMapping("/delete_order/{orderId}")
	public void deleteOrder(@PathVariable Integer orderId) {
		System.out.println("deleteOrder");
		onlineServiceService.deleteOrder(orderId);
	}
    }
