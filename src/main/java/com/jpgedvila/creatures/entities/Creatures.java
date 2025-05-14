package com.jpgedvila.creatures.entities;

import com.jpgedvila.creatures.dto.CreaturesElementDTO;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_creatures")
public class Creatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer vd;

    @OneToOne(mappedBy = "creatures", cascade = CascadeType.ALL)
    private DisturbingPresence disturbingPresence = new DisturbingPresence();

    @OneToOne(mappedBy = "creatures", cascade = CascadeType.ALL)
    private HealthPoints healthPoints = new HealthPoints();

    @OneToOne(mappedBy = "creatures", cascade = CascadeType.ALL)
    private Attributes attributes = new Attributes();

    @OneToOne(mappedBy = "creatures", cascade = CascadeType.ALL)
    private Defense defense = new Defense();

    @ManyToOne
    private Element element = new Element();

    @OneToMany(mappedBy = "creatures")
    private Set<Skills> skills = new HashSet<>();

    @OneToMany(mappedBy = "creatures")
    private Set<Actions> actions = new HashSet<>();

    public Creatures() {}

    public Creatures(Long id, String name, Integer vd, DisturbingPresence disturbingPresence, HealthPoints healthPoints, Attributes attributes, Defense defense, Element element, Set<Skills> skills, Set<Actions> actions) {
        this.id = id;
        this.name = name;
        this.vd = vd;
        this.disturbingPresence = disturbingPresence;
        this.healthPoints = healthPoints;
        this.attributes = attributes;
        this.defense = defense;
        this.element = element;
        this.skills = skills;
        this.actions = actions;
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

    public Integer getVd() {
        return vd;
    }

    public void setVd(Integer vd) {
        this.vd = vd;
    }

    public DisturbingPresence getDisturbingPresence() {
        return disturbingPresence;
    }

    public void setDisturbingPresence(DisturbingPresence disturbingPresence) {
        this.disturbingPresence = disturbingPresence;
    }

    public HealthPoints getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(HealthPoints healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Defense getDefense() {
        return defense;
    }

    public void setDefense(Defense defense) {
        this.defense = defense;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skills> skills) {
        this.skills = skills;
    }

    public Set<Actions> getActions() {
        return actions;
    }

    public void setActions(Set<Actions> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Creatures creatures = (Creatures) o;
        return Objects.equals(id, creatures.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
