package recipe.reactive.springcourse.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import recipe.reactive.springcourse.domain.Recipe;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}
