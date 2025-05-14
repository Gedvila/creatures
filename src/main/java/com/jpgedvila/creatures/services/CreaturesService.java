package com.jpgedvila.creatures.services;

import com.jpgedvila.creatures.dto.CreaturesDTO;
import com.jpgedvila.creatures.entities.*;
import com.jpgedvila.creatures.repositories.ActionsRepository;
import com.jpgedvila.creatures.repositories.CreaturesRepository;
import com.jpgedvila.creatures.repositories.ElementRepository;
import com.jpgedvila.creatures.repositories.SkillsRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.awt.print.Pageable;

@Service
public class CreaturesService {

    private final CreaturesRepository repository;
    private final ActionsRepository actionsRepository;
    private final SkillsRepository skillsRepository;
    private final ElementRepository elementRepository;

    public CreaturesService(CreaturesRepository repository, ActionsRepository actionsRepository, SkillsRepository skillsRepository, ElementRepository elementRepository) {
        this.repository = repository;
        this.actionsRepository = actionsRepository;
        this.skillsRepository = skillsRepository;
        this.elementRepository = elementRepository;
    }

    @Transactional(readOnly = true)
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

//    public CreaturesDTO insert(CreaturesDTO dto) {
//
//        Creatures entity = new Creatures();
//
//        entity.setName(dto.getName());
//
//
//        for(CreaturesElementDTO elementDTO : dto.getElement()) {
//
//            Element element = creaturesElementRepository.getReferenceById(elementDTO.getId().getElement().getId()).getElement();
//
//            entity.getElement().add(element);
//        }
//
//        for (ActionsDTO actionsDTO : dto.getActions()) {
//
//            Actions actions = actionsRepository.getReferenceById(actionsDTO.getId());
//            entity.getActions().add(actions);
//        }
//
//        for (SkillsDTO skillDTO : dto.getSkills()) {
//            Skills skills = skillsRepository.getReferenceById(skillDTO.getId());
//            entity.getSkills().add(skills);
//        }
//
//        entity = repository.save(entity);
//
//        return new CreaturesDTO(entity);
//    }

}
