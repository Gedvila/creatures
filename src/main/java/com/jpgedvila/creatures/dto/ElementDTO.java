package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.Creatures;
import com.jpgedvila.creatures.entities.Element;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

public class ElementDTO {

    private Long id;
    private String name;
    private Set<Creatures> creatures = new HashSet<>();

    public ElementDTO() {}

    public ElementDTO(Element element) {
        id = element.getId();
        name = element.getName();
        creatures.addAll(element.getCreatures());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Creatures> getCreatures() {
        return creatures;
    }
}
