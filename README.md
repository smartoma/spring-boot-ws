Spring boot workshop for Kantega

Presentasjon: http://slides.com/smartoma/spring-boot#/ 

Oppgaver
------------------------
#### Alle oppgaver skal kjøres med Java 1.8

1. Kjør spring-boot for å servere index.html og angular-app.
   - WebApplicationTest demonstrerer integrasjontester i Spring. **Du må fikse den først!**
   - Prøv å kjøre applikasjonen på ulike måter:
     - *mvn spring-boot:run*
     - *IDE (anbefalt)* (WebApplication klasse har main-method, bruk den).
     - Deploy til Tomcat/Jetty (hvis du har ekstra tid etter alle andre oppgaver).
   - Gå til [http://localhost:8080/index.html](http://localhost:8080/index.html). Applikasjonen skal svare server error siden REST-tjenesten svarere ikke. 

2. Lage en REST-service for å validere personnummer.
   - Den skal retunere JSON true/false  fra /rest/ssn/validation/\<ssn>
   - Fiks ValidatorController klasse slik at den svarer JSON fra URL ovenfor.
   - Fiks SsnValidatorConfiguration klasse slik at den gir oss Spring-bean som implementerer SsnValidator (med lambda).
   - Kjør fra:
      - *java -jar target/ssn-rest-service-0.1.0.jar* 
      - *IDE* (Application klasse har main-method).
   - Test manuelt med postman/curl/browser [http://localhost:8081/rest/ssn/validation/\<ssn>](http://localhost:8081/rest/ssn/validation/\<ssn>) 

3. Variering av validering etter aktiv profil.
   - Lage nye yml-filer for hver profil med navn pattern: application-\<profilnavn>.yml
   - Det blir 2 ekstra profiler som skal hete "fi" og "se". Norge er "default" (lagt allerede).
   - Det blir 2 tilsvarende ekstra tjenester som validerer ssn for Finland og Sverige.
   - Aktivering av profil kan gjøres med system.prop som heter *spring.profiles.active*
   - Det er også mulig å bruke miljø-variabler for aktivering.
   - Kjør applikasjonen som før, og test at ulike profiler virker.
   - Gyldige personnummer til Finland for testing: 270274-885N, 111243-1335, 221087-1374
   - For Sverige: 080618+8934,920229-7769,080625+9586

4. Legg til Spring actuator, bonus oppgave.
  - Prøv å få actuator på plass. 
  - Skal svare på /health og /info
  - [http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready](Mer info om spring-actuator)
