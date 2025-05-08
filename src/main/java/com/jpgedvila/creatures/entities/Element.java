package com.jpgedvila.creatures.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_element")
public class Element {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "id.element")
    private Set<CreaturesElement> items = new HashSet<>();

    public Element(){}

    public Element(Long id, String name, Set<CreaturesElement> items) {
        this.id = id;
        this.name = name;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CreaturesElement> getItems() {
        return items;
    }

    public void setItems(Set<CreaturesElement> items) {
        this.items = items;
    }
}
