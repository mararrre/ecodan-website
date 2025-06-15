package org.example.siteforbread.controllers;

import org.example.siteforbread.model.Order;
import org.example.siteforbread.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order")
    public String handleOrder(Order order) {
        orderRepository.save(order);
        return "redirect:/"; // После заказа можно сделать страницу "спасибо"
    }
}