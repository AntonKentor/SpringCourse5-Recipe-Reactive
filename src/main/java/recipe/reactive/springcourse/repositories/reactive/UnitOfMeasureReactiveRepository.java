package recipe.reactive.springcourse.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import recipe.reactive.springcourse.domain.UnitOfMeasure;

public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {

    Mono<UnitOfMeasure> findByDescription(String description);
}
