package com.assignments.Assignment8910;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("HelloWorld.xml");
        HelloWorld hw = context.getBean(HelloWorld.class);
        System.out.println(hw.getMessage());
        context.registerShutdownHook();
    }
}

