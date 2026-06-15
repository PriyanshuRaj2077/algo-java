package com.Priyanshu.Titans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TitansApplication {

	public static void main(String[] args) {
        ApplicationContext context	=  SpringApplication.run(TitansApplication.class, args);

        astra obj = context.getBean(astra.class);
        obj.Build();
    }

}
