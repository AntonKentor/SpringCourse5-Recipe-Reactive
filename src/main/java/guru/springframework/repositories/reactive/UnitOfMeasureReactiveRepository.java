package guru.springframework.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import guru.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String> {

    Mono<UnitOfMeasure> findByDescription(String description);
}
