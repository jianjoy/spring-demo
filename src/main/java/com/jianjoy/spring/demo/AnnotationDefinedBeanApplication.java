package com.jianjoy.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: zhoujian
 * Description: 注解装配
 * Date: 2021/6/6 16:06
 */
public class AnnotationDefinedBeanApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrinterConfig.class);
        Printer printer = context.getBean(Printer.class);
        printer.print();
    }
}