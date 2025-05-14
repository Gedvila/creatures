package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.*;


import java.util.HashSet;
import java.util.Set;

public class CreaturesDTO {

    private Long id;
    private String name;
    private Integer vd;
    private Long elementId;
    private DisturbingPresence disturbingPresence = new DisturbingPresence();
    private HealthPoints healthPoints = new HealthPoints();
    private Attributes attributes = new Attributes();
    private Defense defense = new Defense();

    private Set<SkillsDTO> skills = new HashSet<SkillsDTO>();

    private Set<ActionsDTO> actions = new HashSet<ActionsDTO>();

    public CreaturesDTO() {}

    public CreaturesDTO(Long id, String name, Integer vd, DisturbingPresence disturbingPresence, HealthPoints healthPoints, Attributes attributes, Defense defense, Long elementId, Set<SkillsDTO> skills, Set<ActionsDTO> actions) {
        this.id = id;
        this.name = name;
        this.vd = vd;
        this.elementId = elementId;
        this.disturbingPresence = disturbingPresence;
        this.healthPoints = healthPoints;
        this.attributes = attributes;
        this.defense = defense;
        this.skills = skills;
        this.actions = actions;
    }

    public CreaturesDTO(Creatures creatures) {
        id = creatures.getId();
        name = creatures.getName();
        vd = creatures.getVd();
        elementId = creatures.getElement().getId();
        disturbingPresence = creatures.getDisturbingPresence();
        healthPoints = creatures.getHealthPoints();
        attributes = creatures.getAttributes();
        defense = creatures.getDefense();


        for (Skills skill : creatures.getSkills()){
            skills.add(new SkillsDTO(skill));
        }
        for (Actions action : creatures.getActions()){
            actions.add(new ActionsDTO(action));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getVd() {
        return vd;
    }

    public DisturbingPresence getDisturbingPresence() {
        return disturbingPresence;
    }

    public HealthPoints getHealthPoints() {
        return healthPoints;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Defense getDefense() {
        return defense;
    }

    public Long getElementId() {
        return elementId;
    }

    public Set<SkillsDTO> getSkills() {
        return skills;
    }

    public Set<ActionsDTO> getActions() {
        return actions;
    }
}
