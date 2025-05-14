package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.*;


import java.util.HashSet;
import java.util.Set;

public class CreaturesDTO {

    private Long id;
    private String name;
    private Integer vd;
    private DisturbingPresence disturbingPresence = new DisturbingPresence();
    private HealthPoints healthPoints = new HealthPoints();
    private Attributes attributes = new Attributes();
    private Defense defense = new Defense();

    private Element element = new Element();

    private Set<SkillsDTO> skills = new HashSet<SkillsDTO>();

    private Set<ActionsDTO> actions = new HashSet<ActionsDTO>();

    public CreaturesDTO() {}

    public CreaturesDTO(Creatures creatures) {
        id = creatures.getId();
        name = creatures.getName();
        vd = creatures.getVd();
        disturbingPresence = creatures.getDisturbingPresence();
        healthPoints = creatures.getHealthPoints();
        attributes = creatures.getAttributes();
        defense = creatures.getDefense();
        element = creatures.getElement();

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

    public Element getElement() {
        return element;
    }

    public Set<SkillsDTO> getSkills() {
        return skills;
    }

    public Set<ActionsDTO> getActions() {
        return actions;
    }
}
