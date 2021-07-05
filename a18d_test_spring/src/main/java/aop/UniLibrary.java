package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("We take the book from UniLibrary");
    }

    public void getPen(String penName) {
        System.out.println("We are take the pen " + penName + " from UniLibrary");
    }

    public void getBook2(Book book) {
        System.out.println("We are take the book2 " + book.getBookName() + " from UniLibrary");
    }

    public void getBook3() {
        System.out.println("We are take the book3 from UniLibrary");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We are add the book");
    }

    public String returnBook() {
        int err = 1/0;
        System.out.println("We are return book");
        return "Война и мир";
    }
}
