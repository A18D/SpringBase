package org.example;

import org.example.dao.impls.SQLiteDAO;
import org.example.dao.objects.Author;
import org.example.dao.objects.MP3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MP3 firstMP3 = new MP3();
        firstMP3.setName("Song N55");

        Author author = new Author();
        author.setName("Justin");

        firstMP3.setAuthor(author);
        //
        // MP3 secondMP3 = new MP3();
        // secondMP3.setName("Song name2");
        // secondMP3.setAuthor("Song author2");
        //
        // List<MP3> list = new ArrayList<>();
        //
        // list.add(firstMP3);
        // list.add(secondMP3);
        //
        // // new SQLiteDAO().insertWithJDBC(mp3);
        //
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");

        System.out.println(sqLiteDAO.insertMP3(firstMP3));

        ((ConfigurableApplicationContext) context).close();// закрытие контекста вручную
    }
}
