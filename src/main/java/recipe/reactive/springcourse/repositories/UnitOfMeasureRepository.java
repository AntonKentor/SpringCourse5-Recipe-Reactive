package recipe.reactive.springcourse.repositories;

import org.springframework.data.repository.CrudRepository;
import recipe.reactive.springcourse.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
