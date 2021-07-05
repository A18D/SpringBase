package aop;

import org.springframework.stereotype.Component;

@Component
public class ScoolLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("We take the book from ScoolLibrary");
    }
}
