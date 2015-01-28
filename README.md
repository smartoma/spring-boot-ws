Spring boot workshop for Kantega

Presentasjon: http://slides.com/smartoma/spring-boot#/ 

Oppgaver
----------------------------------------
1. Lage en war-fil å servere index.html
   - @controller
   - @RequestMapping
   - Kjør fra:
     - spring-boot:run
     - IDE (anbefalt)
     - deploy til Tomcat/Jetty
   -Test som skal passere

2. Lage en REST-service for å validere personnummer.
   - true/false fra /rest/ssn/validation/<ssn>
   - @RestController
   - @RequestMapping
   - Kjør fra:
      - java -jar
      - IDE
   - Test som skal passere
   - Test manuelt med postman/curl

3. Variere validering etter profil
   - @Profile
   - @Configuration
   - spring.profiles.active (sys. prop, env. prop)

4. Legg til Spring actuator
   - /health, /info
