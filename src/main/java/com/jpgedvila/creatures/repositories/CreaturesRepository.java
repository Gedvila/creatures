package com.jpgedvila.creatures.repositories;

import com.jpgedvila.creatures.entities.Creatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CreaturesRepository extends JpaRepository<Creatures, Long> {

    @Query("SELECT obj FROM Creatures obj JOIN FETCH obj.disturbingPresence JOIN FETCH  obj.healthPoints JOIN FETCH obj.attributes JOIN FETCH obj.defense JOIN FETCH obj.element JOIN FETCH obj.skills JOIN FETCH obj.actions")
    List<Creatures> findById();
}
