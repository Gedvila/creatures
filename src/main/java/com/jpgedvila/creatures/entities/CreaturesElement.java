package com.jpgedvila.creatures.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_creatures_element")
public class CreaturesElement {

    @EmbeddedId
    CreaturesElementPK id = new CreaturesElementPK();

    public CreaturesElement(){}

    public CreaturesElement(Creatures creatures, Element element) {
        id.setCreatures(creatures);
        id.setElement(element);
    }

    public Creatures getCreatures(){
        return id.getCreatures();
    }

    public void setCreature(Creatures creatures){
        id.setCreatures(creatures);
    }

    public Element getElement(){
        return id.getElement();
    }

    public void setElement(Element element){
        id.setElement(element);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreaturesElement that = (CreaturesElement) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
