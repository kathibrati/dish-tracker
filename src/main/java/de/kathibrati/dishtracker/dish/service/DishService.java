package de.kathibrati.dishtracker.dish.service;

import de.kathibrati.dishtracker.dish.model.entity.Dish;
import de.kathibrati.dishtracker.dish.repository.DishRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {

    private final DishRepository dishRepository;

    public DishService(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }


    public Dish createDish(Dish dish) {
        return dishRepository.save(dish);
    }

    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    public Optional<Dish> getDishById(Long id) {
        return dishRepository.findById(id);
    }

    public void deleteDish(Long id) {
        dishRepository.deleteById(id);
    }
}
