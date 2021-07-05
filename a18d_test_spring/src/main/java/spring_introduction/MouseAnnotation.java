package spring_introduction;

import org.springframework.stereotype.Component;

/*import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;*/

@Component("myPet")
public class MouseAnnotation implements IPet {
    public MouseAnnotation() {
        System.out.println("created mouse");
    }

    @Override
    public void say() {
        System.out.println("Пи пи пи");
    }

/*
    @PostConstruct
    public void init() {
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method");
    }
*/

}
