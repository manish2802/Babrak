



/////// Persistence layer

package com.asthvinayak.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.asthvinayak.dto.OrderDTO;

  @Repository
  public interface OnlineServiceDAOImpl extends JpaRepository<OrderDTO, Integer> {
	  
	   
	  

}