package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("ownerBean")
public class OwnerAnnotation {
    @Autowired
    @Qualifier("myPet")
    private IPet pet;
    @Value("${person.age}")
    private int age;
    @Value("${person.surname}")
    private String surname;

    /*
        @Autowired
        public OwnerAnnotation(IPet pet) {
            System.out.println("created owner");
            this.pet = pet;
        }
    */
/*
    @Autowired
    public void setPet(IPet pet) {
        System.out.println("pet has setted");
        this.pet = pet;
    }
*/

/*
    @Autowired
    public void anyMethod(IPet pet) {
        System.out.println("pet has setted by anyMethod");
        this.pet = pet;
    }
*/

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

    public void callYourPet() {
        System.out.println("Hi, my pet!!!");
        pet.say();
    }
}
