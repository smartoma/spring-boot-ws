package rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Oppgave 2.
 * Dette er vår REST-tjeneste og skal dermed snakke JSON.
 * Du må mappe denne klassen mot riktig url + pathvariable.
 * Nøkkelord:
 * - @RestController
 * - @RequestMapping
 */
public class ValidatorController {

    @Value("${country}")
    private String country;

    @Autowired
    private SsnValidator validator;

    @RequestMapping(method = GET, produces = APPLICATION_JSON_VALUE)
    public ValidationResult validate(@PathVariable final String ssn) {
        return new ValidationResult(validator.validate(ssn), country);
    }
}
