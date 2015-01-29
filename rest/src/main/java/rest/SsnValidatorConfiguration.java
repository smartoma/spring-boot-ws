package rest;

import no.kantega.id.no.NorwegianIdNumber;
import org.springframework.context.annotation.Profile;

import static no.kantega.id.no.NorwegianIdNumber.forId;

/**
 * Oppgave 2.
 * Her lager man validator-tjenesten.
 * Din jobb er å få Spring til å forstå at vi lager Spring-beans her.
 * Rør ikke på @Profile-annotering !
 * Nøkkelord:
 * - @Configuration
 * - @Bean
 */
public class SsnValidatorConfiguration {

    @Profile("default")
    public SsnValidator defaultValidator() {
        return ssn -> forId(ssn).isValid(NorwegianIdNumber::valid);
    }

    /**
     * Oppgave 3.
     * Her skal du lage 2 ekstra implementasjoner av SsnValidator, og markere dem
     * etter profilnavn (fi, se). Funksjonalitet for hver validator skal tilsvare
     * personnummer validering for ethvert land.
     * Nøkkelord:
     * - @Profile
     */
}
