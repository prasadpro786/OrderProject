package com.example.OrderDetails.Controller;

import com.example.OrderDetails.OrderDetails;
import com.example.OrderDetails.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;


    @PostMapping("/create")
    public String addOrder(@RequestBody OrderDetails orderDetails)
    {
        orderRepository.save(orderDetails);
        return "Order Added Successfully";
    }

    @GetMapping("/order/{orderId}")
    public Optional<OrderDetails> getById(@PathVariable("orderId") String orderId)
    {
        return orderRepository.findById(orderId);
    }

    @GetMapping("/orders")
    public List<OrderDetails> getAllOrders(){
        return orderRepository.findAll();
    }

    @DeleteMapping("/delete/{orderId}")
    public String delete(@PathVariable ("orderId") String orderId)
    {
        orderRepository.deleteById(orderId);
//        """"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
        return "Crop deleted successfully";
    }
}
