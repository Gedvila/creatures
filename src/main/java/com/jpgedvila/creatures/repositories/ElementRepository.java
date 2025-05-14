package com.jpgedvila.creatures.repositories;

import com.jpgedvila.creatures.entities.Element;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepository extends JpaRepository<Element, Long> {
}
