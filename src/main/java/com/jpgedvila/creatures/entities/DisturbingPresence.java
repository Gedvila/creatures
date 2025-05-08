package com.jpgedvila.creatures.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_disturbing")
public class DisturbingPresence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer dt;
    private String mentalDamage;
    private  Integer nexImmunity;

    @OneToOne
    @MapsId
    private Creatures creatures;

    public DisturbingPresence(){}

    public DisturbingPresence(Integer dt, String metalDamage, Integer nexImmunity){
        this.dt = dt;
        this.mentalDamage = metalDamage;
        this.nexImmunity = nexImmunity;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DisturbingPresence that = (DisturbingPresence) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
