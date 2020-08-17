package io.gspear.moviecatalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "/catalogs")
public class CatalogController {
    @GetMapping(path = "/{id}")
    public List<Catalog> getMovieCatalogs(@PathVariable("id") String id) {
        return Collections.singletonList(Catalog.builder()
                .name("Gunjan Saxena")
                .description("Story of a IAF women during Kargil times")
                .rating(5).build());


    }
}
