package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* gEtStudents())")
    public void beforeGetStudentsLggingAdvice() {
        System.out.println("ПредЛогируем получение списка студентов");
    }

    @AfterReturning(pointcut = "execution(* gEtStudents())",
            returning = "students")
    public void afterReturningGetStudentsLggingAdvice(List<Student> students) {
        Student std1 = students.get(0);
        String nameStudent = "Mr. " + std1.getName();
        std1.setName(nameStudent);

        double avgGrade = 10 + std1.getAvgGrade();
        std1.setAvgGrade(avgGrade);

        System.out.println("ПостЛогируем получение списка студентов");
    }

    @AfterThrowing(pointcut = "execution(* gEtStudents())",
            throwing = "exception")
    public void afterThrowingGetStudentsLggingAdvice(Throwable exception) {
        //System.out.println("Логируем выброс исключения: " + exception);
    }

    @After("execution(* gEtStudents())")
    public void afterGetStudentsLggingAdvice() {
        System.out.println("Логируем нормальное окончание работы метода или выброс исключения");
    }


}
