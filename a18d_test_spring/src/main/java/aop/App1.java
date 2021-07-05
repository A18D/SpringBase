package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.getPen(" шариковую ");
        uniLibrary.returnBook();

        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook2(book);
        uniLibrary.getBook3();
        uniLibrary.addBook("Салтыков Щедрин", book);
        ScoolLibrary scoolLibrary = context.getBean("scoolLibrary", ScoolLibrary.class);
        scoolLibrary.getBook();
        context.close();
    }
}
