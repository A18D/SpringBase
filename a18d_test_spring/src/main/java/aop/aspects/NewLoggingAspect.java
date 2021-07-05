package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

/*
    @Around("execution(public String returnBook())")
    public void aroundReturnBookLoggingAdvice(){
        System.out.println("Возврат книги в библиотеку");
    }
*/

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("в библиотеку пытаются вернуть книгу");
        long beginTime = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("было поймано исключение: " + e);
            targetMethodResult = "Неизвестное название книги";
            throw e;
        }
        System.out.println("Время работы метода  returnBook (мс): " + (System.currentTimeMillis() - beginTime));
        System.out.println("в библиотеку успешно вернули книгу");
        return targetMethodResult;
    }
}
