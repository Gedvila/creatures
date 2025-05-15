package com.jpgedvila.creatures.dto;

import com.jpgedvila.creatures.entities.*;


import java.util.HashSet;
import java.util.Set;

public class CreaturesDTO {

    private Long id;
    private String name;
    private Integer vd;
    private Long elementId;

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

    private Set<SkillsDTO> skills = new HashSet<SkillsDTO>();

    private Set<ActionsDTO> actions = new HashSet<ActionsDTO>();

    public CreaturesDTO() {}

    public CreaturesDTO(Long id, String name, Integer vd, Long elementId, Integer dt, String mentalDamage, Integer nexImmunity, Integer health, Integer ballisticRes, Integer cuttingRes, Integer piercingRes, Integer impactRes, Integer bloodRes, Integer energyRes, Integer knowledgeRes, Integer deathRes, String immunity, String vulnerability, Integer strength, Integer agility, Integer intellect, Integer presence, Integer vitality, Integer creatureDefense, Integer fortitude, Integer reflex, Integer will, Set<SkillsDTO> skills, Set<ActionsDTO> actions) {
        this.id = id;
        this.name = name;
        this.vd = vd;
        this.elementId = elementId;
        this.dt = dt;
        this.mentalDamage = mentalDamage;
        this.nexImmunity = nexImmunity;
        this.health = health;
        this.ballisticRes = ballisticRes;
        this.cuttingRes = cuttingRes;
        this.piercingRes = piercingRes;
        this.impactRes = impactRes;
        this.bloodRes = bloodRes;
        this.energyRes = energyRes;
        this.knowledgeRes = knowledgeRes;
        this.deathRes = deathRes;
        this.immunity = immunity;
        this.vulnerability = vulnerability;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.presence = presence;
        this.vitality = vitality;
        this.creatureDefense = creatureDefense;
        this.fortitude = fortitude;
        this.reflex = reflex;
        this.will = will;
        this.skills = skills;
        this.actions = actions;
    }

    public CreaturesDTO(Creatures creatures) {
        id = creatures.getId();
        name = creatures.getName();
        vd = creatures.getVd();
        elementId = creatures.getElement().getId();

        dt = creatures.getDt();
        mentalDamage = creatures.getMentalDamage();
        nexImmunity = creatures.getNexImmunity();

        health = creatures.getHealth();

        ballisticRes = creatures.getBallisticRes();
        cuttingRes = creatures.getCuttingRes();
        piercingRes = creatures.getPiercingRes();
        impactRes = creatures.getImpactRes();

        bloodRes = creatures.getBloodRes();
        energyRes = creatures.getEnergyRes();
        knowledgeRes = creatures.getKnowledgeRes();
        deathRes = creatures.getDeathRes();

        immunity = creatures.getImmunity();
        vulnerability = creatures.getVulnerability();

        strength = creatures.getStrength();
        agility = creatures.getAgility();
        intellect = creatures.getIntellect();
        presence = creatures.getPresence();
        vitality = creatures.getVitality();

        creatureDefense = creatures.getCreatureDefense();
        fortitude = creatures.getFortitude();
        reflex = creatures.getReflex();
        will = creatures.getWill();

        for (Skills skill : creatures.getSkills()){
            skills.add(new SkillsDTO(skill));
        }
        for (Actions action : creatures.getActions()){
            actions.add(new ActionsDTO(action));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getVd() {
        return vd;
    }

    public Integer getDt() {
        return dt;
    }

    public String getMentalDamage() {
        return mentalDamage;
    }

    public Integer getNexImmunity() {
        return nexImmunity;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getBallisticRes() {
        return ballisticRes;
    }

    public Integer getCuttingRes() {
        return cuttingRes;
    }

    public Integer getPiercingRes() {
        return piercingRes;
    }

    public Integer getImpactRes() {
        return impactRes;
    }

    public Integer getBloodRes() {
        return bloodRes;
    }

    public Integer getEnergyRes() {
        return energyRes;
    }

    public Integer getKnowledgeRes() {
        return knowledgeRes;
    }

    public Integer getDeathRes() {
        return deathRes;
    }

    public String getImmunity() {
        return immunity;
    }

    public String getVulnerability() {
        return vulnerability;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public Integer getPresence() {
        return presence;
    }

    public Integer getVitality() {
        return vitality;
    }

    public Integer getCreatureDefense() {
        return creatureDefense;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public Integer getReflex() {
        return reflex;
    }

    public Integer getWill() {
        return will;
    }

    public Long getElementId() {
        return elementId;
    }

    public Set<SkillsDTO> getSkills() {
        return skills;
    }

    public Set<ActionsDTO> getActions() {
        return actions;
    }
}
