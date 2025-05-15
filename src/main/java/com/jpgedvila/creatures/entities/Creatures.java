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

    @OneToMany(mappedBy = "creatures", cascade = CascadeType.PERSIST)
    private Set<Skills> skills = new HashSet<>();

    @OneToMany(mappedBy = "creatures", cascade = CascadeType.PERSIST)
    private Set<Actions> actions = new HashSet<>();

    public Creatures() {}

    public Creatures(Long id, String name, Integer vd, Integer dt, String mentalDamage, Integer nexImmunity, Integer health, Integer ballisticRes, Integer cuttingRes, Integer piercingRes, Integer impactRes, Integer bloodRes, Integer energyRes, Integer knowledgeRes, Integer deathRes, String immunity, String vulnerability, Integer strength, Integer agility, Integer intellect, Integer presence, Integer vitality, Integer creatureDefense, Integer fortitude, Integer reflex, Integer will, Element element, Set<Skills> skills, Set<Actions> actions) {
        this.id = id;
        this.name = name;
        this.vd = vd;
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

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public String getMentalDamage() {
        return mentalDamage;
    }

    public void setMentalDamage(String mentalDamage) {
        this.mentalDamage = mentalDamage;
    }

    public Integer getNexImmunity() {
        return nexImmunity;
    }

    public void setNexImmunity(Integer nexImmunity) {
        this.nexImmunity = nexImmunity;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getBallisticRes() {
        return ballisticRes;
    }

    public void setBallisticRes(Integer ballisticRes) {
        this.ballisticRes = ballisticRes;
    }

    public Integer getCuttingRes() {
        return cuttingRes;
    }

    public void setCuttingRes(Integer cuttingRes) {
        this.cuttingRes = cuttingRes;
    }

    public Integer getPiercingRes() {
        return piercingRes;
    }

    public void setPiercingRes(Integer piercingRes) {
        this.piercingRes = piercingRes;
    }

    public Integer getImpactRes() {
        return impactRes;
    }

    public void setImpactRes(Integer impactRes) {
        this.impactRes = impactRes;
    }

    public Integer getBloodRes() {
        return bloodRes;
    }

    public void setBloodRes(Integer bloodRes) {
        this.bloodRes = bloodRes;
    }

    public Integer getEnergyRes() {
        return energyRes;
    }

    public void setEnergyRes(Integer energyRes) {
        this.energyRes = energyRes;
    }

    public Integer getKnowledgeRes() {
        return knowledgeRes;
    }

    public void setKnowledgeRes(Integer knowledgeRes) {
        this.knowledgeRes = knowledgeRes;
    }

    public Integer getDeathRes() {
        return deathRes;
    }

    public void setDeathRes(Integer deathRes) {
        this.deathRes = deathRes;
    }

    public String getImmunity() {
        return immunity;
    }

    public void setImmunity(String immunity) {
        this.immunity = immunity;
    }

    public String getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(String vulnerability) {
        this.vulnerability = vulnerability;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public void setIntellect(Integer intellect) {
        this.intellect = intellect;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }

    public Integer getCreatureDefense() {
        return creatureDefense;
    }

    public void setCreatureDefense(Integer creatureDefense) {
        this.creatureDefense = creatureDefense;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public void setFortitude(Integer fortitude) {
        this.fortitude = fortitude;
    }

    public Integer getReflex() {
        return reflex;
    }

    public void setReflex(Integer reflex) {
        this.reflex = reflex;
    }

    public Integer getWill() {
        return will;
    }

    public void setWill(Integer will) {
        this.will = will;
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
