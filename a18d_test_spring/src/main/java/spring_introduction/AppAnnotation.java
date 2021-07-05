package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
/*
        IPet Pet = context.getBean("myPet", IPet.class);
        Pet.say();
*/
        OwnerAnnotation owner = context.getBean("ownerBean", OwnerAnnotation.class);
        owner.callYourPet();
        System.out.println("age: " + owner.getAge());
        System.out.println("surName: " + owner.getSurname());
        context.close();

    }
}
