package com.jianjoy.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: zhoujian
 * Description: xml bean定义
 * Date: 2021/6/6 16:17
 */
public class XmlDefinedBeanApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("context.xml");
        Printer myPrinter = xmlApplicationContext.getBean("myPrinter", Printer.class);
        myPrinter.print();
    }
}