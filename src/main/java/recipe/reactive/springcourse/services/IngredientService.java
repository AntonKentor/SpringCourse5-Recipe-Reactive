package recipe.reactive.springcourse.services;

import reactor.core.publisher.Mono;
import recipe.reactive.springcourse.commands.IngredientCommand;

public interface IngredientService {

    Mono<IngredientCommand> findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    Mono<IngredientCommand> saveIngredientCommand(IngredientCommand command);

    Mono<Void> deleteById(String recipeId, String idToDelete);
}
