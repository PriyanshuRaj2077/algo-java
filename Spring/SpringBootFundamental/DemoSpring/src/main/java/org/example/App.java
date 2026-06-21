package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev)context.getBean(Dev.class);
        obj.Build();
//        obj.setAge(34); so finally i can code over it without any issue okj
//        System.out.println(obj.getAge());
    }
}
