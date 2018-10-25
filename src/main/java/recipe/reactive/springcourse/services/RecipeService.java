package recipe.reactive.springcourse.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import recipe.reactive.springcourse.commands.RecipeCommand;
import recipe.reactive.springcourse.domain.Recipe;

public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand> saveRecipeCommand(RecipeCommand command);

    Mono<Void> deleteById(String idToDelete);
}
