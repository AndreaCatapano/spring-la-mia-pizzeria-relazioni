package org.example.java.spring_la_mia_pizzeria_crud.repo;

import org.example.java.spring_la_mia_pizzeria_crud.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionRepository extends JpaRepository<Promotion, Integer> {

}
