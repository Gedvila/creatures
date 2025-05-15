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

        saveEntity(dto,entity);

        if (dto.getElementId() != null) {
            Element element = elementRepository.findById(dto.getElementId())
                    .orElseThrow(() -> new RuntimeException("Elemento não encontrado com o ID: " + dto.getElementId()));
            entity.setElement(element);
        }

        Set<Actions> actions = new HashSet<>();
        for (ActionsDTO actionsDTO : dto.getActions()) {
            Actions action = new Actions();
            saveActions(entity,actionsDTO,action);
            actions.add(action);
        }

        entity.setActions(actions);

        Set<Skills> skills = new HashSet<>();
        for (SkillsDTO skillDTO : dto.getSkills()) {

            Skills skill = new Skills();

            saveSkills(entity,skillDTO,skill);

            skills.add(skill);
        }
        entity.setSkills(skills);

        entity = repository.save(entity);
        return new CreaturesDTO(entity);
    }

    private void saveEntity(CreaturesDTO dto,Creatures entity){
        entity.setName(dto.getName());
        entity.setVd(dto.getVd());

        entity.setDt(dto.getDt());
        entity.setMentalDamage(dto.getMentalDamage());
        entity.setNexImmunity(dto.getNexImmunity());

        entity.setHealth(dto.getHealth());
        entity.setBallisticRes(dto.getBallisticRes());
        entity.setCuttingRes(dto.getCuttingRes());
        entity.setPiercingRes(dto.getPiercingRes());
        entity.setImpactRes(dto.getBallisticRes());

        entity.setBloodRes(dto.getBloodRes());
        entity.setEnergyRes(dto.getEnergyRes());
        entity.setKnowledgeRes(dto.getKnowledgeRes());
        entity.setDeathRes(dto.getDeathRes());

        entity.setImmunity(dto.getImmunity());
        entity.setVulnerability(dto.getVulnerability());

        entity.setStrength(dto.getStrength());
        entity.setAgility(dto.getAgility());
        entity.setIntellect(dto.getIntellect());
        entity.setPresence(dto.getPresence());
        entity.setVitality(dto.getVitality());

        entity.setCreatureDefense(dto.getCreatureDefense());
        entity.setFortitude(dto.getFortitude());
        entity.setReflex(dto.getReflex());
        entity.setWill(dto.getWill());
    }

    private void saveActions(Creatures entity,ActionsDTO actionsDTO,Actions action){
        action.setCreatures(entity);
        action.setActionType(actionsDTO.getActionType());
        action.setName(actionsDTO.getName());
        action.setDescription(actionsDTO.getDescription());
        action.setAttackQuantity(actionsDTO.getAttackQuantity());
        action.setDamage(actionsDTO.getDamage());
        action.setDamageType(actionsDTO.getDamageType());
        action.setAttackBonus(actionsDTO.getAttackBonus());
    }

    private void saveSkills(Creatures entity, SkillsDTO skillsDTO, Skills skills){
        skills.setCreatures(entity);
        skills.setName(skillsDTO.getName());
        skills.setDescription(skillsDTO.getDescription());
    }

}
