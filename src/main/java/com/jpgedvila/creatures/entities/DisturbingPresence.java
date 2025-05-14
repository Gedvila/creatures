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
    @JoinColumn(name = "creatures_id")
    private Creatures creatures;

    public DisturbingPresence(){}

    public DisturbingPresence(Integer dt, String metalDamage, Integer nexImmunity){
        this.dt = dt;
        this.mentalDamage = metalDamage;
        this.nexImmunity = nexImmunity;
    }

//    public DisturbingPresence(DisturbingPresence dp){
//        dt = dp.getDt();
//        mentalDamage = dp.getMentalDamage();
//        nexImmunity = dp.getNexImmunity();
//    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatures(Creatures creatures) {
        this.creatures = creatures;
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
