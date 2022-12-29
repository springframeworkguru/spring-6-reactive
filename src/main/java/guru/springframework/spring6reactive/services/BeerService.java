package guru.springframework.spring6reactive.services;

import guru.springframework.spring6reactive.model.BeerDTO;
import reactor.core.publisher.Flux;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerService {

    Flux<BeerDTO> listBeers();
}
