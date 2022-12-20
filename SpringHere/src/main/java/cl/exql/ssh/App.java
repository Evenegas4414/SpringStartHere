package cl.exql.ssh;

import cl.exql.ssh.animals.Parrot;
import cl.exql.ssh.animals.Person;
import cl.exql.ssh.configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This project is about Spring Start Here Book.
 * Chapter 2
 *
 * @author Exequiel Venegas
 * @version 1.1
 * @since 2022-12-17 shh v1.2
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello Spring!");

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var goodPerson = context.getBean("person1", Person.class);
        System.out.println("Person's name: " + goodPerson.getName());

        var yellowParrot = context.getBean("parrot1", Parrot.class);
        System.out.println("Parrot's name: " + yellowParrot.getName());

        System.out.println(goodPerson.getName() + "'s parrot: " +goodPerson.getParrot().getName());


    }
}
