package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {
/*
    @Before("execution(public void aop.UniLibrary.getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("Attempt get book");
    }

    @Before("execution(public void aop.UniLibrary.getPen(String))")
    public void beforeGetPenAdvice() {
        System.out.println("Attempt get pen");
    }

    @Before("execution(public void *(..))")
    public void beforeGetAnyAdvice() {
        System.out.println("Attempt get any object");
    }

    @Before("execution(public void getBook2(aop.Book))")
    public void beforeGetBook2Advice() {
        System.out.println("Attempt get book2 ");
    }


    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("Attempt return book");
    }
*/

}
