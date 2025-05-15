package com.jpgedvila.creatures.services;

import com.jpgedvila.creatures.dto.ActionsDTO;
import com.jpgedvila.creatures.dto.CreaturesDTO;
import com.jpgedvila.creatures.dto.SkillsDTO;
import com.jpgedvila.creatures.entities.*;
import com.jpgedvila.creatures.repositories.*;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.awt.print.Pageable;
import java.util.HashSet;
import java.util.Set;

@Service
public class CreaturesService {

    private final CreaturesRepository repository;
    private final ElementRepository elementRepository;

    public CreaturesService(CreaturesRepository repository, ElementRepository elementRepository) {
        this.repository = repository;
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

    @Transactional
    public CreaturesDTO insert(CreaturesDTO dto) {

        Creatures entity = new Creatures();

        entity.setName(dto.getName());
        entity.setVd(dto.getVd());

        if (dto.getElementId() != null) {

            Element element = elementRepository.findById(dto.getElementId())
                    .orElseThrow(() -> new RuntimeException("Elemento não encontrado com o ID: " + dto.getElementId()));
            entity.setElement(element);

        }

        Attributes attributes = new Attributes();
        HealthPoints healthPoints = new HealthPoints();
        Defense defense = new Defense();
        DisturbingPresence disturbingPresence = new DisturbingPresence();

        entity.setAttributes(attributes);
        entity.setHealthPoints(healthPoints);
        entity.setDefense(defense);
        entity.setDisturbingPresence(disturbingPresence);



        Set<Actions> actions = new HashSet<>();
        for (ActionsDTO actionsDTO : dto.getActions()) {

            Actions action = new Actions();
            action.setActionType(actionsDTO.getActionType());
            action.setName(actionsDTO.getName());
            action.setDescription(actionsDTO.getDescription());
            action.setAttackQuantity(actionsDTO.getAttackQuantity());
            action.setDamage(actionsDTO.getDamage());
            action.setDamageType(actionsDTO.getDamageType());
            action.setAttackBonus(actionsDTO.getAttackBonus());

            actions.add(action);
        }

        Set<Skills> skills = new HashSet<>();
        for (SkillsDTO skillDTO : dto.getSkills()) {

            Skills skill = new Skills();

            skill.setName(skillDTO.getName());
            skill.setDescription(skillDTO.getDescription());

            skills.add(skill);
        }

        entity = repository.save(entity);
        return new CreaturesDTO(entity);
    }

}
