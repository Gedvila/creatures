package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.Creatures;
import com.jpgedvila.creatures.entities.Element;
import com.jpgedvila.creatures.entities.Skills;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

public class ElementDTO {

    private Long id;
    private String name;
    private Set<CreaturesDTO> creatures = new HashSet<>();

    public ElementDTO() {}

    public ElementDTO(Element element) {
        id = element.getId();
        name = element.getName();

        for (Creatures creature : element.getCreatures()){
            creatures.add(new CreaturesDTO(creature));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<CreaturesDTO> getCreatures() {
        return creatures;
    }
}
