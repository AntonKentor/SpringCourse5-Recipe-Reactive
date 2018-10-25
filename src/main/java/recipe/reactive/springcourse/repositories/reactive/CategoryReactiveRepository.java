package recipe.reactive.springcourse.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import recipe.reactive.springcourse.domain.Category;

public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

    Mono<Category> findByDescription(String description);
}
