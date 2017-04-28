package yuan.spring.boot.springsource.aoptest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by yuanxin on 17/4/12.
 */
@Aspect
@Component
public class AspectJTest
{
    private Logger logger = Logger.getLogger(AspectJTest.class);
    @Pointcut("execution(public * yuan.spring.boot.test.springsource.aoptest.*.test(..))")
    public void test(){
        logger.info("我们大中国啊");
    }

    @Before("test()")
    public void beforeTest(){
        logger.info("beforegreeting");
    }

    @After("test()")
    public void afterTest(){
        logger.info("aftergreeting");
    }

    @Around("test()")
    public Object  aroundTest(ProceedingJoinPoint p){
        logger.info("befoe 1");
        Object o = null;
        try
        {
            Object[] args = p.getArgs();
            o = p.proceed();
            logger.info("我们大中国啊"+o);
        }catch (Throwable e){
            e.printStackTrace();
        }
        logger.info("after 1");
        return o;
    }


}
