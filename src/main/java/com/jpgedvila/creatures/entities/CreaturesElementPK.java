package com.jpgedvila.creatures.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class CreaturesElementPK {

    @ManyToOne
    @JoinColumn(name = "creatures_id")
    private Creatures creatures;

    @ManyToOne
    @JoinColumn(name = "element_id")
    private Element element;

    public CreaturesElementPK(){}


    public Creatures getCreatures() {
        return creatures;
    }

    public void setCreatures(Creatures creatures) {
        this.creatures = creatures;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreaturesElementPK that = (CreaturesElementPK) o;
        return Objects.equals(creatures, that.creatures) && Objects.equals(element, that.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatures, element);
    }
}
