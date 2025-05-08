package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.Skills;
import jakarta.persistence.Column;

public class SkillsDTO {

    private Long id;
    private String name;
    private String description;

    public SkillsDTO(){}

    public SkillsDTO(Skills skill) {
        id = skill.getId();
        name = skill.getName();
        description = skill.getDescription();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
