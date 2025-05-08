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
    private Set<CreaturesElement> element = new HashSet<>();
    private Set<Skills> skills = new HashSet<>();
    private Set<Actions> actions = new HashSet<>();

    public CreaturesDTO() {}

    public CreaturesDTO(Creatures creatures) {
        id = creatures.getId();
        name = creatures.getName();
        vd = creatures.getVd();
        disturbingPresence = creatures.getDisturbingPresence();
        healthPoints = creatures.getHealthPoints();
        attributes = creatures.getAttributes();
        defense = creatures.getDefense();
        element.addAll(creatures.getElement());
        skills.addAll(creatures.getSkills());
        actions.addAll(creatures.getActions());
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

    public Set<CreaturesElement> getElement() {
        return element;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    public Set<Actions> getActions() {
        return actions;
    }
}
