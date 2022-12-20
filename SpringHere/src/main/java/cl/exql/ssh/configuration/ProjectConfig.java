package cl.exql.ssh.configuration;

import cl.exql.ssh.animals.Parrot;
import cl.exql.ssh.animals.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * The <code>ProjectConfig</code> class contains the spring's configuration.
 *
 * @author Exequiel Venegas
 * @version 1.0
 * @since 2022-12-17 ssh v1.2
 */

@Configuration
public class ProjectConfig {

    @Primary
    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Primary
    @Bean
    Person person1() {
        var p = new Person();
        p.setName("Koni");
        p.setParrot(parrot1());
        return p;
    }

}

