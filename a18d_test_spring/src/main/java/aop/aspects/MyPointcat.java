package aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyPointcat {
/*
    @Pointcut("execution( * add*(..))")
    private void allAddMethods() {

    }

    @Before("allAddMethods()")
    public void beforeAddBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        Object[] args = joinPoint.getArgs();

        for (Object o : args) {
            if (o instanceof aop.Book) {
                aop.Book myBook = (aop.Book) o;
                System.out.println("book name = " + myBook.getBookName());
                System.out.println("book author = " + myBook.getAuthor());
            } else
                System.out.println("o = " + o);

        }

        System.out.println("Attempt add book ");
    }
*/

}
