package spring_introduction;

public class Dog implements IPet {
    public Dog() {
        System.out.println("created dog");
    }

    @Override
    public void say() {
        System.out.println("Гав");
    }

    public void init() {
        System.out.println("init method");
    }

    public void destroy() {
        System.out.println("destroy method");
    }

}
