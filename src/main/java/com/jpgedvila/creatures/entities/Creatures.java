package com.jpgedvila.creatures.entities;

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

    // Presença Perturbadora
    private Integer dt;
    private String mentalDamage;
    private  Integer nexImmunity;

    // Vida e Resistências
    private Integer health;
    private Integer ballisticRes;
    private Integer cuttingRes;
    private Integer piercingRes;
    private Integer impactRes;
    private Integer bloodRes;
    private Integer energyRes;
    private Integer knowledgeRes;
    private Integer deathRes;
    private String immunity;
    private String vulnerability;

    // Atributos
    private Integer strength;
    private Integer agility;
    private Integer intellect;
    private Integer presence;
    private Integer vitality;

    // Defesa e testes de resistência
    private Integer creatureDefense;
    private Integer fortitude;
    private Integer reflex;
    private  Integer will;

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
