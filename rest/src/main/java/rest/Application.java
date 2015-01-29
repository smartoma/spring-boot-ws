package rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private Environment environment;

    @PostConstruct
    public void initApplication()  {
        log.info("Active profiles: " + Arrays.toString(environment.getActiveProfiles()));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
