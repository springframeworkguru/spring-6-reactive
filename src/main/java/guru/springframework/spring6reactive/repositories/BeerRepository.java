package guru.springframework.spring6reactive.repositories;

import guru.springframework.spring6reactive.domain.Beer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerRepository extends ReactiveCrudRepository<Beer, Integer> {
}
