package com.dnsouzadev.webservice.services;

import com.dnsouzadev.webservice.entities.Category;
import com.dnsouzadev.webservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Optional<Category> findById(long id) {
        return repository.findById(id);
    }
}
