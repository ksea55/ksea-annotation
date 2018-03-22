package com.ksea.spring.chapter14.aop.chapter1;

/**
 * 数学计算类
 * 用于处理数学中的 加减乘除业务规则
 * 也就是我们说的业务逻辑类，专门处理业务的
 */
public class MathCalculation {

    /**
     * 计算两个数相除的结果
     *
     * @param x 被除数
     * @param y 除数
     * @return 结果
     */
    public Integer div(int x, int y) {

        System.out.println("MathCalculation.div is start calcultoring....");

        return x / y;
    }
}
