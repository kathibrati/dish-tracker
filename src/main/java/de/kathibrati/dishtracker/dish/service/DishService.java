package de.kathibrati.dishtracker.dish.service;

import de.kathibrati.dishtracker.dish.model.entity.Dish;
import de.kathibrati.dishtracker.dish.mapping.DishMapper;
import de.kathibrati.dishtracker.dish.model.resource.DishResource;
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

    public List<DishResource> getAllDishes() {
        return dishRepository.findAll()
                .stream()
                .map(DishMapper::toDishResource)
                .toList();
    }

    public Optional<DishResource> getDishById(Long id) {
        return dishRepository.findById(id).map(DishMapper::toDishResource);
    }

    public DishResource createDish(Dish dish) {
        Dish savedDish = dishRepository.save(dish);
        return DishMapper.toDishResource(savedDish);
    }

    public void deleteDish(Long id) {
        dishRepository.deleteById(id);
    }
}