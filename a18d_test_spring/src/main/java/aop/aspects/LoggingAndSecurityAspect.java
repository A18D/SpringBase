package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
/*
    @Pointcut("execution( * get*())")
    private void allGetMethods() {

    }

    @Before("allGetMethods()")
    public void beforeGetBook3Advice() {
        System.out.println("Attempt get book3 ");
    }
*/

}
