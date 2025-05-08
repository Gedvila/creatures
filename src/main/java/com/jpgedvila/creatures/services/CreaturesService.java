package com.jpgedvila.creatures.services;

import com.jpgedvila.creatures.dto.CreaturesDTO;
import com.jpgedvila.creatures.entities.Creatures;
import com.jpgedvila.creatures.repositories.CreaturesRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.awt.print.Pageable;

@Service
public class CreaturesService {

    private final CreaturesRepository repository;

    public CreaturesService(CreaturesRepository repository) {
        this.repository = repository;
    }

    public CreaturesDTO findById(Long id) {
        Creatures creatures = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Creature not found"));
                return new CreaturesDTO(creatures);
    }

    @Transactional(readOnly = true)
    public Page<CreaturesDTO> findAll(Pageable pageable) {
        Page<Creatures> result = repository.findAll((org.springframework.data.domain.Pageable) pageable);
        return result.map(x -> new CreaturesDTO(x));
    }
}
