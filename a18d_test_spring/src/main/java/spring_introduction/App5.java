package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println("age = " + person.getAge());
        System.out.println("surname = " + person.getSurname());
        Person person2 = context.getBean("personBean", Person.class);
        person.callYourPet();
        person2.callYourPet();
/*
        IPet pet1 = context.getBean("dogBean", IPet.class);
        IPet pet2 = context.getBean("dogBean", IPet.class);
*/
        //pet.say();
/*
        OwnerClassCofig person = context.getBean("ownerConfig", OwnerClassCofig.class);
        person.callYourPet();
*/
        context.close();
    }
}
