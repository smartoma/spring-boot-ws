package rest;

import no.kantega.id.no.NorwegianIdNumber;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static no.kantega.id.no.NorwegianIdNumber.forId;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/rest/ssn/validation/{ssn}")
public class ValidatorController {

    @RequestMapping(method = GET, produces = APPLICATION_JSON_VALUE)
    public ValidationResult validate(@PathVariable String ssn) {
        return new ValidationResult(
            forId(ssn).isValid(NorwegianIdNumber::valid),"Norge");
    }
}
