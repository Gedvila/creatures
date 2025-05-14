package com.jpgedvila.creatures.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_defense")
public class Defense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer creatureDefense;
    private Integer fortitude;
    private Integer reflex;
    private  Integer will;

    @OneToOne
    @MapsId
    @JoinColumn(name = "creatures_id")
    private Creatures creatures;

    public Defense(){}

    public Defense(Integer creatureDefense, Integer fortitude, Integer reflex, Integer will) {
        this.creatureDefense = creatureDefense;
        this.fortitude = fortitude;
        this.reflex = reflex;
        this.will = will;
    }

//    public Defense(Defense def){
//        creatureDefense = def.getCreatureDefense();
//        fortitude = def.getFortitude();
//        reflex = def.getReflex();
//        will = def.getWill();
//    }

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
        Defense defense = (Defense) o;
        return Objects.equals(id, defense.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
