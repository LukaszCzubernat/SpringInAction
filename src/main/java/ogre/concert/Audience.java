package ogre.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

    @Pointcut("@annotation(Action)")
    public void action() {}

/*    @Pointcut("execution(* *(..)))")
    public void atExecution() {}*/

    @Pointcut("within(Performance+)")
    public void atExecution() {}

    @Pointcut("action() && atExecution()")
    public void performance() {}

/*    @Pointcut("execution(* Performance.perform(..))")
    private void performance(){}*/

/*    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Audience silencing their phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Audience taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("Bravo!! <clap>");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Boo! Give back our money");
    }*/

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("Audience silencing their phones");
            System.out.println("Audience taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("Bravo!! <clap>");
        } catch (Throwable e) {
            System.out.println("Boo! Give back our money");
        }
    }
}
