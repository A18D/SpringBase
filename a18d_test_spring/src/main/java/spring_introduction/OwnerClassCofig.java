package spring_introduction;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;*/

//@Component("ownerConfig")
public class OwnerClassCofig {
    private IPet pet;

    //@Autowired
    public OwnerClassCofig(//@Qualifier("myPet")
                                   IPet pet) {
        System.out.println("created oowner class config");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hi, my pet!!!");
        pet.say();
    }
}
