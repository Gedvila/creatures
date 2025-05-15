package com.jpgedvila.creatures.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_actions")
@Inheritance(strategy = InheritanceType.JOINED)
public class Actions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String actionType;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Integer attackQuantity;
    private String damage;
    private String damageType;
    private Integer attackBonus;

    @ManyToOne
    private Creatures creatures;

    public Actions(){}

    public Actions(Long id, String actionType, String name, String description, Integer attackQuantity, String damage, String damageType, Integer attackBonus) {
        this.id = id;
        this.actionType = actionType;
        this.name = name;
        this.description = description;
        this.attackQuantity = attackQuantity;
        this.damage = damage;
        this.damageType = damageType;
        this.attackBonus = attackBonus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAttackQuantity() {
        return attackQuantity;
    }

    public void setAttackQuantity(Integer attackQuantity) {
        this.attackQuantity = attackQuantity;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public Integer getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(Integer attackBonus) {
        this.attackBonus = attackBonus;
    }

    public void setCreatures(Creatures creatures) {
        this.creatures = creatures;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actions actions = (Actions) o;
        return Objects.equals(id, actions.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
