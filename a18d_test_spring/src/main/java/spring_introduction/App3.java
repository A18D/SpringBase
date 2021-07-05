package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aapplicationContext.xml");
        //IPet pet = context.getBean("myPet", IPet.class);

        //IPet pet = new Dog();
        //Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();
        System.out.println("age = " + person.getAge());
        System.out.println("surname = " + person.getSurname());
        context.close();
    }
}
