package guru.springframework.spring6reactive.controllers;

import guru.springframework.spring6reactive.model.BeerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by jt, Spring Framework Guru.
 */
@RestController
public class BeerController {

    public static final String BEER_PATH = "/api/v2/beer";

    @GetMapping(BEER_PATH)
    Flux<BeerDTO> listBeers(){
        return Flux.just(BeerDTO.builder().id(1).build(),
                BeerDTO.builder().id(2).build());
    }

}
