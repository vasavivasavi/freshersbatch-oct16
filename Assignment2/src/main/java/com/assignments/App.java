package com.assignments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Question.xml");
        
        Question qsn=(Question) context.getBean("question");
        qsn.displayAnswerList();
        
        Question qns1=(Question) context.getBean("question1");
        qns1.displayAnswerSet();
        
        Question qns2=(Question) context.getBean("question2");
        qns2.displayAnswerMap();
 }
}