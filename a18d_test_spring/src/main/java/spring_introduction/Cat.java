package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cat implements IPet{
    public Cat(){
        System.out.println("created cat");
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
