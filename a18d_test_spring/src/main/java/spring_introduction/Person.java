package spring_introduction;

import org.springframework.beans.factory.annotation.Value;

public class Person {
    private IPet pet;
    @Value("${person.age}")
    private int age;
    @Value("${person.surname}")
    private String surname;

    public Person(IPet pet) {
        System.out.println("created person");
        this.pet = pet;
    }

    public void setPet(IPet pet) {
        System.out.println("pet has setted");
        this.pet = pet;
    }

    public void setAge(int age) {
        System.out.println("Hi, my age!!!");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Hi, my surname!!!");
        this.surname = surname;
    }

    public void callYourPet(){
        System.out.println("Hi, my pet!!!");
        pet.say();
    }
}
