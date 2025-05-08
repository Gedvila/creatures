package com.jpgedvila.creatures.repositories;

import com.jpgedvila.creatures.entities.Creatures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreaturesRepository extends JpaRepository<Creatures, Long> {
}
