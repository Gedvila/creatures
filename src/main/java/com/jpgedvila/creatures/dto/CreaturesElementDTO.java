package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.Element;

import java.io.Serializable;

public class CreaturesElementDTO {

    private Long id;
    private String name;

    public CreaturesElementDTO() {}

    public CreaturesElementDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CreaturesElementDTO(Element element) {
        id = element.getId();
        name = element.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
