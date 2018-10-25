package recipe.reactive.springcourse.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import recipe.reactive.springcourse.commands.UnitOfMeasureCommand;
import recipe.reactive.springcourse.converters.UnitOfMeasureToUnitOfMeasureCommand;
import recipe.reactive.springcourse.repositories.reactive.UnitOfMeasureReactiveRepository;

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {

    private final UnitOfMeasureReactiveRepository unitOfMeasureReactiveRepository;
    private final UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand;

    public UnitOfMeasureServiceImpl(UnitOfMeasureReactiveRepository unitOfMeasureReactiveRepository, UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand) {
        this.unitOfMeasureReactiveRepository = unitOfMeasureReactiveRepository;
        this.unitOfMeasureToUnitOfMeasureCommand = unitOfMeasureToUnitOfMeasureCommand;
    }

    @Override
    public Flux<UnitOfMeasureCommand> listAllUoms() {

        return unitOfMeasureReactiveRepository
                .findAll()
                .map(unitOfMeasureToUnitOfMeasureCommand::convert);

//        return StreamSupport.stream(unitOfMeasureReactiveRepository.findAll()
//                .spliterator(), false)
//                .map(unitOfMeasureToUnitOfMeasureCommand::convert)
//                .collect(Collectors.toSet());
    }
}
