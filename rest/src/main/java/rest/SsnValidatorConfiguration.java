package rest;

import no.kantega.id.fin.FinnishIdNumber;
import no.kantega.id.no.NorwegianIdNumber;
import no.kantega.id.se.SwedishIdNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static no.kantega.id.no.NorwegianIdNumber.forId;

@Configuration
public class SsnValidatorConfiguration {

    @Profile("default")
    @Bean
    public SsnValidator defaultValidator() {
        return ssn -> forId(ssn).isValid(NorwegianIdNumber::valid);
    }

    @Profile("fi")
    @Bean
    public SsnValidator finnishValidator() {
        return ssn -> forId(ssn).isValid(FinnishIdNumber::valid);
    }

    @Profile("se")
    @Bean
    public SsnValidator swedishValidator() {
        return ssn -> forId(ssn).isValid(SwedishIdNumber::valid);
    }
}
