package com.training.pracSpringStart;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppStarter 
{
    public static void main( String[] args )
    {
        //Step1-Load the contexts
    	ClassPathXmlApplicationContext cntxt= new ClassPathXmlApplicationContext("config.xml");
        	
    	Teacher teacher=cntxt.getBean("theTeacher",Teacher.class);
    	teacher.teach();
    	
//    	List<Teacher> teachers=cntxt.getBeansOfType(,Teacher.class)

    }
}
