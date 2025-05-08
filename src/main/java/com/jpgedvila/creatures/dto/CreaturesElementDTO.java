package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.CreaturesElement;
import com.jpgedvila.creatures.entities.CreaturesElementPK;

public class CreaturesElementDTO {

    CreaturesElementPK id = new CreaturesElementPK();
    private String name;

    public CreaturesElementDTO(CreaturesElement ele) {
        name = ele.getElement().getName();
    }

    public CreaturesElementPK getId() {
        return id;
    }

    public void setId(CreaturesElementPK id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
