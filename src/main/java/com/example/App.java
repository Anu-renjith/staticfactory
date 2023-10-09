package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
Animal n=(Animal) cont.getBean("an");
n.sound();    
}
}
