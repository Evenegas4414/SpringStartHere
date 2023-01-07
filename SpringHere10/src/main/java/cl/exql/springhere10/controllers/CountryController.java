package cl.exql.springhere10.controllers;

import cl.exql.springhere10.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france() {
        Country c = Country.of("France", 67);
        return c;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Country>> all() {
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Italy", 59);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .body(List.of(c1, c2));
    }

}
