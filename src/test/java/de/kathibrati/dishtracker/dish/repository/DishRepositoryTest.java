package de.kathibrati.dishtracker.dish.repository;

import de.kathibrati.dishtracker.dish.model.entity.Dish;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)  // ✅ Verhindert Überschreiben der DB
class DishRepositoryTest {

    @Autowired
    private DishRepository dishRepository;

    @Test
    void shouldSaveDish() {
        Dish dish = new Dish();
        dish.setName("Test Dish");
        dish.setServings(2);

        Dish savedDish = dishRepository.save(dish);
        assertThat(savedDish.getId()).isNotNull();
    }
}