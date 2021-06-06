package com.jianjoy.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: zhoujian
 * Description:
 * Date: 2021/6/6 16:06
 */
@Configuration
public class PrinterConfig {

    @Bean
    public Printer printer() {
        return new Printer();
    }
}