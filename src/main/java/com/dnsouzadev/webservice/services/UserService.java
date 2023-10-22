package com.dnsouzadev.webservice.services;

import com.dnsouzadev.webservice.entities.User;
import com.dnsouzadev.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(long id) {
        return repository.findById(id);
    }

    public User insert(User obj) {
        return repository.save(obj);
    }
}
