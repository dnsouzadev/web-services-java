package com.dnsouzadev.webservice.services;

import com.dnsouzadev.webservice.entities.Order;
import com.dnsouzadev.webservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Optional<Order> findById(long id) {
        return repository.findById(id);
    }
}
