package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aapplicationContextScope.xml");
        IPet pet = context.getBean("myPet", IPet.class);
        pet.say();
        context.close();

    }
}
