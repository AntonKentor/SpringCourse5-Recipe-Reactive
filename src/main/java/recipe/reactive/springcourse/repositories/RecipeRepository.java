package recipe.reactive.springcourse.repositories;

import org.springframework.data.repository.CrudRepository;
import recipe.reactive.springcourse.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
