package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Обломов")
    private String bookName;

    @Value("Гончаров")
    private String author;

    @Value("1866")
    private int year;

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

}
