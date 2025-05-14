package com.jpgedvila.creatures.services;

import com.jpgedvila.creatures.repositories.ElementRepository;
import org.springframework.stereotype.Service;

@Service
public class ElementService {

    private final ElementRepository repository;
    public ElementService(ElementRepository repository) {
        this.repository = repository;
    }
}
