package com.example.OrderDetails;

import com.example.OrderDetails.Controller.OrderController;
import com.example.OrderDetails.Repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class OrderDetailsApplicationTests {

	@Autowired
	private OrderController orderController;

	@MockBean
	private OrderRepository orderRepository;


	@Test
	void contextLoads() {
	}



	@Test
	public void getCropDataTest() {
		String orderId = "101";
		orderController. getById(orderId);
		verify(orderRepository,times(1)).findById(orderId);
	}


	@Test
	public void deleteCropTest() {
		String id = "101";
		orderController. delete(id);
		verify(orderRepository,times(1)).deleteById(id);
	}

	public void findAllOrders(){
		when(orderRepository.findAll()).thenReturn(Stream.of
				(new OrderDetails("1","101","Television","230000","5"))
				.collect(Collectors.toList()));
		assertEquals(3,orderController.getAllOrders().size());
	}




	}




