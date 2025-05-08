package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.Actions;
import jakarta.persistence.Column;

public class ActionsDTO {

    private Long id;
    private String actionType;
    private String name;
    private String description;
    private Integer attackQuantity;
    private String damage;
    private String damageType;
    private Integer attackBonus;

    public ActionsDTO() {}

    public ActionsDTO(Actions action){
        id = action.getId();
        actionType = action.getActionType();
        name = action.getName();
        description = action.getDescription();
        attackQuantity = action.getAttackQuantity();
        damage = action.getDamage();
        damageType = action.getDamageType();
        attackBonus = action.getAttackBonus();
    }

    public Long getId() {
        return id;
    }

    public String getActionType() {
        return actionType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAttackQuantity() {
        return attackQuantity;
    }

    public String getDamage() {
        return damage;
    }

    public String getDamageType() {
        return damageType;
    }

    public Integer getAttackBonus() {
        return attackBonus;
    }
}
