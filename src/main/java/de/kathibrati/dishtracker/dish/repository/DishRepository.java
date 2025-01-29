package de.kathibrati.dishtracker.dish.repository;

import de.kathibrati.dishtracker.dish.model.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
}