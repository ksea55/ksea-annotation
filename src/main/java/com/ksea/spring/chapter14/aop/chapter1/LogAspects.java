package com.ksea.spring.chapter14.aop.chapter1;


import com.sun.org.apache.xpath.internal.operations.Div;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 定义日志切面切入类
 */
@Aspect // @Aspect 标注该类是一个特殊的类，切面切入类
public class LogAspects {


    //抽取切入点
    @Pointcut("execution(* com.ksea.spring.chapter14.aop.chapter1.MathCalculation.*(..))")
    private void pointcutDefind() {
    }

    ;

    /**
     * 前置通知，在方法开始之前进行切入
     *
     * @Before("com.ksea.spring.chapter14.aop.chapter1.MathCalculation.div()")后面写入切面表达式,此处写的是具体的某个一般我们写某配置
     */
    // @Before("execution(* com.ksea.spring.chapter14.aop.chapter1.MathCalculation.*(..))")
    @Before(value = "pointcutDefind()")//根据切入点方法进行配置切入
    public void logStart(JoinPoint joinPoint) {
        //获取切入的目标类类名
        Object target = joinPoint.getTarget();
        String className = target.getClass().getName();

        //获取方法签名
        String methodName = joinPoint.getSignature().getName();

        //获取参数列表
        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("开始进行" + className + " 的 " + methodName + "方法,其参数列表[" + args + "] 进行开始切入...........");
    }

    /**
     * 后置通知，在方法结束进行切入，不管方法是正常结束还是异常结束
     */
    @After("com.ksea.spring.chapter14.aop.chapter1.LogAspects.pointcutDefind()") //通过切入点全路径进行配置
    public void logEnd(JoinPoint joinPoint) {
        //获取切入的目标类类名
        Object target = joinPoint.getTarget();
        String className = target.getClass().getName();

        //获取方法签名
        String methodName = joinPoint.getSignature().getName();

        //获取参数列表
        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("开始进行对" + className + " 的 " + methodName + "方法,其参数列表[" + args + "] 进行结束切入...........");
    }


    /**
     * 方法返回值返回的时候进行切入
     * returning = "returnValue" 这名返回值用什么接收
     * 这里需注意的是，连接点参数放在前面
     * <p>
     * public void logReturn(Object returnValue,JoinPoint joinPoint)这样是错误的方式
     */
    @AfterReturning(value = "pointcutDefind()", returning = "returnValue")
    public void logReturn(JoinPoint joinPoint, Object returnValue) {
        //获取切入的目标类类名
        Object target = joinPoint.getTarget();
        String className = target.getClass().getName();

        //获取方法签名
        String methodName = joinPoint.getSignature().getName();

        //获取参数列表
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("开始进行" + className + " 的 " + methodName + "方法,其参数列表[" + args + "] 进行返回值切入，结果是:" + returnValue + "...........");
    }


    /**
     * 方法抛出异常进行切入
     */
    @AfterThrowing(value = "pointcutDefind()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        //获取切入的目标类类名
        Object target = joinPoint.getTarget();
        String className = target.getClass().getName();

        //获取方法签名
        String methodName = joinPoint.getSignature().getName();

        //获取参数列表
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("开始进行" + className + " 的 " + methodName + "方法其参数列表[" + args + "] 进行异常切入,其异常信息:" + exception + "...........");
    }


    /**
     * 环绕通知 ,在环绕通知中，其ProceedingJoinPoint proceedingJoinPoint 必须是参数列表中的第一个
     *
     * @param proceedingJoinPoint
     */
    @Around("pointcutDefind()")
    public Object aroundEvent(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {


        //目标类名称
        Object target = proceedingJoinPoint.getTarget();
        String className = target.getClass().getName();

        //方法前面
        String methodName = proceedingJoinPoint.getSignature().getName();

        //参数列表
        List<Object> args = Arrays.asList(proceedingJoinPoint.getArgs());


        System.out.println("开始进行" + className + " 的 " + methodName + "方法其参数列表[" + args + "] 进行异常切入环绕通知.............");


        //开始执行 获取执行的返回值
        Object returnValue = proceedingJoinPoint.proceed();


        System.out.println("开始进行" + className + " 的 " + methodName + "方法其参数列表[" + args + "],执行之后的返回值:" + returnValue + " 进行异常切入环绕通知.............");


        //将返回值进行返回，这样@AfterReturning就能获取到返回值，如果这里不返回的，它获取的就是null
        return returnValue;
    }

}
