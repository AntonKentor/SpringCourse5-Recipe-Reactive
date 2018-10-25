package recipe.reactive.springcourse.services;

import reactor.core.publisher.Flux;
import recipe.reactive.springcourse.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
