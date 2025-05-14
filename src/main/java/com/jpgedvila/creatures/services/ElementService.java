package com.jpgedvila.creatures.services;

import com.jpgedvila.creatures.dto.CreaturesDTO;
import com.jpgedvila.creatures.dto.ElementDTO;
import com.jpgedvila.creatures.entities.Creatures;
import com.jpgedvila.creatures.entities.Element;
import com.jpgedvila.creatures.repositories.ElementRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ElementService {

    private final ElementRepository repository;
    public ElementService(ElementRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public ElementDTO findById(Long id) {
        Element element = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Element not found"));
        return new ElementDTO(element);
    }
}
