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

    @OneToMany(mappedBy = "element")
    private Set<Creatures> creatures = new HashSet<>();

    public Element(){}

    public Element(Long id, String name, Set<Creatures> creatures) {
        this.id = id;
        this.name = name;
        this.creatures = creatures;
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

    public Set<Creatures> getCreatures() {
        return creatures;
    }

    public void setCreatures(Set<Creatures> creatures) {
        this.creatures = creatures;
    }
}
