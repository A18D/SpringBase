package spring_introduction;

//import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public IPet dogBean() {
        System.out.println("created bean by dog");
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Person personBean() {
        return new Person(dogBean());
    }
}
