package com.upsoft.v3.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
 
public class DemoProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}