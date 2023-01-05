package com.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
  ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
    Customer customer = context.getBean(Customer.class);

    System.out.println("Customer Id: "+customer.getId());
    System.out.println("Customer Name: "+customer.getName());
    System.out.println("Customer Contact: "+customer.getContact());
    System.out.println("Customer Address: "+customer.getAddress());
    }	
    }