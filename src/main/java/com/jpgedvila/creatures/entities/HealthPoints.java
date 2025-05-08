package com.jpgedvila.creatures.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_health")
public class HealthPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    @OneToOne
    @MapsId
    private Creatures creatures;

    public HealthPoints(){}

    public HealthPoints(Integer health, Integer ballisticRes, Integer cuttingRes, Integer piercingRes, Integer impactRes, Integer bloodRes, Integer energyRes, Integer knowledgeRes, Integer deathRes, String immunity, String vulnerability) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImmunity() {
        return immunity;
    }

    public void setImmunity(String immunity) {
        this.immunity = immunity;
    }

    public Creatures getCreatures() {
        return creatures;
    }

    public void setCreatures(Creatures creatures) {
        this.creatures = creatures;
    }

    public String getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(String vulnerability) {
        this.vulnerability = vulnerability;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HealthPoints that = (HealthPoints) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
