package com.jpgedvila.creatures.repositories;

import com.jpgedvila.creatures.entities.Creatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CreaturesRepository extends JpaRepository<Creatures, Long> {

}
