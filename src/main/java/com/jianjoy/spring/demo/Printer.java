package com.jianjoy.spring.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * Author: zhoujian
 * Description:
 * Date: 2021/6/6 16:04
 */
@Slf4j
public class Printer {


    public void print() {
        log.info("开始打印：");
        log.info("打印正文：测试打印内容。");
        log.info("打印结束。");
    }
}