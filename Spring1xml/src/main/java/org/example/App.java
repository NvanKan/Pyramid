package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class App{

    public static void main(String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SprStd.xml");
        Student studentObj = (Student)context.getBean("student");
        Phone phoneObj = (Phone)context.getBean("phone");
        Address addressObj = (Address)context.getBean("address");


        System.out.println(studentObj);
        System.out.println(phoneObj);
        System.out.println(addressObj);
    }
}
