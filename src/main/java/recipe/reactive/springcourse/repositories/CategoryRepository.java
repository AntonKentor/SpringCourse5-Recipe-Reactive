package recipe.reactive.springcourse.repositories;

import org.springframework.data.repository.CrudRepository;
import recipe.reactive.springcourse.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);
}
